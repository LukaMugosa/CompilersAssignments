// Generated from .\Treci.g4 by ANTLR 4.9.2

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TreciParser}.
 */
public interface TreciListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TreciParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TreciParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreciParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TreciParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreciParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterRows(TreciParser.RowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreciParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitRows(TreciParser.RowsContext ctx);
}