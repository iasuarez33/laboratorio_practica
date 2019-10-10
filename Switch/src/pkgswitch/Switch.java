/*
Autor Andres Suarez
 */
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         int NotaEstudiante = 0;
        int NumeroEstudiantes=0;
        int EstudiantesCalificados=1;
        int ContadorEstudiantes=1;
        int CoExelente = 0;
        int CoBueno = 0;
        int CoRegular = 0;
        int CoMalo = 0;
        System.out.println("===Registro de Calificaciones===");
        
        System.out.print ("Ingrese el número de estudiantes ");
        NumeroEstudiantes = input.nextInt();
        
        while (EstudiantesCalificados<=NumeroEstudiantes){
          System.out.println("Ingrese la nota del estudiante"+ ContadorEstudiantes);
            NotaEstudiante = input.nextInt();
            EstudiantesCalificados++;
            ContadorEstudiantes++;
            
            switch(NotaEstudiante){
                case 10:
                case 9:
                    CoExelente++;
                    break;
                case 8:
                case 7:
                case 6:
                    CoBueno++;
                    break;
                case 5:
                case 4:
                    CoRegular++;
                    break;
                case 3:
                case 2:
                case 1:
                    CoMalo++;
                    
                    
                    System.out.println("Ingrese una calificaion válida");
                    break;
            }  
            
        }
        System.out.println("Los estudiantes con calificacion exelente son: "+CoExelente);
            System.out.println("Los estudiantes con calificacion buena son: "+CoBueno);
            System.out.println("Los estudiantes con calificacion regular son: "+CoRegular);
            System.out.println("Los estudiantes con calificacion mala son: "+CoMalo);
    }

    }
    
