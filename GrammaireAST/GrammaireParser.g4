parser grammar GrammaireParser;
options {tokenVocab=GrammaireLexer;}

prog : 		
	circuit commandes EOF;

circuit :
	EQCIRCUIT LPAR liste_identifiant RPAR RETURNS LPAR liste_identifiant RPAR
	equations
	END
;

liste_identifiant :
	IDENTIFIANT VIRGULE liste_identifiant
|	IDENTIFIANT
;

liste_bool : 
	bool VIRGULE liste_bool
|	bool
;

bool : 
	TRUE
|	FALSE
;

equations : 
	equation equations
| 	equation
;

equation : 
	IDENTIFIANT EQUALS expr SEMICOLUMN
;

expr :
	expr AND expr
|	expr OR expr
| 	NOT expr
|	LPAR expr RPAR
| 	IDENTIFIANT
;
 	
commandes : 
	commande commandes
|	commande
;

commande : 
	DESCR LPAR RPAR
|	EVAL LPAR liste_bool RPAR
;
