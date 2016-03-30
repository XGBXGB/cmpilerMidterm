grammar Land;
 
/*
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 */
 @parser::header{
 	import java.util.HashMap;
 }
 
 @parser::members{
 	HashMap memory = new HashMap();
 	
 }
 
 
 
 @lexer::members{
 	@Override
 	public void recover(LexerNoViableAltException e){
 		String text = _input.getText(Interval.of(_tokenStartCharIndex,_input.index()));
   /*throw new RuntimeException("Syntax error at position "+_tokenStartCharPositionInLine+" '"+text+"'");*/
 		/*throw new RuntimeException("Syntax error! Unable to compute for the answer.");*/
 		throw new RuntimeException("Lexical error! Unable to compute for the answer.\n"+text);
 	}	
 }
 
 //Data types and literals
data_type returns [String s]: INT_DATA_TYPE {$s = $INT_DATA_TYPE.text;}
							| FLOAT_DATA_TYPE {$s = $FLOAT_DATA_TYPE.text;}
							| STRING_DATA_TYPE {$s = $STRING_DATA_TYPE.text;}
							| CHAR_DATA_TYPE {$s = $CHAR_DATA_TYPE.text;};	
literal returns [Object o]: digit_literal 
							{
								$o = $digit_literal.o;
							} 
							| characters_literal
							{
								$o = $characters_literal.o;
							} ;
digit_literal returns [Object o]: INT_LIT 
								{
									$o=Integer.parseInt($INT_LIT.text);
								} 
								| FLOAT_LIT 
								{
									$o=Float.parseFloat($FLOAT_LIT.text);
								} ;
characters_literal returns [Object o]: STRING_LIT
								{
									$o = $STRING_LIT.text.replace("'", "");
								} 
							 	| CHAR_LIT
							 	{
							 		$o = $CHAR_LIT.text.replace("\"", "");
							 	};
return_type returns [String returnType]: data_type {$returnType = $data_type.s;}| VOID_DATA_TYPE {$returnType = "full";};
 	
//Constant declaration
constant_declaration: CONSTANT_TOKEN IDENTIFIER literal TERMINATOR_TOKEN;

//Variable declaration/initialization
var returns [String s]: IDENTIFIER {$s = $IDENTIFIER.text;}| array;
variable_declaration: data_type var more_variable_declaration[$data_type.s]
					{
						if($data_type.s.equals("float")){
							//todo if expression instanceof int else throw
							memory.put($var.s, new Integer(0));
						}else if($data_type.s.equals("int")){
							memory.put($var.s, new Float(0));
						}else if($data_type.s.equals("char")){
							memory.put($var.s, new String(""));
						}else if($data_type.s.equals("string")){
							memory.put($var.s, new Character('\0'));
						}
					}
					| data_type assignment_declaration[$data_type.s] more_variable_declaration[$data_type.s];
more_variable_declaration[String dataType]: COMMA_TOKEN var more_variable_declaration[$dataType] | COMMA_TOKEN assignment_declaration[$dataType] more_variable_declaration[$dataType] | TERMINATOR_TOKEN;

//Arrays
array: IDENTIFIER OPEN_BRACKET expression CLOSE_BRACKET;

//Assignment statement
assignment_declaration[String dataType]: assignment[$dataType] | assignment_array;
assignment_array: array ASSIGNMENT_OPERATOR OPEN_BRACE expression more_expressions CLOSE_BRACE;
assignment[String dataType]: var ASSIGNMENT_OPERATOR expression
							{
								if($dataType.equals("float")){
									//todo if expression instanceof int else throw
									if(!($expression.o instanceof Integer))
										throw new RuntimeException("expression not a float");
									memory.put($var.s, new Integer((int)$expression.o));
								}else if($dataType.equals("int")){
									if(!($expression.o instanceof Float))
										throw new RuntimeException("expression not an integer");
									memory.put($var.s, new Float((float)$expression.o));
								}else if($dataType.equals("char")){
									memory.put($var.s, new String((String)$expression.o));
								}else if($dataType.equals("string")){
									memory.put($var.s, new Character((char)$expression.o));
								}else if($dataType.equals("unknown type")){
									if(memory.get($var.s)==null){
									}else{
										if(memory.get($var.s) instanceof Integer){
											System.out.println("ASSIGNING INT");
											memory.put($var.s, new Integer((int)$expression.o));
										}else{
											System.out.println("ASSIGNING FLOAT");
											memory.put($var.s, new Float((float)$expression.o));
										} 
									}
								}
							};
