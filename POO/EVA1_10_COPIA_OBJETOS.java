/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

public class EVA1_10_COPIA_OBJETOS {

    public static void main(String[] args) {
        Test obj1 = new Test();
        System.out.println("Direccion " + obj1);
        obj1.x = 100;
        System.out.println("Valor de x = " + obj1.x);
        //Test respaldo = obj1;
        Test respaldo = new Test();
        respaldo.x = obj1.x;

        System.out.println("Valor de x en el respaldo = " + respaldo.x);

        //modifico respaldo
        respaldo.x = 0;
        System.out.println("Valor de x = " + obj1.x);
        System.out.println("Valor de x en el respaldo = " + respaldo.x);

        //imprimir direcciones
        System.out.println("obj1 = " + obj1);
        System.out.println("respaldo = " + respaldo);
        if (obj1 == respaldo)
        {
            System.out.println("Son iguales");
        } else
        {
            System.out.println("Son diferentes");
        }
        {

        }
    }
}

class Test {

    public int x;
}
