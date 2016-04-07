import java.util.HashMap;
import java.util.Scanner;



public class LandCustomVisitor extends LandBaseVisitor<Object>{
	HashMap memory = new HashMap();
	HashMap memoryConst = new HashMap();
	@Override
	public Object visitIntDatatype(LandParser.IntDatatypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.INT_DATA_TYPE().getText();
		return ctx;
	}

	@Override
	public Object visitFloatDataType(LandParser.FloatDataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.FLOAT_DATA_TYPE().getText();
		return ctx;
	}

	@Override
	public Object visitStringDatatype(LandParser.StringDatatypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.STRING_DATA_TYPE().getText();
		return ctx;
	}

	@Override
	public Object visitCharDataType(LandParser.CharDataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.CHAR_DATA_TYPE().getText();
		return ctx;
	}

	@Override
	public Object visitDigitLiteral(LandParser.DigitLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ((LandParser.Digit_literalContext)this.visit(ctx.digit_literal())).o;
		return ctx;
	}

	@Override
	public Object visitCharactersLiteral(LandParser.CharactersLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ((LandParser.Characters_literalContext)this.visit(ctx.characters_literal())).o;
		return ctx;
	}

	@Override
	public Object visitIntLiteral(LandParser.IntLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = Integer.parseInt(ctx.INT_LIT().getText());
		return ctx;
	}

	@Override
	public Object visitFloatLiteral(LandParser.FloatLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = Float.parseFloat(ctx.FLOAT_LIT().getText());
		return ctx;
	}

	@Override
	public Object visitStringLiteral(LandParser.StringLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.STRING_LIT().getText().replace("'", "");
		return ctx;
	}

	@Override
	public Object visitCharLiteral(LandParser.CharLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.CHAR_LIT().getText().replace("\"", "");
		return ctx;
	}

	@Override
	public Object visitDataType(LandParser.DataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.returnType = ((LandParser.Data_typeContext)this.visit(ctx.data_type())).s;
		return ctx;
	}

	@Override
	public Object visitVoidType(LandParser.VoidTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.returnType = "full";
		return ctx;
	}
	
	@Override
	public Object visitConst_dec(LandParser.Const_decContext ctx) {
		System.out.println("CONSTANT OVER HERE");
		String constant = ctx.IDENTIFIER().getText();
		Object literal = ctx.literal();
		try{
			memory.get(constant);
		}
		catch(Exception e){
			memoryConst.get(constant);
		}finally{
			memoryConst.put(constant, literal);
		}
		return ctx;
	}

	/*
	@Override
	public Object visitConstant_declaration(LandParser.Constant_declarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstant_declaration(ctx);
	}*/

	@Override
	public Object visitVarIdentifier(LandParser.VarIdentifierContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.IDENTIFIER().getText();
		return ctx;
	}

	/*@Override
	public Object visitArrayIdentifier(LandParser.ArrayIdentifierContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArrayIdentifier(ctx);
	}*/

	@Override
	public Object visitVariableDeclarationAlone(LandParser.VariableDeclarationAloneContext ctx) {
		
		String dataType = ((LandParser.IntDatatypeContext)this.visit(ctx.data_type())).s;
		LandParser.VarContext varContext = ((LandParser.VarContext)this.visit(ctx.var()));
		String variable = ((LandParser.VarContext)this.visit(ctx.var())).s;
		System.out.println("VARIABLE: "+variable);
		System.out.println("DATATYPE CHECK: "+dataType);
		System.out.println(variable+" TRRRRYYYING");
		ctx.more_variable_declaration().dataType=((LandParser.Data_typeContext)this.visit(ctx.data_type())).s;
		this.visit(ctx.more_variable_declaration());
		
		
		if(varContext instanceof LandParser.ArrayIdentifierContext){
			//int number = (int)((LandParser.ExpressionContext)((LandParser.ArrayContext)this.visit(((LandParser.ArrayIdentifierContext)this.visit(ctx.var())))).array()).expression()).o;
			int number = (int) ((LandParser.ExpressionContext)this.visit(((LandParser.ArrayContext)this.visit(((LandParser.ArrayIdentifierContext)this.visit(ctx.var())).array())).expression())).o;
			System.out.println("DANAMBAH: "+number);
			String arrayName = "";
			for(int i=0; i<number; i++){
				arrayName = variable+"["+i+"]";
				System.out.println("ARRAYNAME: "+arrayName);
				if(dataType.equals("float")){
					System.out.println("INITIALIZED: "+arrayName);
					 memory.put(arrayName, new Integer(0));
				}
				else if(dataType.equals("int")){
					 memory.put(arrayName, new Float(0));
				}
				else if(dataType.equals("char")){
					 memory.put(arrayName, new String(""));
					
				}else if(dataType.equals("string")){
					 memory.put(arrayName, new Character('\0'));
				}
			}
		}
		else{
			if(dataType.equals("float")){
				return memory.put(variable, new Integer(0));
			}
			else if(dataType.equals("int")){
				return memory.put(variable, new Float(0));
			}
			else if(dataType.equals("char")){
				return memory.put(variable, new String(""));
				
			}else if(dataType.equals("string")){
				return memory.put(variable, new Character('\0'));
			}
		}
		return ctx;
	}

	

