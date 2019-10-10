/*
Autor: Andres Suarez
 */
package practica;
import java.util.Scanner;
public class Practica {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        
        String Usuario = "Andres";
        String UsuarioIngresado = "";
        String Passystem = "8715";
        String PassIngresada = "";
        //Ingresar al sistema
     
        
         System.out.println("Ingrese Su Usuario");
        UsuarioIngresado= input.nextLine();
        
         
         if (UsuarioIngresado.equals(Usuario)) { 
             System.out.println("Ingrese su contraseña");
             PassIngresada = input.nextLine();
        
            if (PassIngresada.equals(Passystem)){
                System.out.println(Usuario + "  Bienvenido usted ha ingresado correctamente");
            }
            else{
                System.out.println("Error de contraseña");
            }
             
         }
         else{ 
         System.out.println    ("Usuario no registrado");
     }
    }
    }
    
  
