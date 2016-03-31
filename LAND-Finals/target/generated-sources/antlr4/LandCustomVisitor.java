import java.util.HashMap;


public class LandCustomVisitor extends LandBaseVisitor<Object>{
	HashMap memory = new HashMap();
	@Override
	public Object visitIntDatatype(LandParser.IntDatatypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.INT_DATA_TYPE().getText();
		return super.visitIntDatatype(ctx);
	}

	@Override
	public Object visitFloatDataType(LandParser.FloatDataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.FLOAT_DATA_TYPE().getText();
		return super.visitFloatDataType(ctx);
	}

	@Override
	public Object visitStringDatatype(LandParser.StringDatatypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.STRING_DATA_TYPE().getText();
		return super.visitStringDatatype(ctx);
	}

	@Override
	public Object visitCharDataType(LandParser.CharDataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.s = ctx.CHAR_DATA_TYPE().getText();
		return super.visitCharDataType(ctx);
	}

	@Override
	public Object visitDigitLiteral(LandParser.DigitLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.digit_literal().o;
		return super.visitDigitLiteral(ctx);
	}

	@Override
	public Object visitCharactersLiteral(LandParser.CharactersLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.characters_literal().o;
		return super.visitCharactersLiteral(ctx);
	}

	@Override
	public Object visitIntLiteral(LandParser.IntLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = Integer.parseInt(ctx.INT_LIT().getText());
		return super.visitIntLiteral(ctx);
	}

	@Override
	public Object visitFloatLiteral(LandParser.FloatLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = Float.parseFloat(ctx.FLOAT_LIT().getText());
		return super.visitFloatLiteral(ctx);
	}

	@Override
	public Object visitStringLiteral(LandParser.StringLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.STRING_LIT().getText().replace("'", "");
		return super.visitStringLiteral(ctx);
	}

	@Override
	public Object visitCharLiteral(LandParser.CharLiteralContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.CHAR_LIT().getText().replace("\"", "");
		return super.visitCharLiteral(ctx);
	}

	@Override
	public Object visitDataType(LandParser.DataTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.returnType = ctx.data_type().s;
		return super.visitDataType(ctx);
	}

	@Override
	public Object visitVoidType(LandParser.VoidTypeContext ctx) {
		// TODO Auto-generated method stub
		ctx.returnType = "full";
		return super.visitVoidType(ctx);
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
		return super.visitVarIdentifier(ctx);
	}

	/*@Override
	public Object visitArrayIdentifier(LandParser.ArrayIdentifierContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArrayIdentifier(ctx);
	}*/

	@Override
	public Object visitVariableDeclarationAlone(LandParser.VariableDeclarationAloneContext ctx) {
		String dataType = ctx.data_type.s;
		if(dataType.equals("float")){
			return memory.put(ctx.var().s, new Integer(0));
		}
		else if(dataType.equals("int")){
			return memory.put(ctx.var().s, new Float(0));
		}
		else if(dataType.equals("char")){
			return memory.put(ctx.var().s, new String(""));
			
		}else if(dataType.equals("string")){
			return memory.put(ctx.var().s, new Character('\0'));
		}
		return new Object();
	}
	
	

	/*@Override
	public Object visitVariableDeclarationWithAssignment(LandParser.VariableDeclarationWithAssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableDeclarationWithAssignment(ctx);
	}*/

	

	@Override
	public Object visitArray(LandParser.ArrayContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArray(ctx);
	}

	@Override
	public Object visitMoreVarableDec1(LandParser.MoreVarableDec1Context ctx) {
		// TODO Auto-generated method stub
		String dataType = ctx.dataType;
		if(dataType.equals("float")){
			return memory.put(ctx.var().s, new Integer(0));
		}
		else if(dataType.equals("int")){
			return memory.put(ctx.var().s, new Float(0));
		}
		else if(dataType.equals("char")){
			return memory.put(ctx.var().s, new String(""));
			
		}else if(dataType.equals("string")){
			return memory.put(ctx.var().s, new Character('\0'));
		}
		return new Object();
	}

