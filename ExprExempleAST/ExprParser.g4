parser grammar ExprParser;
options {tokenVocab=ExprLexer;}

prog : expr EOF {System.out.println("Result: "+$expr.e.eval()); } ;

expr returns [ AExpr e ] :
	e1 = expr MULT e2 = expr
		{ $e = new AMult($e1.e, $e2.e); }
|	e1 = expr DIV e2 = expr
		{ $e = new ADiv($e1.e, $e2.e); }
|	e1 = expr PLUS e2 = expr
		{ $e = new APlus($e1.e, $e2.e); }
|	e1 = expr MINUS e2 = expr
		{ $e = new AMinus($e1.e, $e2.e); }
|	INT 
		{ $e = new AInt($INT.int); }
|	LPAR x=expr RPAR
		{ $e = $x.e; };
