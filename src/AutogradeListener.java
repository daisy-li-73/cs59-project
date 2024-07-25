// Generated from C:/Users/daisy/Documents/24X/COSC 59/Project/CS59 Final Project/Autograde.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutogradeParser}.
 */
public interface AutogradeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AutogradeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AutogradeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AutogradeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AutogradeParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AutogradeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AutogradeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#new}.
	 * @param ctx the parse tree
	 */
	void enterNew(AutogradeParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#new}.
	 * @param ctx the parse tree
	 */
	void exitNew(AutogradeParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AutogradeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AutogradeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#test_list}.
	 * @param ctx the parse tree
	 */
	void enterTest_list(AutogradeParser.Test_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#test_list}.
	 * @param ctx the parse tree
	 */
	void exitTest_list(AutogradeParser.Test_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#test_item}.
	 * @param ctx the parse tree
	 */
	void enterTest_item(AutogradeParser.Test_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#test_item}.
	 * @param ctx the parse tree
	 */
	void exitTest_item(AutogradeParser.Test_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#input_list}.
	 * @param ctx the parse tree
	 */
	void enterInput_list(AutogradeParser.Input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#input_list}.
	 * @param ctx the parse tree
	 */
	void exitInput_list(AutogradeParser.Input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(AutogradeParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(AutogradeParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#expected_output}.
	 * @param ctx the parse tree
	 */
	void enterExpected_output(AutogradeParser.Expected_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#expected_output}.
	 * @param ctx the parse tree
	 */
	void exitExpected_output(AutogradeParser.Expected_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#points}.
	 * @param ctx the parse tree
	 */
	void enterPoints(AutogradeParser.PointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#points}.
	 * @param ctx the parse tree
	 */
	void exitPoints(AutogradeParser.PointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#configure}.
	 * @param ctx the parse tree
	 */
	void enterConfigure(AutogradeParser.ConfigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#configure}.
	 * @param ctx the parse tree
	 */
	void exitConfigure(AutogradeParser.ConfigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#config_list}.
	 * @param ctx the parse tree
	 */
	void enterConfig_list(AutogradeParser.Config_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#config_list}.
	 * @param ctx the parse tree
	 */
	void exitConfig_list(AutogradeParser.Config_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#config_item}.
	 * @param ctx the parse tree
	 */
	void enterConfig_item(AutogradeParser.Config_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#config_item}.
	 * @param ctx the parse tree
	 */
	void exitConfig_item(AutogradeParser.Config_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#config_key}.
	 * @param ctx the parse tree
	 */
	void enterConfig_key(AutogradeParser.Config_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#config_key}.
	 * @param ctx the parse tree
	 */
	void exitConfig_key(AutogradeParser.Config_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#config_value}.
	 * @param ctx the parse tree
	 */
	void enterConfig_value(AutogradeParser.Config_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#config_value}.
	 * @param ctx the parse tree
	 */
	void exitConfig_value(AutogradeParser.Config_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(AutogradeParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(AutogradeParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(AutogradeParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(AutogradeParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#method_list}.
	 * @param ctx the parse tree
	 */
	void enterMethod_list(AutogradeParser.Method_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#method_list}.
	 * @param ctx the parse tree
	 */
	void exitMethod_list(AutogradeParser.Method_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#method_item}.
	 * @param ctx the parse tree
	 */
	void enterMethod_item(AutogradeParser.Method_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#method_item}.
	 * @param ctx the parse tree
	 */
	void exitMethod_item(AutogradeParser.Method_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#method_item_val}.
	 * @param ctx the parse tree
	 */
	void enterMethod_item_val(AutogradeParser.Method_item_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#method_item_val}.
	 * @param ctx the parse tree
	 */
	void exitMethod_item_val(AutogradeParser.Method_item_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AutogradeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AutogradeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#submission_time}.
	 * @param ctx the parse tree
	 */
	void enterSubmission_time(AutogradeParser.Submission_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#submission_time}.
	 * @param ctx the parse tree
	 */
	void exitSubmission_time(AutogradeParser.Submission_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(AutogradeParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(AutogradeParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(AutogradeParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(AutogradeParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AutogradeParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AutogradeParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(AutogradeParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(AutogradeParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(AutogradeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(AutogradeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(AutogradeParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(AutogradeParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(AutogradeParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(AutogradeParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutogradeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(AutogradeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutogradeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(AutogradeParser.TimeContext ctx);
}