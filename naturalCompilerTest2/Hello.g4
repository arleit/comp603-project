/**
 * Define a grammar called Hello
 */
grammar Hello;
program : block '.';

block :  ('const' IDENT '=' NUMBER ';')
         ('var' IDENT (',' IDENT)* ';') 
         ('procedure' IDENT ';' block ';')* statement ;


statement : ( IDENT ':=' expression | 'call' IDENT 
              | '?' IDENT | '!' expression 
              | 'begin' statement (';' statement )* 'end' 
              | 'if' condition 'then' statement 
              | 'while' condition 'do' statement ); 

condition : 'odd' expression |
            expression ('='|'#'|'<'|'<='|'>'|'>=') expression ;

expression : ('+'|'-') term ( ('+'|'-') term)*;

term : factor (('*'|'/' factor))*;

factor : IDENT | NUMBER | '(' expression ')';

IDENT : ('a'..'z')+; 
NUMBER: ('0'..'9')+;
WS : [ \r\n\t\n] -> skip ;