import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class DrinkRunner {
	
	static DrinkParser parser;
	static DrinkLexer lexer;
	
	public static void main(String[] args)
	{
		String fileName = "C:\\Users\\user\\workspace\\cmpilerTry\\target/generated-sources/antlr4\\testingthis.txt";
		String line = "";
		 try
		 {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	            	
	            	try
	            	{
		                System.out.println(line);
		                ANTLRInputStream input = new ANTLRInputStream(line);
		        		lexer = new DrinkLexer(input);
		        		lexer.removeErrorListeners();
		        	    // Get a list of matched tokens
		        	    CommonTokenStream tokens = new CommonTokenStream(lexer);
		        	 
		        	    // Pass the tokens to the parser
		        	    parser = new DrinkParser(tokens);
		        	    parser.setErrorHandler(new BailErrorStrategy());
		        	    parser.removeErrorListeners();
		        	    // Specify our entry point
		        	    //ParseTree tree = parser.perform_op();
		        	    System.out.println("Answer for above: " + parser.perform_op().value +"\n");
		        	    // Walk it and attach our listener
	        	    }
	            	catch(Exception e)
	            	{
	            		if(e.getCause() instanceof RecognitionException)
	            		{
	            			//System.out.println("cause: "+e.getCause() + "\n");
	            			System.out.println("Syntax Error! Unable to compute for the answer.\n");
	            		}
	            		else if(e instanceof RuntimeException)
	            		{
	            			//System.out.println(e.getMessage());
	            			System.out.println("Lexical Error! Unable to compute for the answer.\n");

	            		}
	            		else if(e instanceof ArithmeticException)
	            		{
	            			//System.out.println("cause: "+e.getMessage() + "\n");
	            			System.out.println("Arithmetic Error! Unable to compute for the answer.\n");
	            		}
	            	}
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException
	        		ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
		
	}
	
	/*public static void main(String[] args){
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
	}*/
}
