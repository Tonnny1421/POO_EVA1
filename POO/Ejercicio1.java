/*
 *Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner spect = new Scanner(System.in);
        System.out.println("Ingresa un numero un numero del 1 al 7 para determinar el dia");
        int dia;
        boolean c;
        dia = spect.nextInt();
        do
        {
            switch (dia)
            {
                case 1:
                    System.out.println("Lunes");
                    c = true;
                    break;
                case 2:
                    System.out.println("Martes");
                    c = true;
                    break;
                case 3:
                    System.out.println("Miercoles");
                    c = true;
                    break;
                case 4:
                    System.out.println("Jueves");
                    c = true;
                    break;
                case 5:
                    System.out.println("Viernes");
                    c = true;
                    break;
                case 6:
                    System.out.println("Sabado");
                    c = true;
                    break;
                case 7:
                    System.out.println("Domingo");
                    c = true;
                    break;
                    
                default:
                    System.out.println("Error, ingresaste un numero erroneo");
                    c=false;

            }
        } while (c = false);
    }
}
