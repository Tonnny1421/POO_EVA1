/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

public class EVA1_9_MEMORIA_HEAP {
    public static void main(String[] args) {
        int i=5;
        prueba obj1 = new prueba();
        System.out.println(obj1);
        System.out.println(obj1.valor);
        prueba obj2 = new prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null;
        System.out.println(obj2.valor);
    }
}
class prueba{
    int valor = 100;
}
