package codigo;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column
%char

Letra=[a-zA-Z]+
Digito=[0-9]+


%{
    public String lexeme;
    public int numero;
 InformacionAnalisis c= new InformacionAnalisis();

%}
%%

iniciar |
reproducir|
inverna |
dero |
comenzar |
terminar |
comprobar |
rutina |
temperatura |
humedad |
luz |
luminosidad |
si |
no |
complemento |
durante |
siempre |
min |
hr |
grados |
vaho |
temperatura_actual |
minimo |
maximo |
incrementar |
decrementar |
volumen |
musica |
detener |
pausar |
posicion |
continuar |
fertilizante |
fertliq |
fertsol |
cordx |
cordy |
por |
repetir |
empezar |
riego |
liquido |
mas |
menos |
sector |
tipo |
while {lexeme=yytext(); return Reservadas;}




(("-"|"+"|""){Digito}+(""|"."{Digito}+)) {numero=yychar; c.linea=yyline; lexeme=yytext(); return Numero;}
{Letra}({Letra}|{Digito}|_)* {numero=yychar; c.linea=yyline; lexeme=yytext(); return Identificador;}


"<" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Menor_que;}
">" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Mayor_que;}
"=" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Igual;}
"," {numero=yychar; c.linea=yyline; lexeme=yytext(); return COMA;}

("<""=") {numero=yychar; c.linea=yyline; lexeme=yytext(); return Menor_igual;}
(">""=") {numero=yychar; c.linea=yyline; lexeme=yytext(); return Mayor_igual;}
("=""=") {numero=yychar; c.linea=yyline; lexeme=yytext(); return Igual_igual;}


"+" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Suma;}
"-" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Resta;}
"/" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Multiplicacion;}
"*" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Division;}

"(" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Parentesis_a;}
")" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Parentesis_c;}
"{" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Llaves_a;}
"}" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Llaves_c;}
"[" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Corchete_a;}
"]" {numero=yychar; c.linea=yyline; lexeme=yytext(); return Corchete_c;}



(" "|\t|\r|\n)+ {/*Ignore*/}

"/""/".* {/*Ignore*/}

"/*"({Letra}|{Digito}|("#"|"’")|(":"|";"|".")|("("|")"|"["|"]"|"{"|"}")|("+"|"-")|("<"|">"|"=")|(" "|\t|\r|\n))+ "*/" {/*Ignore*/}


 . {c.linea=yyline; lexeme=yytext(); return ERROR;}
((("-"|"+"|""){Digito}+(""|"."{Digito}+))|(("-"|"+"|""){Digito}+("."{Digito}+|".")+)|_){Letra}({Letra}|{Digito}|_)* {numero=yychar; c.linea=yyline; lexeme=yytext(); return ERROR2;}
(("-"|"+"|""){Digito}+("."{Digito}+|".")+) {numero=yychar; c.linea=yyline; lexeme=yytext(); return ERROR3;}
("=""="+)|("<"+"="+)|(">"+"="+)|("<")+|(">")+ {numero=yychar; c.linea=yyline; lexeme=yytext(); return ERROR4;}
("*""/") {numero=yychar; c.linea=yyline; lexeme=yytext(); return ERROR5;}
("/""*") {numero=yychar; c.linea=yyline; lexeme=yytext(); return ERROR6;}





