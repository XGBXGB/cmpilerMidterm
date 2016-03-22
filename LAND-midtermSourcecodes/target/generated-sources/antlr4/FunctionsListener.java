
public class FunctionsListener extends LandBaseListener{
	public void enterFunction_declaration(LandParser.Function_declarationContext ctx) {
		//System.out.println("func_dec: IM IN HEEEERE");
	}
	
	public void enterCode_block(LandParser.Code_blockContext ctx) { 
		//System.out.println("code_block: IM IN HEEEERE");
	}
	public void enterVariable_declaration(LandParser.Variable_declarationContext ctx) { 
		//System.out.println("var_dec: IM IN HEEEERE");
	}
	public void enterAssignment_line(LandParser.Assignment_lineContext ctx) { 
		//System.out.println("ass_line: IM IN HEEEERE");
	}
	
	public void enterFunction_call(LandParser.Function_callContext ctx) { 
		//System.out.println("func_call: IM IN HEEEERE");
	}
}
