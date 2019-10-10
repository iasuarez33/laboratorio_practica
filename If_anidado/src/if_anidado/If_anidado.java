/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_anidado;
import java.util.Scanner;

public class If_anidado {

  
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
                System.out.println("Bienvenido");
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
    

