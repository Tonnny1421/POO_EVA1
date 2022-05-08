/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

public class EVA1_7_MEMORIA {
    public static void main(String[] args) {
        int valor = 5;
        String cade="Hola";
        Prueba obj = new Prueba();
        
        System.out.println("Valor = "+ valor);
        System.out.println("Cadena = "+cade);
        System.out.println("Obj = "+obj);
    }
}
class Prueba{
    
    public void saludar(){
        System.out.println("Hola mundo!");
    }

}
