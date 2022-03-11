// Generated from GrammaireParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaireParser}.
 */
public interface GrammaireParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammaireParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammaireParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#circuit}.
	 * @param ctx the parse tree
	 */
	void enterCircuit(GrammaireParser.CircuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#circuit}.
	 * @param ctx the parse tree
	 */
	void exitCircuit(GrammaireParser.CircuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#liste_identifiant}.
	 * @param ctx the parse tree
	 */
	void enterListe_identifiant(GrammaireParser.Liste_identifiantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#liste_identifiant}.
	 * @param ctx the parse tree
	 */
	void exitListe_identifiant(GrammaireParser.Liste_identifiantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#liste_bool}.
	 * @param ctx the parse tree
	 */
	void enterListe_bool(GrammaireParser.Liste_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#liste_bool}.
	 * @param ctx the parse tree
	 */
	void exitListe_bool(GrammaireParser.Liste_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammaireParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammaireParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#equations}.
	 * @param ctx the parse tree
	 */
	void enterEquations(GrammaireParser.EquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#equations}.
	 * @param ctx the parse tree
	 */
	void exitEquations(GrammaireParser.EquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(GrammaireParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(GrammaireParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammaireParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammaireParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#commandes}.
	 * @param ctx the parse tree
	 */
	void enterCommandes(GrammaireParser.CommandesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#commandes}.
	 * @param ctx the parse tree
	 */
	void exitCommandes(GrammaireParser.CommandesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaireParser#commande}.
	 * @param ctx the parse tree
	 */
	void enterCommande(GrammaireParser.CommandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaireParser#commande}.
	 * @param ctx the parse tree
	 */
	void exitCommande(GrammaireParser.CommandeContext ctx);
}