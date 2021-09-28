// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotLevelMaker.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RobotLevelMakerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RobotLevelMakerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RobotLevelMakerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RobotLevelMakerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#dimStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimStatement(RobotLevelMakerParser.DimStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#playerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerStatement(RobotLevelMakerParser.PlayerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#wallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWallStatement(RobotLevelMakerParser.WallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotLevelMakerParser#crateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrateStatement(RobotLevelMakerParser.CrateStatementContext ctx);
}