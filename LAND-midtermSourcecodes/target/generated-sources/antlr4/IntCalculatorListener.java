// Generated from IntCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntCalculatorParser}.
 */
public interface IntCalculatorListener extends ParseTreeListener {
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
}