	/*@Override
	public Object visitMoreVarableDec2(LandParser.MoreVarableDec2Context ctx) {
		// TODO Auto-generated method stub
		return super.visitMoreVarableDec2(ctx);
	}

	@Override
	public Object visitMoreVarableDec3(LandParser.MoreVarableDec3Context ctx) {
		// TODO Auto-generated method stub
		return super.visitMoreVarableDec3(ctx);
	}*/

	/*@Override
	public Object visitAssignment_declaration(LandParser.Assignment_declarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_declaration(ctx);
	}

	@Override
	public Object visitAssignment_array(LandParser.Assignment_arrayContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_array(ctx);
	}*/

	@Override
	public Object visitAssignment(LandParser.AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
		if(ctx.dataType.equals("float")){
			//todo if expression instanceof int else throw
			return memory.put(ctx.var().s, new Integer((int)ctx.expression().o));
		}else if(ctx.dataType.equals("int")){
			return memory.put(ctx.var().s, new Float((float)ctx.expression().o));
		}else if(ctx.dataType.equals("char")){
			return memory.put(ctx.var().s, new String((String)ctx.expression().o));
		}else if(ctx.dataType.equals("unknown type")){
			if(memory.get(ctx.var().s)==null){
			}else{
				if(memory.get(ctx.var().s) instanceof Integer){
					return memory.put(ctx.var().s, new Integer((int)ctx.expression().o));
				}else{
					return memory.put(ctx.var().s, new Float((float)ctx.expression().o));
				} 
			}
		}
		return new Object();
		
	}

	/*@Override
	public Object visitAssignment_line(LandParser.Assignment_lineContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssignment_line(ctx);
	}*/

	/*@Override
	public Object visitFunction_declaration(LandParser.Function_declarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration(ctx);
	}

	@Override
	public Object visitFunction_declaration_parameters_type(LandParser.Function_declaration_parameters_typeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration_parameters_type(ctx);
	}

	@Override
	public Object visitFunction_declaration_parameters(LandParser.Function_declaration_parametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration_parameters(ctx);
	}

	@Override
	public Object visitFunction_declaration_more_parameters(LandParser.Function_declaration_more_parametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_declaration_more_parameters(ctx);
	}

	@Override
	public Object visitFunction_call(LandParser.Function_callContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call(ctx);
	}

	@Override
	public Object visitFunction_call_parameters_type(LandParser.Function_call_parameters_typeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call_parameters_type(ctx);
	}

	@Override
	public Object visitFunction_call_parameters(LandParser.Function_call_parametersContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call_parameters(ctx);
	}

	@Override
	public Object visitFunction_call_line(LandParser.Function_call_lineContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call_line(ctx);
	}

	@Override
	public Object visitConditional(LandParser.ConditionalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConditional(ctx);
	}

	@Override
	public Object visitContinueElseIf(LandParser.ContinueElseIfContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinueElseIf(ctx);
	}

	@Override
	public Object visitContinueElse(LandParser.ContinueElseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinueElse(ctx);
	}

	@Override
	public Object visitContinueEpsilon(LandParser.ContinueEpsilonContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinueEpsilon(ctx);
	}*/

	@Override
	public Object visitWloop(LandParser.WloopContext ctx) {
		// TODO Auto-generated method stub
		while((boolean)ctx.expression().o){
			this.visit(ctx.code_block());
		}
		return new Object();
	}

	@Override
	public Object visitDloop(LandParser.DloopContext ctx) {
		// TODO Auto-generated method stub
		do{
			this.visit(ctx.code_block());
		}while((boolean)ctx.expression().o);
		return new Object();
	}

