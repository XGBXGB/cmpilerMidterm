// Generated from Land.g4 by ANTLR 4.5.2

 	import java.util.HashMap;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LandParser}.
 */
public interface LandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(LandParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(LandParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LandParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LandParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#digit_literal}.
	 * @param ctx the parse tree
	 */
	void enterDigit_literal(LandParser.Digit_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#digit_literal}.
	 * @param ctx the parse tree
	 */
	void exitDigit_literal(LandParser.Digit_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#characters_literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacters_literal(LandParser.Characters_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#characters_literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacters_literal(LandParser.Characters_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(LandParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(LandParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(LandParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(LandParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LandParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LandParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(LandParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(LandParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#more_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMore_variable_declaration(LandParser.More_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#more_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMore_variable_declaration(LandParser.More_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LandParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LandParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#assignment_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_declaration(LandParser.Assignment_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#assignment_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_declaration(LandParser.Assignment_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#assignment_array}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_array(LandParser.Assignment_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#assignment_array}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_array(LandParser.Assignment_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LandParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LandParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_line(LandParser.Assignment_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_line(LandParser.Assignment_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(LandParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(LandParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_declaration_parameters_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters_type(LandParser.Function_declaration_parameters_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_declaration_parameters_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters_type(LandParser.Function_declaration_parameters_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters(LandParser.Function_declaration_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters(LandParser.Function_declaration_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_declaration_more_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_more_parameters(LandParser.Function_declaration_more_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_declaration_more_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_more_parameters(LandParser.Function_declaration_more_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LandParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LandParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_call_parameters_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters_type(LandParser.Function_call_parameters_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_call_parameters_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters_type(LandParser.Function_call_parameters_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters(LandParser.Function_call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters(LandParser.Function_call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#function_call_line}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_line(LandParser.Function_call_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#function_call_line}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_line(LandParser.Function_call_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LandParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LandParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 */
	void enterConditional_continue(LandParser.Conditional_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 */
	void exitConditional_continue(LandParser.Conditional_continueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#wloop}.
	 * @param ctx the parse tree
	 */
	void enterWloop(LandParser.WloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#wloop}.
	 * @param ctx the parse tree
	 */
	void exitWloop(LandParser.WloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#dloop}.
	 * @param ctx the parse tree
	 */
	void enterDloop(LandParser.DloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#dloop}.
	 * @param ctx the parse tree
	 */
	void exitDloop(LandParser.DloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#floop}.
	 * @param ctx the parse tree
	 */
	void enterFloop(LandParser.FloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#floop}.
	 * @param ctx the parse tree
	 */
	void exitFloop(LandParser.FloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op(LandParser.Perform_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op(LandParser.Perform_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op2(LandParser.Perform_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op2(LandParser.Perform_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#perform_op3}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op3(LandParser.Perform_op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#perform_op3}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op3(LandParser.Perform_op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(LandParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(LandParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(LandParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(LandParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(LandParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(LandParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LandParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LandParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#more_expressions}.
	 * @param ctx the parse tree
	 */
	void enterMore_expressions(LandParser.More_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#more_expressions}.
	 * @param ctx the parse tree
	 */
	void exitMore_expressions(LandParser.More_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(LandParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(LandParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#printing}.
	 * @param ctx the parse tree
	 */
	void enterPrinting(LandParser.PrintingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#printing}.
	 * @param ctx the parse tree
	 */
	void exitPrinting(LandParser.PrintingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LandParser#return_line}.
	 * @param ctx the parse tree
	 */
	void enterReturn_line(LandParser.Return_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LandParser#return_line}.
	 * @param ctx the parse tree
	 */
	void exitReturn_line(LandParser.Return_lineContext ctx);
}