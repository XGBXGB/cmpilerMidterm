// Generated from Drink.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrinkParser}.
 */
public interface DrinkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrinkParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op(DrinkParser.Perform_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#perform_op}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op(DrinkParser.Perform_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrinkParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void enterPerform_op2(DrinkParser.Perform_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#perform_op2}.
	 * @param ctx the parse tree
	 */
	void exitPerform_op2(DrinkParser.Perform_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DrinkParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(DrinkParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(DrinkParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrinkParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(DrinkParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(DrinkParser.Mul_divContext ctx);
}