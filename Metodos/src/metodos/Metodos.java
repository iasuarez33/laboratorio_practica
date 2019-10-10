/*
Autor: Andres Suarez
 */
package metodos;
import java.util.Scanner; 
public class Metodos {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        sinretornosinparametros programador = new sinretornosinparametros();
        sinretornoconparametros nombreusu = new sinretornoconparametros();
        
        String nombre = "";
        
        //utilizando un metodo con retorno sin parametros
        programador.mostrarfrase();
        
       System.out.println("Ingrese su nombre");
       nombre = input.nextLine();
       
       nombreusu.ingresarnombre(nombre);
       
       
    }
    
}
