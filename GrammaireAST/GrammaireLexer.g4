lexer grammar GrammaireLexer;

WS : [\n\r\t ]+ -> skip ;
LPAR : '(';
RPAR : ')';
SEMICOLUMN : ';' ;
VIRGULE : ',' ;
EQUALS : '=' ;
AND : '&' ;
OR : '|' ;
NOT : '!' ;
TRUE : 'true' ;
FALSE : 'false' ;
EQCIRCUIT : 'eq_circuit' ;
END : 'end' ;
RETURNS : 'returns' ;
DESCR : 'descr' ;
EVAL : 'eval' ;
IDENTIFIANT : [a-zA-Z][a-zA-Z0-9]* ;
