grammar ast2;

options {

output = AST;
k=1;

}

programm		: exp
			;


dec			: tydec
			| vardec
			| fundec
			;

tydec		    	: 'type' ID '=' ty
		   	;

ty 			: ID
			| arrty
			| recty
			;

arrty			: 'array' 'of' ID
			;

recty			: '{' (fielddec (','fielddec)*)?  '}' // /!\ les fielddec doivent être séparés d'une ',' /!\
			;

fielddec		: ID ':' ID
			;

fundec			: 'function' ID '(' (fielddec(','fielddec)*)? ')' fundec1 // /!\ les fielddec doivent être séparés d'une ',' /!\
			;
			
fundec1 		:  '=' exp 
			|':' ID '=' exp
			;

vardec			: 'var' ID vardec1 -> ^(':=' ID vardec1)
			;
			
vardec1			: ':=' exp -> exp
			| ':' ID ':=' exp ->^(':=' ID exp)
			;

lvalue      		: ID lvalue2
           		;



lvalue1     		: '[' exp ']' lvalue2
            		| '.' ID  lvalue2
            		|
           		;
 
lvalue2 		: lvalue1
	;
  	     
           


seqexp    		: '(' exp (';' exp)* ')'
			;


callexp			:'(' exp (';' exp)* ')' -> exp 
  			;

exp			:// INTLIT
			//| '('exp')'
			//| negation
			//| callexp
			| infixassign // priorité operateur
			//| arrcreate
			//| reccreate
			//| assignment
			| ifthenelse
			//| ifthen
			| whileexp
			| forexp
			;


exp2 	:'[' exp ']' exp3
	| '.' ID lvalue2
	//|
	//|	callexp
	|	reccreate
	//|	infixassign
	|	callexp
	; 
	
exp3 	:	lvalue2
	| 'of' base
	; 
	
infixassign 	: infixor (':=' infixor)?
	//|	 '=' base

	;

infixor : infixand ('|' infixand)*
	;

infixand : comp ('&' comp)*
	;

comp : add ((INFIXCOMP|'=') add)* 
	;

add: mult(INFIXADDSOUS ^ mult)*
	;

mult : base(INFIXMULTDIV ^ base)*
	;

//division : base('/' base)*;

base : INTLIT
        |'-' base
        | ID ^ exp2* 
        //| seqexp
        | callexp
        | 'nil'
        | STRINGLIT
        | letexp
        | 'break'
		;


letexp   		: 'let' dec+ 'in' exp (';' exp)* 'end' -> 'let' dec+ 'in' exp+ 'end'
			;
			
negation 		: '-' exp
			;

arrcreate 		: '[' exp ']' 'of' exp
			;

reccreate 		: '{' (fieldcreate (','fieldcreate)* )?'}' // /!\ les fieldcreate sont séparés d'une ',' /!\
			;

fieldcreate 		: ID '=' exp
			;

assignment 		: lvalue2 ':=' exp
			;

ifthenelse 		: 'if' exp 'then'  exp ifelse
			;
			
ifelse 	:	(options {greedy = true;}: 'else' exp)?
	;

//ifthen 			: 'if' exp 'then' exp 
			

whileexp 		: 'while' exp 'do' exp
			;

forexp 			: 'for' ID ':=' exp 'to' exp 'do' exp
			;

			
WHILE : 'while';
INTLIT : ('0'..'9')+ ;
WS : (' '|'\n'|'\t'|'\r'|'\f')+{$channel=HIDDEN;};//|'\^ddd'|'\^c'|'\^"'|'\\'){$channel=HIDDEN;} ;// /!\ petit soucis avec les back slashs et certaines expressions /!\
STRINGLIT : ('"')('a'..'z'|'A'..'Z'|'0'..'9')*('"') ; // /!\ il faut lister tous les caractère imprimables ... :/ /!\4
//INFIXOP : ('('|')'|'-'|'*'|'/'|'+'|':=');

INFIXCOMP : ('>='|'<='|'<'|'>'|'='|'<>');
INFIXMULTDIV : ('*'|'/');
INFIXADDSOUS : ('-'|'+');

//COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
