/*
autor Andres Suarez
 */
package precedencia_opreadores;
import java.util.Scanner;

public class operadoresrelacionales {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("");
        int numero1=0;
        int numero2=0;
        int resultado= 0;
        System.out.println("ingrese el primer numero: "); 
        numero1=input.nextInt();
        System.out.println("ingrese la segundo numero: ");
        numero2=input.nextInt();
        if (numero1 != numero2){
            if(numero1 > numero2){
            System.out.println("El numero 1 es mayor  ");};
        }
            if (numero1<numero2){
            System.out.println("el numero 2 es mayor");
            }
            if (numero1 == numero2){
            System.out.println("los numeros ingresados son iguales");
            }
      
    
    }
}