assignment_line: assignment["unknown type"] TERMINATOR_TOKEN
				;

//Function declaration
function_declaration: return_type IDENTIFIER OPEN_PARENTHESIS function_declaration_parameters_type CLOSE_PARENTHESIS OPEN_BRACE code_block return_line[$return_type.returnType] CLOSE_BRACE;
function_declaration_parameters_type: function_declaration_parameters | /*epsilon*/;
function_declaration_parameters: return_type IDENTIFIER function_declaration_more_parameters;
function_declaration_more_parameters: COMMA_TOKEN function_declaration_parameters function_declaration_more_parameters | /*epsilon */;

//Function call
function_call: IDENTIFIER OPEN_PARENTHESIS function_call_parameters_type CLOSE_PARENTHESIS;
function_call_parameters_type: function_call_parameters | /*epsilon*/;
function_call_parameters: expression more_expressions;
function_call_line: function_call TERMINATOR_TOKEN;

//Conditional
conditional: IF_TOKEN OPEN_PARENTHESIS expression CLOSE_PARENTHESIS OPEN_BRACE code_block CLOSE_BRACE conditional_continue;
conditional_continue: ELSE_TOKEN conditional | ELSE_TOKEN OPEN_BRACE code_block CLOSE_BRACE | ;

//Event-controlled loop
wloop
@init
    {
        int mark;
    }
: WHILE_TOKEN OPEN_PARENTHESIS e1=expression CLOSE_PARENTHESIS OPEN_BRACE {mark = _input.index();}code_block 
	{
        if ((boolean)$e1.o) {
        	System.out.println("FUCK FUCK FUCK: "+mark);
            _input.seek(mark);
        }else{
        	_input.release(mark);
        }
    }
CLOSE_BRACE
	  //{
	 //	if($expression.o instanceof Integer)
	 // }
	 ;

//Repeat-until loop
dloop: DO_TOKEN OPEN_BRACE code_block CLOSE_BRACE WHILE_TOKEN OPEN_PARENTHESIS expression CLOSE_PARENTHESIS TERMINATOR_TOKEN;

//Count-controlled loop

floop
@init
    {
        String c = "";
        int mark = _input.mark();
    }
@after
    {
        if ((boolean)$e1.o) {
            _input.seek(mark);
        }
    }
: FOR_TOKEN OPEN_PARENTHESIS n1=expression TERMINATOR_TOKEN e1=expression TERMINATOR_TOKEN expression CLOSE_PARENTHESIS OPEN_BRACE code_block CLOSE_BRACE
    {
       
    }
;


//Perform operation	rules	


perform_op returns [Object value]: perform_op OR_OPERATOR perform_op2 | n3=perform_op2{$value = $n3.value; };

perform_op2 returns [Object value]: perform_op2 AND_OPERATOR perform_op3 | n3=perform_op3{$value = $n3.value; };

perform_op3 returns [Object value]: NOT_OPERATOR perform_op3 | n3=perform_op4{$value = $n3.value; };

perform_op4 returns [Object value]: n1=perform_op4 cond_op n2=perform_op5 
									{
										float v1, v2;
										if($n1.value instanceof Float){
											v1 = (float) $n1.value;
										}else{
											v1 = 1.0f * (int) $n1.value;
										}
										if($n2.value instanceof Float){
											v2 = (float) $n2.value;
										}else{
											v2 = 1.0f * (int) $n2.value;
										}
											
										if($cond_op.text.equals("::")){
											if(v1 != v2)
												$value = true;
											else
												$value = false;
										} 
										else if($cond_op.text.equals(";:")){
											if(v1 == v2)
												$value = true;
											else
												$value = false;
										}
										else if($cond_op.text.equals(":<")){
											if(v1 > v2)
												$value = true;
											else
												$value = false;
										}
										else if($cond_op.text.equals(":>")){
											if(v1 < v2)
												$value = true;
											else
												$value = false;
										}
										else if($cond_op.text.equals("<")){
											if(v1 >= v2)
												$value = true;
											else
												$value = false;
										}
										else if ($cond_op.text.equals(">")){
											if(v1 <= v2)
												$value = true;
											else
												$value = false;
										}
									}
									| n3=perform_op5{$value = $n3.value; };
									
				
