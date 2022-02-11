
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author H8A
 */
public class Principal {
    
    public static void main(String[] args) throws Exception {
        String ruta = "C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/Lexer.flex";
        String ruta2 = "C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", 
            "C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/Sintax.cup"};
        generar(ruta, ruta2, rutaS);
    }
    
    
    public static void generar(String ruta, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        
        archivo= new File(ruta2);
        JFlex.Main.generate(archivo);
        
        //Generar la parte sinstáctica.
        java_cup.Main.main(rutaS);
        
        //Si ya encuentra un archivo dentro del proyecto:
        Path rutaSym = Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        
        //tABLA DE SÍMBOLOS,mover.
        Files.move(Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/sym.java"),
            Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/sym.java"));
        
        
        Path rutaSin = Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        
        
        Files.move(Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/Sintax.java"),
        Paths.get("C:/Users/H8A/Documents/NetBeansProjects/AnalizadorLexico/src/main/java/codigo/Sintax.java"));
    }
}