	@Override
	public Object visitVariableDeclarationWithAssignment(LandParser.VariableDeclarationWithAssignmentContext ctx) {
		// TODO Auto-generated method stub
		ctx.assignment_declaration().dataType=((LandParser.Data_typeContext)this.visit(ctx.data_type())).s;
		this.visit(ctx.assignment_declaration());
		ctx.more_variable_declaration().dataType=((LandParser.Data_typeContext)this.visit(ctx.data_type())).s;
		this.visit(ctx.more_variable_declaration());
		return ctx;
	}

	

	@Override
	public Object visitArray(LandParser.ArrayContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArray(ctx);
	}

	@Override
	public Object visitMoreVarableDec1(LandParser.MoreVarableDec1Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("CRAP CRAP CRAP");
		String dataType = ctx.dataType;
		String var = ((LandParser.VarContext)this.visit(ctx.var())).s;
		System.out.println("MORE VAR DEC:" +dataType+" - "+var);	
		ctx.more_variable_declaration().dataType=ctx.dataType;
		this.visit(ctx.more_variable_declaration());
		if(dataType.equals("float")){
			return memory.put(var, new Integer(0));
		}
		else if(dataType.equals("int")){
			return memory.put(var, new Float(0));
		}
		else if(dataType.equals("char")){
			return memory.put(var, new String(""));
			
		}else if(dataType.equals("string")){
			return memory.put(var, new Character('\0'));
		}
		return ctx;
	}

	@Override
	public Object visitMoreVarableDec2(LandParser.MoreVarableDec2Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("CRAP CRAP CRAP2");
		String dataType = ctx.dataType;
		ctx.more_variable_declaration().dataType=ctx.dataType;
		ctx.assignment_declaration().dataType=dataType;
		this.visit(ctx.assignment_declaration());
		
		this.visit(ctx.more_variable_declaration());
		return ctx;
	}

	@Override
	public Object visitMoreVarableDec3(LandParser.MoreVarableDec3Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("CRAP CRAP CRAP3");
		return ctx;
	}

	
/*
	@Override
	public Object visitAssignment_array(LandParser.Assignment_arrayContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_array(ctx);
	}*/

	@Override
	public Object visitAssignment_dec1(LandParser.Assignment_dec1Context ctx) {
		// TODO Auto-generated method stub
		ctx.assignment().dataType = ctx.dataType;
		this.visit(ctx.assignment());
		return ctx;
	}

	@Override
	public Object visitAssignment_dec2(LandParser.Assignment_dec2Context ctx) {
		// TODO Auto-generated method stub
		return ctx;
	}

