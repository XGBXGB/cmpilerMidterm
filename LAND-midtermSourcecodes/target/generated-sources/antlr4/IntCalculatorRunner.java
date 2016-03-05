import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class IntCalculatorRunner {
	
	static IntCalculatorParser parser;
	static IntCalculatorLexer lexer;
	
	public IntCalculatorRunner()
	{
		parser = null;
		lexer = null;
	}
	
	public void startProgram()
	{
		String fileName = "input.txt";
		String line = "";
		 try
		 {
	            // FileReader reads text files in the default encoding.
	            /*FileReader fileReader = 
	                new FileReader(fileName);
	             */
	            // Always wrap FileReader in BufferedReader.
	            /*BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);
	             */
	            
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			         //this.getClass().getClassLoader().getResourceAsStream("../../../../../../../../../../../../../../input.txt")));
					 this.getClass().getClassLoader().getResourceAsStream("input.txt")));
	            while((line = bufferedReader.readLine()) != null) {
	            	
	            	try
	            	{
		                System.out.println(line);
		                ANTLRInputStream input = new ANTLRInputStream(line);
		        		lexer = new IntCalculatorLexer(input);
		        		lexer.removeErrorListeners();
		        	    // Get a list of matched tokens
		        	    CommonTokenStream tokens = new CommonTokenStream(lexer);
		        	 
		        	    // Pass the tokens to the parser
		        	    parser = new IntCalculatorParser(tokens);
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
	            		else if(e instanceof ArithmeticException)
	            		{
	            			//System.out.println("cause: "+e.getMessage() + "\n");
	            			System.out.println("Arithmetic Error! Unable to compute for the answer.\n");
	            		}
	            		else if(e.getMessage().startsWith("Lexical"))
	            		{
	            			//System.out.println(e.getMessage());
	            			System.out.println("Lexical Error! Unable to compute for the answer.\n");

	            		}
	            		else
	            		{
	            			System.out.println("Error " + e + "\n");
	            			
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
	
	public static void main(String[] args)
	{
		IntCalculatorRunner program = new IntCalculatorRunner();
			program.startProgram();
	}
	
}
