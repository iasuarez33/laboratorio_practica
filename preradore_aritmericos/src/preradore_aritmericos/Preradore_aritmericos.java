/*
Ingeniero Andres Suarez
 */
package preradore_aritmericos;

import java.util.Scanner;

public class Preradore_aritmericos {
    

   
    public static void main(String[] args) {
        
        //Suma
        Scanner input =new Scanner (System.in);
        System.out.println("SUMA");
        
        int num1=0;
        int num2=0;
        int resul=0;
        
        System.out.print("Por Favor Ingrese el primer numero: ");
        
        num1=input.nextInt();
        
        System.out.print("Por Favor Ingrese el segundo numero: ");
        
        num2=input.nextInt();
        
        resul= num1+num2;
        System.out.println("Resultado: " + resul);
        
        //Resta
     
        System.out.println("RESTA");
        
        
        System.out.print("Por Favor Ingrese el primer numero: ");
        
        num1=input.nextInt();
        
        System.out.print("Por Favor Ingrese el segundo numero: ");
        
        num2=input.nextInt();
        
        resul= num1-num2;
        System.out.println("Resultado: " + resul);
        
        System.out.println("MULTIPLICACIÓN");
        
        
        System.out.print("Por Favor Ingrese el primer numero: ");
        
        num1=input.nextInt();
        
        System.out.print("Por Favor Ingrese el segundo numero: ");
        
        num2=input.nextInt();
        
        resul= num1*num2;
        System.out.println("Resultado: " + resul);
        
         System.out.println("DIVISIÓN");
        
        
        System.out.print("Por Favor Ingrese el primer numero: ");
        
        num1=input.nextInt();
        
        System.out.print("Por Favor Ingrese el segundo numero: ");
        
        num2=input.nextInt();
        
        resul= num1/num2;
        System.out.println("Resultado: " + resul);
        
        
    }
    }
    
    
        
        
        
    
    

