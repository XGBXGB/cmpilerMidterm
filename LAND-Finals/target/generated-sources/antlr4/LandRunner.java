import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.stringtemplate.*;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.*;
public class LandRunner {
	
	static LandParser parser;
	static LandLexer lexer;
	
	public LandRunner()
	{
		parser = null;
		lexer = null;
	}
	
	public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	   }
	
	public void startProgram()
	{
		String fileName = "C:\\Users\\kewpe\\eclipse_workspace\\cmpilerMidterm\\input.txt";
		//String fileName = "input.txt";
		String content = "";
		String line = "";
		try
		{
	            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
             
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
             
            
		   //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
		   // 	 this.getClass().getClassLoader().getResourceAsStream("input.txt")));
            while((line = bufferedReader.readLine()) != null) {
            	content += line+"\n";
            }
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
		
		try
    	{
    		
            //System.out.println("Content: "+content);
            ANTLRInputStream input = new ANTLRInputStream(content);
    		lexer = new LandLexer(input);
    		lexer.removeErrorListeners();
    	    // Get a list of matched tokens
    	    CommonTokenStream tokens = new CommonTokenStream(lexer);
    	 
    	    // Pass the tokens to the parser
    	    parser = new LandParser(tokens);
    	   
    	    
    	    //parser.removeErrorListeners();
    	    //parser.addParseListener(new FunctionsListener());
    	    
    	     
    
    	    ParseTree tree = parser.code_block(); 
    	    LandCustomVisitor visitor = new LandCustomVisitor();
            visitor.visit(tree);
            //show AST in console
            System.out.println("AST in Console: "+tree.toStringTree(parser));

            //show AST in GUI
            UIManager.put("nimbusBase", new Color(3, 130, 40));
            UIManager.put("nimbusBlueGrey", new Color(117, 65, 32));
            try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {
                // If Nimbus is not available, you can set the GUI to another look and feel.
            }
            
            JFrame frame = new JFrame("LAND Abstract Syntax Tree");
            
            JPanel panel = new JPanel();
            JScrollPane scrollPane = new JScrollPane(panel);
            TreeViewer treeView = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            treeView.setFont(new Font("Calibri", Font.BOLD, 10));
            
            
            treeView.setBorderColor(new Color(3, 220, 40));
            treeView.setBoxColor(new Color(3, 255, 76));
             
            //treeView.setBorderColor(new Color(3, 130, 20));
            //treeView.setBoxColor(new Color(3, 175, 40));
            
            treeView.setScale(1.7);//scale a little
            
            
            panel.add(treeView);
            frame.add(scrollPane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 650);
            frame.setVisible(true);
    	    
    	    
	    }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		if(e.getCause() instanceof RecognitionException || e.getMessage().startsWith("Extraneous") || e.getMessage().startsWith("Missing"))
    		{
    			//System.out.println("cause: "+e.getCause() + "\n");
    			Token offender = parser.getCurrentToken();
    			int errorline = offender.getLine();
    			int charPos = offender.getCharPositionInLine();
    			System.out.println("\nSyntax Error! at line"+errorline+":"+charPos
    					+" '"+offender.getInputStream().getText(Interval.of(offender.getStartIndex(), offender.getStopIndex()))+"'");
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
	
	public static void main(String[] args)
	{
		LandRunner program = new LandRunner();
			program.startProgram();
			Object o = true;
			if(o instanceof Boolean){
				
			}
	}
	
}
