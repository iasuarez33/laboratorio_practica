/*
Autor: Andres Suarez
 */
package metodo1;
import java.util.Scanner;
public class ConRetornoConParametros {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        FormatoFechas FechaMes = new FormatoFechas();
        int DiaNacimiento = 0;
        int MesNacimiento = 0;
        int AnyoNacimiento = 0;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print (" Ingrese el dia: ");
        DiaNacimiento = input.nextInt();
        System.out.print("Ingrese el mes ");
        MesNacimiento = input.nextInt();
        System.out.print("Ingrese el año ");
        AnyoNacimiento = input.nextInt();
    }
}
