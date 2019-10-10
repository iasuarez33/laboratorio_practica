/*
Autor: Andrers Suarez
 */
package precedencia_operadores;
   import java.util.Scanner;

public class Precedencia_operadores {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("OPERADORES");
        int nota1=0;
        int nota2=0;
        int nota3=0;
        System.out.println("ingrese la primera nota: "); 
        nota1=input.nextInt();
        System.out.println("ingrese la segunda nota: ");
        nota2=input.nextInt();
        System.out.println("ingrese la tercera nota: "); 
        nota3=input.nextInt();
        int resultado = (nota1 + nota2 + nota3)/ 3;
       System.out.println("El promedio de las notas es: " + resultado);
       
       System.out.println("==============================");
      
       System.out.println("Voleteria para los cololegios");
       int colegio1=0;
       int colegio2=0;
       int colegio3=0;
       double resultado1=0;
       System.out.println("ingrese el numero de estudiantes: "); 
        colegio1=input.nextInt();
        System.out.println("ingrese el numero de estudiantes: ");
        colegio2=input.nextInt();
        System.out.println("ingrese el numero de estudiantes: "); 
        colegio3=input.nextInt();
        resultado1=(colegio1 + colegio2 + colegio3)/3;
        System.out.println("El promedio de voletas a realizar son: " + resultado1);
       
       
               
      
    }
    
}
