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
	 * Visit a parse tree produced by the {@code intDatatype}
	 * labeled alternative in {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDatatype(LandParser.IntDatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatDataType}
	 * labeled alternative in {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDataType(LandParser.FloatDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDatatype}
	 * labeled alternative in {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDatatype(LandParser.StringDatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charDataType}
	 * labeled alternative in {@link LandParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDataType(LandParser.CharDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitLiteral}
	 * labeled alternative in {@link LandParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitLiteral(LandParser.DigitLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charactersLiteral}
	 * labeled alternative in {@link LandParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharactersLiteral(LandParser.CharactersLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link LandParser#digit_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(LandParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link LandParser#digit_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(LandParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LandParser#characters_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LandParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link LandParser#characters_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(LandParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataType}
	 * labeled alternative in {@link LandParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(LandParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link LandParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(LandParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LandParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(LandParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIdentifier}
	 * labeled alternative in {@link LandParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifier(LandParser.VarIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIdentifier}
	 * labeled alternative in {@link LandParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIdentifier(LandParser.ArrayIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationAlone}
	 * labeled alternative in {@link LandParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAlone(LandParser.VariableDeclarationAloneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationWithAssignment}
	 * labeled alternative in {@link LandParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithAssignment(LandParser.VariableDeclarationWithAssignmentContext ctx);
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
	 * Visit a parse tree produced by the {@code continueElseIf}
	 * labeled alternative in {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueElseIf(LandParser.ContinueElseIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueElse}
	 * labeled alternative in {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueElse(LandParser.ContinueElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueEpsilon}
	 * labeled alternative in {@link LandParser#conditional_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueEpsilon(LandParser.ContinueEpsilonContext ctx);
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
	 * Visit a parse tree produced by the {@code performOp_1}
	 * labeled alternative in {@link LandParser#perform_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp_1(LandParser.PerformOp_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp_2}
	 * labeled alternative in {@link LandParser#perform_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp_2(LandParser.PerformOp_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp2_2}
	 * labeled alternative in {@link LandParser#perform_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp2_2(LandParser.PerformOp2_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp2_1}
	 * labeled alternative in {@link LandParser#perform_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp2_1(LandParser.PerformOp2_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp3_1}
	 * labeled alternative in {@link LandParser#perform_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp3_1(LandParser.PerformOp3_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp3_2}
	 * labeled alternative in {@link LandParser#perform_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp3_2(LandParser.PerformOp3_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp4_2}
	 * labeled alternative in {@link LandParser#perform_op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp4_2(LandParser.PerformOp4_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp4_1}
	 * labeled alternative in {@link LandParser#perform_op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp4_1(LandParser.PerformOp4_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp5_1}
	 * labeled alternative in {@link LandParser#perform_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp5_1(LandParser.PerformOp5_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp5_3}
	 * labeled alternative in {@link LandParser#perform_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp5_3(LandParser.PerformOp5_3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp5_2}
	 * labeled alternative in {@link LandParser#perform_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp5_2(LandParser.PerformOp5_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp6_2}
	 * labeled alternative in {@link LandParser#perform_op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp6_2(LandParser.PerformOp6_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp6_1}
	 * labeled alternative in {@link LandParser#perform_op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp6_1(LandParser.PerformOp6_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp7_par}
	 * labeled alternative in {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp7_par(LandParser.PerformOp7_parContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp7_funcCall}
	 * labeled alternative in {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp7_funcCall(LandParser.PerformOp7_funcCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp7_float}
	 * labeled alternative in {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp7_float(LandParser.PerformOp7_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp7_int}
	 * labeled alternative in {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp7_int(LandParser.PerformOp7_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performOp7_identifier}
	 * labeled alternative in {@link LandParser#perform_op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOp7_identifier(LandParser.PerformOp7_identifierContext ctx);
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
	 * Visit a parse tree produced by the {@code expression_performOp}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_performOp(LandParser.Expression_performOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_literal}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_literal(LandParser.Expression_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_funcCall}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_funcCall(LandParser.Expression_funcCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_var}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_var(LandParser.Expression_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_assignment}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_assignment(LandParser.Expression_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_epsilon}
	 * labeled alternative in {@link LandParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_epsilon(LandParser.Expression_epsilonContext ctx);
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
	 * Visit a parse tree produced by the {@code returnLine_1}
	 * labeled alternative in {@link LandParser#return_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLine_1(LandParser.ReturnLine_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code returnLine_2}
	 * labeled alternative in {@link LandParser#return_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLine_2(LandParser.ReturnLine_2Context ctx);
}