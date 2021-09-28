// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotLevelMaker.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RobotLevelMakerParser}.
 */
public interface RobotLevelMakerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RobotLevelMakerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RobotLevelMakerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RobotLevelMakerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RobotLevelMakerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#dimStatement}.
	 * @param ctx the parse tree
	 */
	void enterDimStatement(RobotLevelMakerParser.DimStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#dimStatement}.
	 * @param ctx the parse tree
	 */
	void exitDimStatement(RobotLevelMakerParser.DimStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#playerStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlayerStatement(RobotLevelMakerParser.PlayerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#playerStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlayerStatement(RobotLevelMakerParser.PlayerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#wallStatement}.
	 * @param ctx the parse tree
	 */
	void enterWallStatement(RobotLevelMakerParser.WallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#wallStatement}.
	 * @param ctx the parse tree
	 */
	void exitWallStatement(RobotLevelMakerParser.WallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotLevelMakerParser#crateStatement}.
	 * @param ctx the parse tree
	 */
	void enterCrateStatement(RobotLevelMakerParser.CrateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotLevelMakerParser#crateStatement}.
	 * @param ctx the parse tree
	 */
	void exitCrateStatement(RobotLevelMakerParser.CrateStatementContext ctx);
}