	@Override
	public Object visitFloop(LandParser.FloopContext ctx) {
		// TODO Auto-generated method stub
		while((boolean)ctx.expression(1).o){
			this.visit(ctx.code_block());
		}
		return new Object();
	}

	@Override
	public Object visitPerformOp_1(LandParser.PerformOp_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((boolean)ctx.perform_op().value || (boolean)ctx.perform_op2().value);
		return super.visitPerformOp_1(ctx);
	}

	@Override
	public Object visitPerformOp_2(LandParser.PerformOp_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op2().value;
		return super.visitPerformOp_2(ctx);
	}

	@Override
	public Object visitPerformOp2_2(LandParser.PerformOp2_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op3().value;
		return super.visitPerformOp2_2(ctx);
	}

	@Override
	public Object visitPerformOp2_1(LandParser.PerformOp2_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ((boolean)ctx.perform_op2().value && (boolean)ctx.perform_op3().value);
		return super.visitPerformOp2_1(ctx);
	}

	@Override
	public Object visitPerformOp3_1(LandParser.PerformOp3_1Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = (!((boolean)ctx.perform_op3().value));
		return super.visitPerformOp3_1(ctx);
	}

	@Override
	public Object visitPerformOp3_2(LandParser.PerformOp3_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op4().value;
		return super.visitPerformOp3_2(ctx);
	}

	@Override
	public Object visitPerformOp4_2(LandParser.PerformOp4_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op5().value;
		return super.visitPerformOp4_2(ctx);
	}

