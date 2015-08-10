// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(@NotNull HelloParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(@NotNull HelloParser.NounContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#art}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArt(@NotNull HelloParser.ArtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#tranVrb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranVrb(@NotNull HelloParser.TranVrbContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#verbPhr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhr(@NotNull HelloParser.VerbPhrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#nounPhr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhr(@NotNull HelloParser.NounPhrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#adj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdj(@NotNull HelloParser.AdjContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#intranVrb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntranVrb(@NotNull HelloParser.IntranVrbContext ctx);
}