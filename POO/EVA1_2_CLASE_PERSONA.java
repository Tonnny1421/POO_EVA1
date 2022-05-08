/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */ 
package POO;

public class EVA1_2_CLASE_PERSONA {
    public static void main(String[] args) {
         System.out.println("Hello World!!");
         Persona estudiante = new Persona();
         estudiante.id="21550740";
         estudiante.nombre="Luis Garcia";
         estudiante.edad = 18;
         
         Persona estudiante2 = new Persona();
         estudiante2.id="1111111";
         estudiante2.nombre="Juan Perez";
         estudiante2.edad = 18;
                         
          System.out.println(estudiante.nombre);
          System.out.println(estudiante2.nombre);
      }
}
class Persona{
    String id;
    String nombre;
    int edad;
}