// Generated from IntCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntCalculatorParser}.
 */
public interface IntCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(IntCalculatorParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(IntCalculatorParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(IntCalculatorParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(IntCalculatorParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#digit_literal}.
	 * @param ctx the parse tree
	 */
	void enterDigit_literal(IntCalculatorParser.Digit_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#digit_literal}.
	 * @param ctx the parse tree
	 */
	void exitDigit_literal(IntCalculatorParser.Digit_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#characters_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacters_literal(IntCalculatorParser.Characters_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#characters_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacters_literal(IntCalculatorParser.Characters_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(IntCalculatorParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(IntCalculatorParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(IntCalculatorParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(IntCalculatorParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(IntCalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(IntCalculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(IntCalculatorParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(IntCalculatorParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#more_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMore_variable_declaration(IntCalculatorParser.More_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#more_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMore_variable_declaration(IntCalculatorParser.More_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(IntCalculatorParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(IntCalculatorParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#assignment_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_declaration(IntCalculatorParser.Assignment_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#assignment_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_declaration(IntCalculatorParser.Assignment_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#assignment_array}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_array(IntCalculatorParser.Assignment_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#assignment_array}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_array(IntCalculatorParser.Assignment_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IntCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IntCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_line(IntCalculatorParser.Assignment_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_line(IntCalculatorParser.Assignment_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(IntCalculatorParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(IntCalculatorParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_declaration_parameters_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters_type(IntCalculatorParser.Function_declaration_parameters_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_declaration_parameters_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters_type(IntCalculatorParser.Function_declaration_parameters_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters(IntCalculatorParser.Function_declaration_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters(IntCalculatorParser.Function_declaration_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_declaration_more_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_more_parameters(IntCalculatorParser.Function_declaration_more_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_declaration_more_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_more_parameters(IntCalculatorParser.Function_declaration_more_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(IntCalculatorParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(IntCalculatorParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_call_parameters_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters_type(IntCalculatorParser.Function_call_parameters_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_call_parameters_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters_type(IntCalculatorParser.Function_call_parameters_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters(IntCalculatorParser.Function_call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters(IntCalculatorParser.Function_call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#function_call_line}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_line(IntCalculatorParser.Function_call_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#function_call_line}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_line(IntCalculatorParser.Function_call_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(IntCalculatorParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(IntCalculatorParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#conditional_continue}.
	 * @param ctx the parse tree
	 */
	void enterConditional_continue(IntCalculatorParser.Conditional_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#conditional_continue}.
	 * @param ctx the parse tree
	 */
	void exitConditional_continue(IntCalculatorParser.Conditional_continueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#wloop}.
	 * @param ctx the parse tree
	 */
	void enterWloop(IntCalculatorParser.WloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#wloop}.
	 * @param ctx the parse tree
	 */
	void exitWloop(IntCalculatorParser.WloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#dloop}.
	 * @param ctx the parse tree
	 */
	void enterDloop(IntCalculatorParser.DloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#dloop}.
	 * @param ctx the parse tree
	 */
	void exitDloop(IntCalculatorParser.DloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#floop}.
	 * @param ctx the parse tree
	 */
	void enterFloop(IntCalculatorParser.FloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#floop}.
	 * @param ctx the parse tree
	 */
	void exitFloop(IntCalculatorParser.FloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op(IntCalculatorParser.Perform_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op(IntCalculatorParser.Perform_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op2(IntCalculatorParser.Perform_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op2(IntCalculatorParser.Perform_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#perform_op3}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op3(IntCalculatorParser.Perform_op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#perform_op3}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op3(IntCalculatorParser.Perform_op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(IntCalculatorParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(IntCalculatorParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(IntCalculatorParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(IntCalculatorParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(IntCalculatorParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(IntCalculatorParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IntCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IntCalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#more_expressions}.
	 * @param ctx the parse tree
	 */
	void enterMore_expressions(IntCalculatorParser.More_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#more_expressions}.
	 * @param ctx the parse tree
	 */
	void exitMore_expressions(IntCalculatorParser.More_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntCalculatorParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(IntCalculatorParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntCalculatorParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(IntCalculatorParser.Code_blockContext ctx);
}