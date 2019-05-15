grammar Expr;

options {
	language = Java;
	output = AST;
	backtrack = false;
	k=1;
}

tokens {AFFECTATT;MOINS_UNAIRE;ARRAY;OF; ITERATION ;CALLCROCHET ;ATTRIBUT;AFFECT;TYPEARRAYDEC
; COND; IF; ELSE; ELSEIF; BLOCK; PLUS;ROOT; MOINS;MOINS_UNAIRE;MULT;WHILE;VARSIMPLE
; DIV; FOR; DO; EGAL; TYPERENAME; ARGDEC ;FUNCDEC;ARG;RETURN;TYPEDEC;LET;VARDEC;THEN;IN;CALL;CALLEXP;PARAM;CALLFUN;END;VARARRAYDEC ; VARRECORD; FINBLOCK; VARSIMPLE; ATTRIBUTAFFECT; }

program			: exp ->^(ROOT exp)
			;


dec			: tydec
			| vardec
			| fundec
			;

tydec		    	: 'type' ID '=' ty ->^(TYPEDEC ID  ty)
		   	;

ty 			: ID -> ^(TYPERENAME ID)
			| arrty -> ^(TYPEARRAYDEC arrty)
			| recty -> ^(ATTRIBUT recty)
			;

arrty			: 'array' 'of' ID  -> ID
			;

recty			: '{' (fielddec (','fielddec)*)?  '}' ->  (fielddec+)?               // /!\ les fielddec doivent être séparés d'une ',' /!\
			;

fielddec		: ID ':' ID ->^(ARGDEC ID ID)
			;

fundec			: 'function' ID '(' (fielddec(','fielddec)*)? ')' (':' ID)? '=' exp ->^(FUNCDEC ID ^(PARAM  fielddec*) ^(BLOCK exp) ^(RETURN ID)? )// /!\ les fielddec doivent être séparés d'une ',' /!\
			;

vardec			: 'var' ID vardec1 -> ^(VARDEC ID vardec1)
			;
vardec1			: ':=' decexp -> decexp
			| ':' ID ':=' decexp -> ID decexp
			;
			
			
			
			
decexp			:
			| decinfixassign // priorité operateur
			| ifthenelse
			
			| whileexp
			| forexp

			;
			

			
decinfixassign 	:  decinfixor (':='^ decinfixor )? 
	//|	 '=' base

	;

decinfixor : decinfixand ('|'^ decinfixand)*
	;

decinfixand : deccomp ('&' ^deccomp)*
	;

deccomp : decadd ((INFIXCOMP ^ |'=' ^ ) decadd)* 
	;

decadd:  decmult(('-'|'+')^decmult)* 
	;

decmult : decbase(INFIXMULTDIV ^ decbase)*
	;


decbase : INTLIT -> ^(VARSIMPLE  INTLIT)
        |'-'  decbase  -> ^(MOINS_UNAIRE  decbase)
        | ID ( '.' att=ID( exp2|) -> ^(ATTRIBUTAFFECT ID $att (exp2)?)|callcrochet ->^(VARARRAYDEC  ID callcrochet)| callexp -> ^(CALLFUN ID  callexp) | reccreate -> ^( VARRECORD ID reccreate)| -> ^( ID   )  )
        | seqexp
        | 'nil'
        
        | STRINGLIT -> ^(VARSIMPLE  STRINGLIT)
        | letexp
        | 'break'
		;

lvalue      		: ID exp2
           		;



seqexp    			: '(' exp (';' exp)*')' -> exp*
			;
			


callexp			:'(' exp (',' exp)* ')' -> ^(ARG exp*)
  			;

exp			:
			| infixassign // priorité operateur
			| ifthenelse
			| whileexp
			| forexp
		
			;


exp2 	: 'of' base    -> ^(OF base)
	|'.' ID( exp2|) -> ^(ATTRIBUT ID (exp2)?)
	//|	infixassign
	; 
callcrochet  	: ('[' exp ']')+ (exp2)?  -> exp+  (exp2)?
;


	
infixassign 	:  infixor (':='^ infixor )? 
	//|	 '=' base

	;

infixor : infixand ('|'^ infixand)*
	;

infixand : comp ('&' ^comp)*
	;

comp : add ((INFIXCOMP ^ |'=' ^ ) add)* 
	;

add:  mult(('-'|'+')^mult)* 
	;

mult : base(INFIXMULTDIV ^ base)*
	;


base : INTLIT
        |'-'  base  -> ^(MOINS_UNAIRE base)
        | ID ( '.' att=ID( exp2)? -> ^(ATTRIBUTAFFECT ID $att (exp2)?)
        	|callcrochet ->^(CALLCROCHET ID callcrochet)
        	| callexp -> ^(CALLFUN ID  callexp) 
        	| reccreate -> ^( VARRECORD ID reccreate)
        	|->^( ID   )     	
        	)
        | seqexp
        | 'nil'
        | STRINGLIT
        | letexp
        | 'break'
		;

        


letexp   		: 'let' dec* ('in' exp (';' exp)*)? 'end' ->  ^( LET dec*)  ^(IN exp*)? ^(END)
			;
			
negation 		: '-' exp
			;

arrcreate 		: '[' exp ']' 'of' exp
			;

reccreate 		: '{' (fieldcreate (','fieldcreate)* )?'}' ->fieldcreate*  
			;

fieldcreate 		: ID '=' exp -> ^(AFFECTATT  ID exp)
			;

assignment 		: base ':=' exp
			;

ifthenelse 		: 'if' cond=exp 'then'  alors=exp (options {greedy = true;}: 'else' sinon=exp)? ->^(IF ^(COND $cond) ^(THEN $alors) (^(ELSE $sinon))? )
			;
			
ifelse 	:	(options {greedy = true;}: 'else' exp)?
		;

//ifthen 			: 'if' exp 'then' exp 
			

whileexp 		: 'while' exp 'do' exp -> ^(WHILE ^(COND exp) ^(BLOCK exp))
			;

forexp 		: 'for' ID ':=' ini=exp 'to' f=exp 'do' instru=exp   -> ^(FOR ^(ITERATION ID $ini $f) ^(DO $instru))
			;

ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;		
INTLIT : ('0'..'9')+ ;

            //|'\^ddd'|'\^c'|'\^"'|'\\'){$channel=HIDDEN;} ;// /!\ petit soucis avec les back slashs et certaines expressions /!\
STRINGLIT : '"' (~('"' | '\\' ) | '\\' ('"' | '\\' | 'n' | 't'))* '"';
//STRINGLIT : ('"')(.)*('"') ; // /!\ il faut lister tous les caractère imprimables ... :/ /!\4
INFIXCOMP : ('>='|'<='|'<'|'>'|'='|'<>');
INFIXMULTDIV : ('*'|'/');

//COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};


WHITESPACE  :   ( ' '
        | '\t'
        | '\r' 
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

MLCOMMENT : '/*' (options {greedy=false;}  : (MLCOMMENT|.) )* '*/' { $channel = HIDDEN; };