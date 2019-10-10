
package pkgif;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
       // Condiconal if 
        //Crear un algoritmo que indique si la contraseña ingresada e corrta 
        //Variables
        Scanner input = new Scanner (System.in);
        
        String Passystem = "8520";
        String PassIngresada = "";
        //Ingresar al sistema
        System.out.println("Ingrese su contraseña");
        PassIngresada = input.nextLine();
         
         if (PassIngresada.equals(Passystem)) {
             System.out.println("Bienvenido");
         }
         else {
             System.out.println("Contraseña incorrecta");
         }
     }
    }
    

