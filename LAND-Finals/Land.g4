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
data_type returns [String s]: INT_DATA_TYPE #intDatatype
							| FLOAT_DATA_TYPE #floatDataType
							| STRING_DATA_TYPE #stringDatatype
							| CHAR_DATA_TYPE #charDataType;	
literal returns [Object o]: digit_literal #digitLiteral
							| characters_literal #charactersLiteral;
digit_literal returns [Object o]: INT_LIT #intLiteral
								| FLOAT_LIT #floatLiteral ;
characters_literal returns [Object o]: STRING_LIT #stringLiteral 
							 	| CHAR_LIT #charLiteral;
return_type returns [String returnType]: data_type #dataType | VOID_DATA_TYPE #voidType;
 	
//Constant declaration
constant_declaration: CONSTANT_TOKEN IDENTIFIER literal TERMINATOR_TOKEN;

//Variable declaration/initialization
var returns [String s]: IDENTIFIER #varIdentifier | array #arrayIdentifier;
variable_declaration: data_type var more_variable_declaration[$data_type.s] #variableDeclarationAlone
					| data_type assignment_declaration[$data_type.s] more_variable_declaration[$data_type.s] #variableDeclarationWithAssignment;
more_variable_declaration[String dataType]: COMMA_TOKEN var more_variable_declaration[$dataType] | COMMA_TOKEN assignment_declaration[$dataType] more_variable_declaration[$dataType] | TERMINATOR_TOKEN;

//Arrays
array: IDENTIFIER OPEN_BRACKET expression CLOSE_BRACKET;

//Assignment statement
assignment_declaration[String dataType]: assignment[$dataType] | assignment_array;
assignment_array: array ASSIGNMENT_OPERATOR OPEN_BRACE expression more_expressions CLOSE_BRACE;
assignment[String dataType]: var ASSIGNMENT_OPERATOR expression;
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
conditional_continue: ELSE_TOKEN conditional #continueElseIf| ELSE_TOKEN OPEN_BRACE code_block CLOSE_BRACE #continueElse| #continueEpsilon;

//Event-controlled loop
wloop: WHILE_TOKEN OPEN_PARENTHESIS e1=expression CLOSE_PARENTHESIS OPEN_BRACE code_block CLOSE_BRACE;

//Repeat-until loop
dloop: DO_TOKEN OPEN_BRACE code_block CLOSE_BRACE WHILE_TOKEN OPEN_PARENTHESIS expression CLOSE_PARENTHESIS TERMINATOR_TOKEN;

//Count-controlled loop

floop: FOR_TOKEN OPEN_PARENTHESIS n1=expression TERMINATOR_TOKEN e1=expression TERMINATOR_TOKEN expression CLOSE_PARENTHESIS OPEN_BRACE code_block CLOSE_BRACE;


//Perform operation	rules	


perform_op returns [Object value]: perform_op OR_OPERATOR perform_op2 #performOp_1| n3=perform_op2 #performOp_2;

perform_op2 returns [Object value]: perform_op2 AND_OPERATOR perform_op3 #performOp2_1| n3=perform_op3 #performOp2_2;

perform_op3 returns [Object value]: NOT_OPERATOR perform_op3 #performOp3_1| n3=perform_op4 #performOp3_2;

perform_op4 returns [Object value]: n1=perform_op4 cond_op n2=perform_op5 #performOp4_1
									| n3=perform_op5 #performOp4_2;
									
				
perform_op5 returns [Object value] : n1=perform_op5 n2=perform_op6 #performOp5_1
							   | 
							   n1=perform_op5 op=add_sub n2= perform_op6 #performOp5_2
							  |
							   n3=perform_op6 #performOp5_3
							  ;
							   
							   
							   
perform_op6 returns [Object value]: n1=perform_op6 op=mul_div n2=perform_op7 #performOp6_1
								| n3=perform_op7 #performOp6_2;
							    

perform_op7 returns [Object value]:'(' c=perform_op ')' #performOp7_par
							    |n5=function_call #performOp7_funcCall
							    | n1=FLOAT_LIT #performOp7_float
							    | n2=INT_LIT #performOp7_int
							    | n4=IDENTIFIER #performOp7_identifier;
							    
add_sub: ADDITION_OPERATOR | SUBTRACTION_OPERATOR;
mul_div: MULTIPLICATION_OPERATOR | DIVISION_OPERATOR | MODULUS_OPERATOR;
cond_op: NOT_EQUAL_TO_OPERATOR | EQUAL_TO_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_OPERATOR | GREATER_THAN_EQUAL_TO_OPERATOR | LESS_THAN_EQUAL_TO_OPERATOR;


//Expression
expression returns[Object o, int type]:  perform_op #expression_performOp
										| literal #expression_literal
										| function_call #expression_funcCall
										| var #expression_var
										| assignment["unknown type"] #expression_assignment
										| #expression_epsilon/*epsilon*/;
more_expressions: COMMA_TOKEN expression more_expressions | /*epsilon*/;

//Code
code_block: variable_declaration code_block | function_declaration code_block | assignment_line code_block | function_call_line code_block | conditional code_block | wloop code_block | floop code_block | dloop code_block | printing code_block|  {};

printing: 'scan' OPEN_PARENTHESIS expression CLOSE_PARENTHESIS TERMINATOR_TOKEN; 
return_line[String s]: RETURN_TOKEN expression TERMINATOR_TOKEN #returnLine_1
					 | #returnLine_2 /*epsilon*/;
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



