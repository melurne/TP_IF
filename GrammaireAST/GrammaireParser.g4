parser grammar GrammaireParser;
options {tokenVocab=GrammaireLexer;}

@header{
	import circuits.*;
}

@members{EquationCircuit circ = new EquationCircuit();}

prog : 		
	circuit commandes EOF;

circuit :
	EQCIRCUIT LPAR entrees = liste_identifiant RPAR RETURNS LPAR sorties = liste_identifiant RPAR
	{
		circ.setInputs($entrees.ids);
		circ.setOutputs($sorties.ids);
	}
	equations
	END
;

liste_identifiant returns [List<String> ids] :
	IDENTIFIANT VIRGULE id_1 = liste_identifiant 
		{
			$id_1.ids.add($IDENTIFIANT.getText());
			$ids = $id_1.ids;
		}
|	IDENTIFIANT
		{
			$ids = new ArrayList<String>();
			$ids.add($IDENTIFIANT.getText());
		}
;

liste_bool returns [List<Boolean> liste] : 
	b = bool VIRGULE l_1 = liste_bool
	{
		$l_1.liste.add($b.b);
		$liste = $l_1.liste;
	}
|	b = bool
	{
		$liste = new ArrayList<Boolean>();
		$liste.add($b.b);
	}
;

bool returns [Boolean b]: 
	TRUE {$b = true;}
|	FALSE {$b = false;}
;

equations : 
	equation equations
| 	equation
;

equation : 
	IDENTIFIANT EQUALS expr SEMICOLUMN
	{
		circ.getOutput($IDENTIFIANT.getText()).setIn($expr.c);
	}
;

expr returns [Composant c] :
	e1 = expr AND e2 = expr {$c = new And(); ((And)($c)).setIn1($e1.c); ((And)($c)).setIn2($e2.c); circ.addComposant($c);}
|	e1 = expr OR e2 = expr {$c = new Or(); ((Or)($c)).setIn1($e1.c); ((Or)($c)).setIn2($e2.c); circ.addComposant($c);}
| 	NOT e = expr {$c = new Not(); ((Not)($c)).setIn($e.c); circ.addComposant($c);}
|	LPAR e = expr RPAR {$c = $e.c;}
| 	IDENTIFIANT { $c = circ.getInput($IDENTIFIANT.getText()); }
|	TRUE { $c = new Interrupteur(""); ((Interrupteur)($c)).on(); }
| 	FALSE { $c = new Interrupteur(""); ((Interrupteur)($c)).off(); }
;
 	
commandes : 
	commande commandes
|	commande
;

commande : 
	DESCR LPAR RPAR {circ.descr();}
|	EVAL LPAR l = liste_bool RPAR {circ.eval($l.liste);}
;
