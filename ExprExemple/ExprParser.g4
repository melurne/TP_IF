parser grammar ExprParser;
options {tokenVocab=ExprLexer;}

prog : expr EOF {System.out.println("Result: "+$expr.val); } ;

expr returns [ float val ] :
	e1 = expr MULT e2 = expr
		{ $val = $e1.val * $e2.val; }
|	e1 = expr DIV e2 = expr
		{ $val = $e1.val / $e2.val; }
|	e1 = expr PLUS e2 = expr
		{ $val = $e1.val + $e2.val; }
|	e1 = expr MINUS e2 = expr
		{ $val = $e1.val - $e2.val; }
|	INT 
		{ $val = $INT.int; }
|	LPAR e=expr RPAR
		{ $val = $e.val; };