perform_op5 returns [Object value] : n1=perform_op5 n2=perform_op6
							   { 
								if($n2.text.startsWith("+") || $n2.text.startsWith("-"))
								{
									if($n1.value instanceof Float || $n2.value instanceof Float)
										$value = (float)$n1.value + (float)$n2.value;
									else{
										System.out.println($n1.value+" "+$n2.value);
										$value = (int)$n1.value + (int)$n2.value;
										
									}
									/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
										throw new ArithmeticException("Value out of range for integer");
									}else{
										$value = (int)$n1.value + (int)$n2.value;
									}
									if($n1.value < 0 && $n2.value < 0 && $value > 0){
										throw new ArithmeticException("Value out of range for integer");
									}*/
								} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
							   }
							   | 
							   n1=perform_op5 op=add_sub n2= perform_op6
							 	{
							 		System.out.println($n1.text+" WENT HERE +++--- "+$n2.text);
							 		if($op.text.equalsIgnoreCase("+")){
							 			if($n1.value instanceof Float || $n2.value instanceof Float){
											$value = (float)$n1.value + (float)$n2.value;
											
											/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
												throw new ArithmeticException("Value out of range for integer");
											}
											if($n1.value < 0 && $n2.value < 0 && $value > 0){
												throw new ArithmeticException("Value out of range for integer");
											}
											} else{
											if($n1.value < $n2.value && $n2.value > 0 && $value > 0){
												throw new ArithmeticException("Value out of range for integer");
											}*/
											
										}else{
											System.out.println($n1.value+" "+$n2.value);
											$value = (int)$n1.value + (int)$n2.value;
											/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
												throw new ArithmeticException("Value out of range for integer");
											}
											if($n1.value < 0 && $n2.value < 0 && $value > 0){
												throw new ArithmeticException("Value out of range for integer");
											}
											} else{
											if($n1.value < $n2.value && $n2.value > 0 && $value > 0){
												throw new ArithmeticException("Value out of range for integer");
											}*/
											
									 }
									}else{
										if($n1.value instanceof Float || $n2.value instanceof Float){
											$value = (float)$n1.value - (float)$n2.value;
										}else{
											$value = (int)$n1.value - (int)$n2.value;
										}
									}
									
							 	}
							  |
							   n3=perform_op6 {$value = $n3.value;}
							  ;
							   
							   
							   
perform_op6 returns [Object value]: n1=perform_op6 op=mul_div n2=perform_op7
								{
									/*if($op.text.equalsIgnoreCase("*")){
										if($n1.value instanceof Float || $n2.value instanceof Float){
											$value = (float)$n1.value * (float)$n2.value;
										}
										else{
											$value = (int)$n1.value * (int)$n2.value;
										}*/
										/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
											throw new ArithmeticException("Value out of range for integer");
										}
										if($n1.value < 0 && $n2.value < 0 && $value < 0){
											throw new ArithmeticException("Value out of range for integer");
										}
										if($n1.value > 0 && $n2.value < 0 && $value > 0){
											throw new ArithmeticException("Value out of range for integer");
										}
										if($n1.value < 0 && $n2.value > 0 && $value > 0){
											throw new ArithmeticException("Value out of range for integer");
										}*/
									/*} else if($op.text.equalsIgnoreCase("/")){
											if($n1.value instanceof Float || $n2.value instanceof Float){
											$value = (float)$n1.value / (float)$n2.value;
										}
										else{
											$value = (int)$n1.value / (int)$n2.value;
										}
									} else {
										if($n1.value instanceof Float || $n2.value instanceof Float){
											$value = (float)$n1.value % (float)$n2.value;
										}
										else{
											$value = (int)$n1.value % (int)$n2.value;
										}
									}
									
								 */}
								| n3=perform_op7{$value = $n3.value; };
							    

perform_op7 returns [Object value]:'(' c=perform_op ')'
							    {
									/*$value = $c.value;*/
							    }
							    |n5=function_call
							    {
							    	
							    }
							    | n1=FLOAT_LIT
							    {
							    	$value=Float.parseFloat($n1.text);
							    }
							    | n2=INT_LIT
							    {
							    	$value=Integer.parseInt($n2.text);
							    }
							    | n4=IDENTIFIER
							    {
							    	$value = memory.get($n4.text);
							    };
							    