	@Override
	public Object visitPerformOp4_1(LandParser.PerformOp4_1Context ctx) {
		// TODO Auto-generated method stub
		float v1,v2;
		if(ctx.perform_op4().value instanceof Float)
			v1 = (float) ctx.perform_op4().value;
		else
			v1 = (int)ctx.perform_op4().value * 1.0f;
		if(ctx.perform_op5().value instanceof Float)
			v2 = (float) ctx.perform_op5().value;
		else
			v2 = (int)ctx.perform_op5().value * 1.0f;
		
		if(ctx.cond_op().getText().equals("::")){
			if(v1 != v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(ctx.cond_op().getText().equals(";:")){
			if(v1 == v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(ctx.cond_op().getText().equals(":<")){
			if(v1 > v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(ctx.cond_op().getText().equals(":>")){
			if(v1 < v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(ctx.cond_op().getText().equals("<")){
			if(v1 >= v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		else if(ctx.cond_op().getText().equals(">")){
			if(v1 <= v2)
				ctx.value = true;
			else
				ctx.value = false;
		}
		return super.visitPerformOp4_1(ctx);
			
	}

	@Override
	public Object visitPerformOp5_1(LandParser.PerformOp5_1Context ctx) {
		// TODO Auto-generated method stub
		if(ctx.perform_op6().getText().startsWith("+") || ctx.perform_op6().getText().startsWith("-") )
		{
			if(ctx.perform_op5().value instanceof Float || ctx.perform_op6().value instanceof Float)
				ctx.value = (float)ctx.perform_op5().value + (float)ctx.perform_op6().value;
			else
				ctx.value = (int)ctx.perform_op5().value + (int)ctx.perform_op6().value;
			/*if($n1.value > 0 && $n2.value > 0 && $value < 0){
				throw new ArithmeticException("Value out of range for integer");
			}else{
				$value = (int)$n1.value + (int)$n2.value;
			}
			if($n1.value < 0 && $n2.value < 0 && $value > 0){
				throw new ArithmeticException("Value out of range for integer");
			}*/
		} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
		return super.visitPerformOp5_1(ctx);
	}

	@Override
	public Object visitPerformOp5_3(LandParser.PerformOp5_3Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op6().value;
		return super.visitPerformOp5_3(ctx);
	}

	@Override
	public Object visitPerformOp5_2(LandParser.PerformOp5_2Context ctx) {
		// TODO Auto-generated method stub
		if(ctx.op.getText().equalsIgnoreCase("+")){
 			if(ctx.perform_op5().value instanceof Float || ctx.perform_op6().value instanceof Float){
 				ctx.value = (float)ctx.perform_op5().value + (float)ctx.perform_op6().value;
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
				ctx.value = (int)ctx.perform_op5().value + (int)ctx.perform_op6().value;
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
			if(ctx.perform_op5().value instanceof Float || ctx.perform_op6().value instanceof Float){
 				ctx.value = (float)ctx.perform_op5().value - (float)ctx.perform_op6().value;
			}else{
				ctx.value = (int)ctx.perform_op5().value - (int)ctx.perform_op6().value;
			}
		}
		return super.visitPerformOp5_2(ctx);
	}

	@Override
	public Object visitPerformOp6_2(LandParser.PerformOp6_2Context ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op7().value;
		return super.visitPerformOp6_2(ctx);
	}

	@Override
	public Object visitPerformOp6_1(LandParser.PerformOp6_1Context ctx) {
		// TODO Auto-generated method stub
		if(ctx.op.getText().equalsIgnoreCase("*")){
 			if(ctx.perform_op6().value instanceof Float || ctx.perform_op7().value instanceof Float){
 				ctx.value = (float)ctx.perform_op6().value * (float)ctx.perform_op7().value;
				
				
			}else{
				ctx.value = (int)ctx.perform_op6().value * (int)ctx.perform_op7().value;
				
		 }
		}else{
			if(ctx.perform_op6().value instanceof Float || ctx.perform_op7().value instanceof Float){
 				ctx.value = (float)ctx.perform_op6().value / (float)ctx.perform_op7().value;
			}else{
				ctx.value = (int)ctx.perform_op6().value / (int)ctx.perform_op7().value;
			}
		}
		return super.visitPerformOp6_1(ctx);
	}

	@Override
	public Object visitPerformOp7_par(LandParser.PerformOp7_parContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = ctx.perform_op().value;
		return super.visitPerformOp7_par(ctx);
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
		return super.visitPerformOp7_float(ctx);
	}

	@Override
	public Object visitPerformOp7_int(LandParser.PerformOp7_intContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = Integer.parseInt(ctx.INT_LIT().getText());
		return super.visitPerformOp7_int(ctx);
	}

	@Override
	public Object visitPerformOp7_identifier(LandParser.PerformOp7_identifierContext ctx) {
		// TODO Auto-generated method stub
		ctx.value = memory.get(ctx.IDENTIFIER().getText());
		return super.visitPerformOp7_identifier(ctx);
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
		return super.visitCond_op(ctx);
	}

	@Override
	public Object visitExpression_performOp(LandParser.Expression_performOpContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.perform_op().value;
		ctx.type=1;
		return super.visitExpression_performOp(ctx);
	}

	@Override
	public Object visitExpression_literal(LandParser.Expression_literalContext ctx) {
		// TODO Auto-generated method stub
		ctx.o = ctx.literal().o;
		ctx.type=2;
		return super.visitExpression_literal(ctx);
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
		ctx.o = memory.get(ctx.var().s);
		return super.visitExpression_var(ctx);
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
		if(ctx.expression().type == 3){
			System.out.println("FUCKING WEW");
				System.out.println(memory.get((String)ctx.expression().o));
				System.out.println("FUCKING WEW");
			}else if(ctx.expression().type == 2){
				System.out.println(ctx.expression().o);
			}else{
				System.out.println(ctx.expression().o);
			}
		return new Object();
	}

	@Override
	public Object visitReturnLine_1(LandParser.ReturnLine_1Context ctx) {
		// TODO Auto-generated method stub
		if(ctx.s.equals("full")){
			throw new RuntimeException("wew");
		}
		return super.visitReturnLine_1(ctx);
	}

	@Override
	public Object visitReturnLine_2(LandParser.ReturnLine_2Context ctx) {
		// TODO Auto-generated method stub
		return super.visitReturnLine_2(ctx);
	}

}
