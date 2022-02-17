package codigo;
import java_cup.runtime.Symbol;
import codigo.JFprincipal;

%%
%class LexerCup
%type java_cup.runtime.Symbol

%line
%column
%char
%cup
%full


Letra=[a-zA-Z]+
Digito=[0-9]+


%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    public int numero;
    InformacionAnalisis c= new InformacionAnalisis();

%}
%%


iniciar {return new Symbol(sym.Iniciar, yychar, yyline, yytext());}
inverna {return new Symbol(sym.Inverna, yychar, yyline, yytext());}
dero {return new Symbol(sym.Dero, yychar, yyline, yytext());}
comenzar {return new Symbol(sym.Comenzar, yychar, yyline, yytext());}
terminar {return new Symbol(sym.Terminar, yychar, yyline, yytext());}
comprobar {return new Symbol(sym.Comprobar, yychar, yyline, yytext());}
reproducir {return new Symbol(sym.Reproducir, yychar, yyline, yytext());}
rutina {return new Symbol(sym.Rutina, yychar, yyline, yytext());}
temperatura {return new Symbol(sym.Temperatura, yychar, yyline, yytext());}
humedad {return new Symbol(sym.Humedad, yychar, yyline, yytext());}
luz {return new Symbol(sym.Luz, yychar, yyline, yytext());}
luminosidad {return new Symbol(sym.Luminosidad, yychar, yyline, yytext());}
si {return new Symbol(sym.Si, yychar, yyline, yytext());}
no {return new Symbol(sym.No, yychar, yyline, yytext());}
complemento {return new Symbol(sym.Complemento, yychar, yyline, yytext());}
durante {return new Symbol(sym.Durante, yychar, yyline, yytext());}
siempre {return new Symbol(sym.Siempre, yychar, yyline, yytext());}
min {return new Symbol(sym.Min, yychar, yyline, yytext());}
hr {return new Symbol(sym.Hr, yychar, yyline, yytext());}
grados {return new Symbol(sym.Grados, yychar, yyline, yytext());}
vaho {return new Symbol(sym.Vaho, yychar, yyline, yytext());}
temperatura_actual {return new Symbol(sym.Temperatura_actual, yychar, yyline, yytext());}
minimo {return new Symbol(sym.Minimo, yychar, yyline, yytext());}
maximo {return new Symbol(sym.Maximo, yychar, yyline, yytext());}
incrementar {return new Symbol(sym.Incrementar, yychar, yyline, yytext());}
decrementar {return new Symbol(sym.Decrementar, yychar, yyline, yytext());}
volumen {return new Symbol(sym.Volumen, yychar, yyline, yytext());}
musica {return new Symbol(sym.Musica, yychar, yyline, yytext());}
detener {return new Symbol(sym.Detener, yychar, yyline, yytext());}
pausar {return new Symbol(sym.Pausar, yychar, yyline, yytext());}
posicion {return new Symbol(sym.Posicion, yychar, yyline, yytext());}
continuar {return new Symbol(sym.Continuar, yychar, yyline, yytext());}
fertilizante {return new Symbol(sym.Fertilizante, yychar, yyline, yytext());}
fertliq {return new Symbol(sym.Fertliq, yychar, yyline, yytext());}
fertsol {return new Symbol(sym.Fertsol, yychar, yyline, yytext());}
cordx {return new Symbol(sym.Cordx, yychar, yyline, yytext());}
cordy {return new Symbol(sym.Cordy, yychar, yyline, yytext());}
por {return new Symbol(sym.Por, yychar, yyline, yytext());}
repetir {return new Symbol(sym.Repetir, yychar, yyline, yytext());}
empezar {return new Symbol(sym.Empezar, yychar, yyline, yytext());}
riego {return new Symbol(sym.Riego, yychar, yyline, yytext());}
liquido {return new Symbol(sym.Liquido, yychar, yyline, yytext());}
mas {return new Symbol(sym.Mas, yychar, yyline, yytext());}
menos {return new Symbol(sym.Menos, yychar, yyline, yytext());}
sector {return new Symbol(sym.Sector, yychar, yyline, yytext());}
tipo {return new Symbol(sym.Tipo, yychar, yyline, yytext());}




(("-"|"+"|""){Digito}+(""|"."{Digito}+)) {return new Symbol(sym.Numero, yychar, yyline, yytext());}
{Letra}({Letra}|{Digito}|_)* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}



"<" {return new Symbol(sym.Menor_que, yychar, yyline, yytext());}
">" {return new Symbol(sym.Mayor_que, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}

("<""=") {return new Symbol(sym.Menor_igual, yychar, yyline, yytext());}
(">""=") {return new Symbol(sym.Mayor_igual, yychar, yyline, yytext());}
("=""=") {return new Symbol(sym.Igual_igual, yychar, yyline, yytext());}

( "#"|"’" ) {return new Symbol(sym.CaracterEs, yychar, yyline, yytext());}
( ":"|".") {return new Symbol(sym.Signo_Puntuacion, yychar, yyline, yytext());}

"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
"," {return new Symbol(sym.COMA, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

"(" {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
")" {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
"{" {return new Symbol(sym.Llaves_a, yychar, yyline, yytext());}
"}" {return new Symbol(sym.Llaves_c, yychar, yyline, yytext());}
"[" {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
"]" {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}



(" "|\t|\r|\n)+ {/*Ignore*/}

"//".* {/*Ignore*/}

"/*"({Letra}|{Digito}|("#"|"’")|(":"|";"|".")|("("|")"|"["|"]"|"{"|"}")|("+"|"-")|("<"|">"|"=")|(" "|\t|\r|\n))+ "*/" {/*Ignore*/}


 . {String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: Caracter no valido '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);}

((("-"|"+"|""){Digito}+(""|"."{Digito}+))|(("-"|"+"|""){Digito}+("."{Digito}+|".")+)|_){Letra}({Letra}|{Digito}|_)* {
                                                    String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: Cadena no valida '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
                                              }

(("-"|"+"|""){Digito}+("."{Digito}+|".")+) {String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: numero no valido '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
}

("=""="+)|("<"+"="+)|(">"+"="+)|("<")+|(">")+ {String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: operador de asignacion no valida '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
}

("*""/") {String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: falta apertura de comentario '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);}
("/""*") {String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: falta cierre de comentario '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);}

