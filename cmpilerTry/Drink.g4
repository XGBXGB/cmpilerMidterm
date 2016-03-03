grammar Drink;
 
// Parser Rules
 

 @lexer::members{
 	@Override
 	public void recover(LexerNoViableAltException e){
 		String text = _input.getText(Interval.of(_tokenStartCharIndex,_input.index()));
 		throw new RuntimeException("Syntax error at position "+_tokenStartCharPositionInLine+" '"+text+"'");
 	}	
 }
 
perform_op returns [int value] : n1=perform_op n2=perform_op2 
							   { 
								
									$value = $n1.value + $n2.value;
										
							   }
							   | 
							   n1=perform_op op=add_sub n2= perform_op2
							 	{
							 		if($op.text.equalsIgnoreCase("+")){
											$value = $n1.value + $n2.value;
										} else{
											$value = $n1.value - $n2.value;
										}
									
							 	}
							  |
							   n=perform_op2 {$value = $n.value;};
							   
							   
							   
perform_op2 returns [int value]: n1=perform_op2 op=mul_div n2=INT_LIT 
								{
									
									if($op.text.equalsIgnoreCase("*")){
										$value = $n1.value * Integer.parseInt($n2.text);
									} else if($op.text.equalsIgnoreCase("/")){
										$value = $n1.value / Integer.parseInt($n2.text);
									} else {
										$value = $n1.value % Integer.parseInt($n2.text);
									}
								}
							    | n=INT_LIT 
							    {
							    	$value=Integer.parseInt($n.text);
							    }
							    | '(' c=perform_op ')'
							    {
								$value = $c.value;
							    };
							    


add_sub: '+' | '-';
mul_div: '*' | '/' | '%';


// Lexer Rules
INT_LIT: (('+'|'-')?('0'..'9')+);
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;