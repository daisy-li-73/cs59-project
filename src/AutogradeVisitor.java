// Generated from C:/Users/daisy/Documents/24X/COSC 59/Project/CS59 Final Project/Autograde.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutogradeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutogradeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutogradeParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AutogradeParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AutogradeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(AutogradeParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AutogradeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#test_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_list(AutogradeParser.Test_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#test_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_item(AutogradeParser.Test_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_list(AutogradeParser.Input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(AutogradeParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#expected_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpected_output(AutogradeParser.Expected_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#points}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoints(AutogradeParser.PointsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#configure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigure(AutogradeParser.ConfigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#config_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_list(AutogradeParser.Config_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#config_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_item(AutogradeParser.Config_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#config_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_key(AutogradeParser.Config_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#config_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_value(AutogradeParser.Config_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(AutogradeParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(AutogradeParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#method_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_list(AutogradeParser.Method_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#method_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_item(AutogradeParser.Method_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#method_item_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_item_val(AutogradeParser.Method_item_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AutogradeParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#submission_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmission_time(AutogradeParser.Submission_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(AutogradeParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(AutogradeParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AutogradeParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(AutogradeParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(AutogradeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(AutogradeParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(AutogradeParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutogradeParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(AutogradeParser.TimeContext ctx);
}