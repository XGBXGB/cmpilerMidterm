import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class DrinkRunner {
	public static void main(String[] args){
		ANTLRInputStream input = new ANTLRInputStream("1+5*5+10/2");
		DrinkLexer lexer = new DrinkLexer(input);
		 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    DrinkParser parser = new DrinkParser(tokens);
	 
	    // Specify our entry point
	    //ParseTree tree = parser.perform_op();
	    System.out.println(parser.perform_op().value);
	    // Walk it and attach our listener
	}
}