	@Override
	public Object visitAssignment(LandParser.AssignmentContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Assignment-datatype: "+ctx.dataType);
		LandParser.VarContext varCtx =  (LandParser.VarContext)this.visit(ctx.var());
		String variable = ((LandParser.VarContext)this.visit(ctx.var())).s;
		Object expression = ((LandParser.ExpressionContext)this.visit(ctx.expression())).o;
		
		if(varCtx instanceof LandParser.ArrayIdentifierContext){
			int i = (int)((LandParser.ExpressionContext)this.visit((((LandParser.ArrayContext)this.visit(((LandParser.ArrayIdentifierContext)this.visit(ctx.var())).array()))).expression())).o;
			variable = variable+"["+i+"]";
			if(ctx.dataType.equals("float")){
				//todo if expression instanceof int else throw
				return memory.put(variable, new Integer((int)expression));
			}else if(ctx.dataType.equals("int")){
				return memory.put(variable, new Float((float)expression));
			}else if(ctx.dataType.equals("char")){
				return memory.put(variable, new String((String)expression));
			}else if(ctx.dataType.equals("unknown type")){
				if(memory.get(variable)==null){
				}else{
					if(memory.get(variable) instanceof Integer){
						System.out.println("PUTEEEEEEK "+variable+":"+(int)expression);
						return memory.put(variable, new Integer((int)expression));
					}else{
						return memory.put(variable, new Float((float)expression));
					} 
				}
			}
		}
		else{
			if(ctx.dataType.equals("float")){
				//todo if expression instanceof int else throw
				return memory.put(variable, new Integer((int)expression));
			}else if(ctx.dataType.equals("int")){
				return memory.put(variable, new Float((float)expression));
			}else if(ctx.dataType.equals("char")){
				return memory.put(variable, new String((String)expression));
			}else if(ctx.dataType.equals("unknown type")){
				if(memory.get(variable)==null){
				}else{
					if(memory.get(variable) instanceof Integer){
						System.out.println(variable+": "+expression);
						return memory.put(variable, new Integer((int)expression));
					}else{
						return memory.put(variable, new Float((float)expression));
					} 
				}
			}
		}
		return new Object();
		
	}

	@Override
	public Object visitCond(LandParser.CondContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("CONDITIONAL");
		if((boolean)(((LandParser.ExpressionContext)this.visit(ctx.expression())).o)){
			this.visit(ctx.code_block());
		}else{
			this.visit(ctx.conditional_continue());
		}
		return ctx;
	}	

	@Override
	public Object visitContinueElseIf(LandParser.ContinueElseIfContext ctx) {
		// TODO Auto-generated method stub
		this.visit(ctx.conditional());
		return ctx;
	}

	@Override
	public Object visitContinueElse(LandParser.ContinueElseContext ctx) {
		// TODO Auto-generated method stub
		this.visit(ctx.code_block());
		return ctx;
	}

	@Override
	public Object visitContinueEpsilon(LandParser.ContinueEpsilonContext ctx) {
		// TODO Auto-generated method stub
		return new Object();
	}

	@Override
	public Object visitWloop(LandParser.WloopContext ctx) {
		// TODO Auto-generated method stub
		
		while((boolean)(((LandParser.ExpressionContext)this.visit(ctx.expression())).o)){
			this.visit(ctx.code_block());
		}
		return new Object();
	}

	@Override
	public Object visitDloop(LandParser.DloopContext ctx) {
		// TODO Auto-generated method stub
		do{
			this.visit(ctx.code_block());
		}while((boolean)(((LandParser.ExpressionContext)this.visit(ctx.expression())).o));
		return new Object();
	}

	@Override
	public Object visitFloop(LandParser.FloopContext ctx) {
		// TODO Auto-generated method stub
		while((boolean)(((LandParser.ExpressionContext)this.visit(ctx.expression(1))).o)){
			this.visit(ctx.code_block());
		}
		return new Object();
	}

	@Override
	public Object visitPerformOp_1(LandParser.PerformOp_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((boolean)((LandParser.Perform_opContext)this.visit(ctx.perform_op())).value || (boolean)((LandParser.Perform_op2Context)this.visit(ctx.perform_op2())).value);
		return ctx;
	}

	@Override
	public Object visitPerformOp_2(LandParser.PerformOp_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op2Context)this.visit(ctx.perform_op2())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp2_2(LandParser.PerformOp2_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op3Context)this.visit(ctx.perform_op3())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp2_1(LandParser.PerformOp2_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((boolean)((LandParser.Perform_op2Context)this.visit(ctx.perform_op2())).value && (boolean)((LandParser.Perform_op3Context)this.visit(ctx.perform_op3())).value);
		return ctx;
	}

	@Override
	public Object visitPerformOp3_1(LandParser.PerformOp3_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = (!((boolean)((LandParser.Perform_op3Context)this.visit(ctx.perform_op3())).value));
		return ctx;
	}

