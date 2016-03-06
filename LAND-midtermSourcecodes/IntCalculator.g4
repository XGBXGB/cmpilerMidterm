grammar IntCalculator;
 
// Parser Rules
 

 @lexer::members{
 	@Override
 	public void recover(LexerNoViableAltException e){
 		String text = _input.getText(Interval.of(_tokenStartCharIndex,_input.index()));
   /*throw new RuntimeException("Syntax error at position "+_tokenStartCharPositionInLine+" '"+text+"'");*/
 		/*throw new RuntimeException("Syntax error! Unable to compute for the answer.");*/
 		throw new RuntimeException("Lexical error! Unable to compute for the answer.\n");
 	}	
 }
 							
perform_op returns [int value] :    
								n1=perform_op n2=perform_op2 
							   { 
								if($n2.text.startsWith("+") || $n2.text.startsWith("-"))
								{
									$value = $n1.value + $n2.value;
									if($n1.value > 0 && $n2.value > 0 && $value < 0){
										throw new ArithmeticException("Value out of range for integer");
									}
									if($n1.value < 0 && $n2.value < 0 && $value > 0){
										throw new ArithmeticException("Value out of range for integer");
									}
								} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
							   }
							   | 
							   n1=perform_op op=add_sub n2= perform_op2
							 	{
							 		if($op.text.equalsIgnoreCase("+")){
										$value = $n1.value + $n2.value;
										if($n1.value > 0 && $n2.value > 0 && $value < 0){
											throw new ArithmeticException("Value out of range for integer");
										}
										if($n1.value < 0 && $n2.value < 0 && $value > 0){
											throw new ArithmeticException("Value out of range for integer");
										}
										} else{
										if($n1.value < $n2.value && $n2.value > 0 && $value > 0){
											throw new ArithmeticException("Value out of range for integer");
										}
											$value = $n1.value - $n2.value;
										}
									
							 	}
							  |
							   n=perform_op2 {$value = $n.value;}
							  ;
							   
							   
							   
perform_op2 returns [int value]: n1=perform_op2 op=mul_div n2=perform_op3 
								{
									if($op.text.equalsIgnoreCase("*")){
										$value = $n1.value * $n2.value;
										if($n1.value > 0 && $n2.value > 0 && $value < 0){
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
										}
									} else if($op.text.equalsIgnoreCase("/")){
											$value = $n1.value / $n2.value;
									} else {
										$value = $n1.value % $n2.value;
									}
									
								}
								| w=perform_op3
									{
										$value = $w.value;
									}
							    ;

perform_op3 returns [int value]:
								'(' c=perform_op ')'
							    {
									$value = $c.value;
							    }
								
							    | n=INT_LIT 
							    {
							    	$value=Integer.parseInt($n.text);
							    }

								;

add_sub: '+' | '-';
mul_div: '*' | '/' | '%';


// Lexer Rules
INT_LIT: (('+'|'-')?('0'..'9')+);
WHITESPACE : ( '\t' |' ' | '\r' | '\n'| '\u000C'
)+ -> skip ;
