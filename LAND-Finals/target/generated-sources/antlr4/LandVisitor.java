// Generated from Land.g4 by ANTLR 4.5.2

 	import java.util.HashMap;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(LandParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LandParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#digit_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_literal(LandParser.Digit_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#characters_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters_literal(LandParser.Characters_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(LandParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(LandParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LandParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(LandParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#more_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_variable_declaration(LandParser.More_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(LandParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#assignment_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_declaration(LandParser.Assignment_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#assignment_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_array(LandParser.Assignment_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LandParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#assignment_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_line(LandParser.Assignment_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(LandParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_declaration_parameters_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_parameters_type(LandParser.Function_declaration_parameters_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_parameters(LandParser.Function_declaration_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_declaration_more_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_more_parameters(LandParser.Function_declaration_more_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LandParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_call_parameters_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_parameters_type(LandParser.Function_call_parameters_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_call_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_parameters(LandParser.Function_call_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#function_call_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_line(LandParser.Function_call_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(LandParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_continue(LandParser.Conditional_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#wloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWloop(LandParser.WloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#dloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDloop(LandParser.DloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#floop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloop(LandParser.FloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op(LandParser.Perform_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op2(LandParser.Perform_op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op3(LandParser.Perform_op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op4(LandParser.Perform_op4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op5(LandParser.Perform_op5Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op6(LandParser.Perform_op6Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_op7(LandParser.Perform_op7Context ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(LandParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#mul_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(LandParser.Mul_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(LandParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LandParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#more_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_expressions(LandParser.More_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(LandParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#printing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinting(LandParser.PrintingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#return_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_line(LandParser.Return_lineContext ctx);
}