grammar Expr;

options {
output = AST;
}

tokens {
PROG;EXPR;STAT;
}

prog: stat+ -> ^(PROG stat+) 
;
	                
stat:   expr NEWLINE -> expr
    |   ID '=' expr NEWLINE -> ^('=' ID expr)
    |   NEWLINE
    ;

expr:   multExpr
        (   '+' ^ multExpr
        |   '-' ^ multExpr
        )*
    ;

multExpr :   atom
    ( '*' ^ atom
    |  '/' ^ atom
    )*
    ; 

atom:   INT
    |   ID
    |   '(' expr ')' -> expr
    ;


ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t') ;