	@Override
	public Object visitPerformOp3_2(LandParser.PerformOp3_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op4Context)this.visit(ctx.perform_op4())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp4_2(LandParser.PerformOp4_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op5Context)this.visit(ctx.perform_op5())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp4_1(LandParser.PerformOp4_1Context ctx) {
		// TODO Auto-generated method stub
		Object p4 = ((LandParser.Perform_op4Context)this.visit(ctx.perform_op4())).value;
		Object p5 = ((LandParser.Perform_op5Context)this.visit(ctx.perform_op5())).value;
		String condop = ((LandParser.Cond_opContext)this.visit(ctx.cond_op())).getText();
		float v1,v2;
		if(p4 instanceof Float)
			v1 = (float) p4;
		else
			v1 = (int)p4 * 1.0f;
		if(p5 instanceof Float)
			v2 = (float) p5;
		else
			v2 = (int)p5 * 1.0f;
		
		if(condop.equals("::")){
			if(v1 != v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(condop.equals(";:")){
			if(v1 == v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(condop.equals(":<")){
			if(v1 > v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(condop.equals(":>")){
			if(v1 < v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(condop.equals("<")){
			if(v1 >= v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(condop.equals(">")){
			if(v1 <= v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		return ctx;
			
	}

	@Override
	public Object visitPerformOp5_1(LandParser.PerformOp5_1Context ctx) {
		// TODO Auto-generated method stub
		String p6String = ((LandParser.Perform_op6Context)this.visit(ctx.perform_op6())).getText();
		String p5String = ((LandParser.Perform_op5Context)this.visit(ctx.perform_op5())).getText();
		Object p6 = ((LandParser.Perform_op6Context)this.visit(ctx.perform_op6())).value;
		Object p5 = ((LandParser.Perform_op5Context)this.visit(ctx.perform_op5())).value;
		if(p6String.startsWith("+") || p6String.startsWith("-") )
		{
			if(p5 instanceof Float || p6 instanceof Float){
				if(!(p5 instanceof Float))
					p5 = (int)p5*1.0f;
				if(!(p6 instanceof Float))
					p6 = (int)p6*1.0f;
				ctx.value = (float)p5 + (float)p6;
			}
			else
				ctx.value = (int)p5 + (int)p6;
			/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
				throw new ArithmeticException("Value out of range for integer");
			}else{
				$value = (int)$n1.value + (int)$n2.value;
			}
			if($n1.value < 0 && $n2.value < 0 && $value > 0){
				throw new ArithmeticException("Value out of range for integer");
			}*/
		} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
		return ctx;
	}

	@Override
	public Object visitPerformOp5_3(LandParser.PerformOp5_3Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op6Context)this.visit(ctx.perform_op6())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp5_2(LandParser.PerformOp5_2Context ctx) {
		// TODO Auto-generated method stub
		Object p6 = ((LandParser.Perform_op6Context)this.visit(ctx.perform_op6())).value;
		Object p5 = ((LandParser.Perform_op5Context)this.visit(ctx.perform_op5())).value;
		
		
		if(ctx.op.getText().equalsIgnoreCase("+")){
 			if(p5 instanceof Float || p6 instanceof Float){
 				if(!(p5 instanceof Float))
					p5 = (int)p5*1.0f;
				if(!(p6 instanceof Float))
					p6 = (int)p6*1.0f;
 				ctx.value = (float)p5 + (float)p6;
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
				ctx.value = (int)p5 + (int)p6;
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
			if(p5 instanceof Float || p6 instanceof Float){
				if(!(p5 instanceof Float))
						p5 = (int)p5*1.0f;
				if(!(p6 instanceof Float))
						p6 = (int)p6*1.0f;
 				ctx.value = (float)p5 - (float)p6;
			}else{
				ctx.value = (int)p5 - (int)p6;
			}
		}
		return ctx;
	}

	@Override
	public Object visitPerformOp6_2(LandParser.PerformOp6_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_op7Context)this.visit(ctx.perform_op7())).value;
		return ctx;
	}

	@Override
	public Object visitPerformOp6_1(LandParser.PerformOp6_1Context ctx) {
		// TODO Auto-generated method stub
		Object p6 = ((LandParser.Perform_op6Context)this.visit(ctx.perform_op6())).value;
		Object p7 = ((LandParser.Perform_op7Context)this.visit(ctx.perform_op7())).value;
		
		if(ctx.op.getText().equalsIgnoreCase("*")){
 			if(p6 instanceof Float || p7 instanceof Float){
 				if(!(p6 instanceof Float))
 						p6 = (int)p6*1.0f;
 				if(!(p7 instanceof Float))
 						p7 = (int)p7*1.0f;
 				ctx.value = (float)p6 * (float)p7;
				
				
			}else{
				ctx.value = (int)p6 * (int)p7;
				
		 }
		}else{
			if(p6 instanceof Float || p7 instanceof Float){
				if(!(p6 instanceof Float))
						p6 = (int)p6*1.0f;
				if(!(p7 instanceof Float))
						p7 = (int)p7*1.0f;
 				ctx.value = (float)p6 / (float)p7;
			}else{
				ctx.value = (int)p6 / (int)p7;
			}
		}
		return ctx;
	}

	@Override
	public Object visitPerformOp7_par(LandParser.PerformOp7_parContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((LandParser.Perform_opContext)this.visit(ctx.perform_op())).value;
		return ctx;
	}

	/*@Override
	public Object visitPerformOp7_funcCall(LandParser.PerformOp7_funcCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPerformOp7_funcCall(ctx);
	}*/

	@Override
	public Object visitPerformOp7_float(LandParser.PerformOp7_floatContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = Float.parseFloat(ctx.FLOAT_LIT().getText());
		return ctx;
	}

	@Override
	public Object visitPerformOp7_int(LandParser.PerformOp7_intContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = Integer.parseInt(ctx.INT_LIT().getText());
		return ctx;
	}

	@Override
	public Object visitPerformOp7_identifier(LandParser.PerformOp7_identifierContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = memory.get(ctx.IDENTIFIER().getText());
		return ctx;
	}

	@Override
	public Object visitAdd_sub(LandParser.Add_subContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAdd_sub(ctx);
	}

	@Override
	public Object visitMul_div(LandParser.Mul_divContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMul_div(ctx);
	}

	@Override
	public Object visitCond_op(LandParser.Cond_opContext ctx) {
		// TODO Auto-generated method stub
		return ctx;
	}

	@Override
	public Object visitExpression_performOp(LandParser.Expression_performOpContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ((LandParser.Perform_opContext)this.visit(ctx.perform_op())).value;
		ctx.type=1;
		return ctx;
	}

	@Override
	public Object visitExpression_literal(LandParser.Expression_literalContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ((LandParser.LiteralContext)this.visit(ctx.literal())).o;
		ctx.type=2;
		return ctx;
	}

	@Override
	public Object visitExpression_funcCall(LandParser.Expression_funcCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression_funcCall(ctx);
	}

	@Override
	public Object visitExpression_var(LandParser.Expression_varContext ctx) {
		// TODO Auto-generated method stub
		ctx.type = 3;
		ctx.o = memory.get(((LandParser.VarContext)this.visit(ctx.var())).getText());
		return ctx;
	}

	@Override
	public Object visitExpression_assignment(LandParser.Expression_assignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression_assignment(ctx);
	}

	@Override
	public Object visitExpression_epsilon(LandParser.Expression_epsilonContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression_epsilon(ctx);
	}

	@Override
	public Object visitMore_expressions(LandParser.More_expressionsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMore_expressions(ctx);
	}

	@Override
	public Object visitCode_block(LandParser.Code_blockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCode_block(ctx);
	}

	@Override
	public Object visitPrinting(LandParser.PrintingContext ctx) {
		// TODO Auto-generated method stub
		Object expression = ((LandParser.ExpressionContext)this.visit(ctx.expression())).o;
		int type = ((LandParser.ExpressionContext)this.visit(ctx.expression())).type;
		if(type == 3){
			System.out.println(memory.get((String)expression));
		}else if(type == 2){
			System.out.println("PRINTTEST: "+expression);
		}
		else{
			System.out.println("PRINTTEST: "+expression);
		}
		return ctx;
	}
	
	@Override
	public Object visitScan(LandParser.ScanContext ctx) {
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		return ctx;
	}

	@Override
	public Object visitReturnLine_1(LandParser.ReturnLine_1Context ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnLine_1(ctx);
	}

	@Override
	public Object visitReturnLine_2(LandParser.ReturnLine_2Context ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnLine_2(ctx);
	}

}