add_sub: ADDITION_OPERATOR | SUBTRACTION_OPERATOR;
mul_div: MULTIPLICATION_OPERATOR | DIVISION_OPERATOR | MODULUS_OPERATOR;
cond_op: NOT_EQUAL_TO_OPERATOR | EQUAL_TO_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_OPERATOR | GREATER_THAN_EQUAL_TO_OPERATOR | LESS_THAN_EQUAL_TO_OPERATOR;


//Expression
expression returns[Object o, int type]:  perform_op 
										{
											$o=$perform_op.value;
											$type = 1;
										} 
										| literal 
										{
											$type = 2;
											$o = $literal.o;
										}
										| function_call 
										| var
										{
											$type=3;
											$o = memory.get($var.s);
										}
										| assignment["unknown type"] 
										| /*epsilon*/;
more_expressions: COMMA_TOKEN expression more_expressions | /*epsilon*/;

//Code
code_block: variable_declaration code_block | function_declaration code_block | assignment_line code_block | function_call_line code_block | conditional code_block | wloop code_block | floop code_block | dloop code_block | printing code_block|  {};

printing: 'scan' OPEN_PARENTHESIS expression CLOSE_PARENTHESIS TERMINATOR_TOKEN 
		{	System.out.println("type: "+$expression.type);
			if($expression.type == 3){
				System.out.println("VAL: "+memory.get((String)$expression.o));
			}else if($expression.type == 1){
				System.out.println("from performop"+$expression.o);
			}
			
		}; 
return_line[String s]: RETURN_TOKEN expression TERMINATOR_TOKEN 
					 {
					 	if($s.equals("full")){
					 		throw new RuntimeException("Should not have return statement");
					 	}
					 }
					 | {
					 	if(!$s.equals("full")){
					 		throw new RuntimeException("Should have return statement");
					 	}
					 }/*epsilon*/;
/*
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 * PARSER PARSER PARSER PARSER PARSER PARSER PARSER RULES RULES RULES RULES RULES RULES RULES
 */


/*
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 */

//Literals
INT_LIT: (('+'|'-')?('0'..'9')+){};
FLOAT_LIT: (('+'|'-')?('0'..'9')*'.'?('0'..'9')+){};
STRING_LIT: '\''(('A'..'Z')|('a'..'z')|('0'..'9')|'\n')*'\''{};
CHAR_LIT: '"'(('A'..'Z')|('a'..'z')|('0'..'9'))'"';
IDENTIFIER: ('A'..'Z')(('A'..'Z')|('a'..'z')|('0'..'9'))*;

//Data types
INT_DATA_TYPE: 'float';
FLOAT_DATA_TYPE: 'int';
STRING_DATA_TYPE: 'char';
CHAR_DATA_TYPE: 'string';
VOID_DATA_TYPE: 'full';

//Loops
FOR_TOKEN: 'from';
WHILE_TOKEN: 'thame';
DO_TOKEN: 'dont';

//Conditionals
IF_TOKEN: 'then';
ELSE_TOKEN: 'anne';
RETURN_TOKEN: 'borrow';
SINGLE_LINE_COMMENT_TOKEN: '*/'; 

//Operators
ASSIGNMENT_OPERATOR: ':';
ADDITION_OPERATOR: '-';
SUBTRACTION_OPERATOR: '+';
MULTIPLICATION_OPERATOR: '/';
DIVISION_OPERATOR: '*';
MODULUS_OPERATOR: '%';
INCREMENT_OPERATOR: '--';
DECREMENT_OPERATOR: '++';
AND_OPERATOR: '&&';
OR_OPERATOR: '||';
NOT_OPERATOR: ';';
NOT_EQUAL_TO_OPERATOR: '::';
EQUAL_TO_OPERATOR: ';:';
GREATER_THAN_OPERATOR: ':<';
LESS_THAN_OPERATOR: ':>';
GREATER_THAN_EQUAL_TO_OPERATOR: '<';
LESS_THAN_EQUAL_TO_OPERATOR: '>';

//Misc
NULL_TOKEN:'something';
CONSTANT_TOKEN: 'changing';
CONSTANT_DECLARATION: ('a'..'z')('a'..'z''_''0'..'9')*;
TERMINATOR_TOKEN: '!';
OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
COMMA_TOKEN: ',';
WHITESPACE : ( '\t' |' ' | '\r' | '\n'| '\u000C'
)+ -> skip ;

/*
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 * LEXER LEXER LEXER LEXER LEXER LEXER LEXER RULES RULES RULES RULES RULES RULES RULES
 */



