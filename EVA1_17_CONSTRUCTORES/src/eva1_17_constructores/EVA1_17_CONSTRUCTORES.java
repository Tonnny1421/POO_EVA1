/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_17_constructores;

public class EVA1_17_CONSTRUCTORES {

    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.getNombre());
        System.out.println(persona.edad);

        Persona persona2 = new Persona();
        System.out.println(persona2.getNombre());
        System.out.println(persona2.edad);

        Persona persona3 = new Persona("Ruben", 40);
        System.out.println(persona3.getNombre());
        System.out.println(persona3.edad);
    }

}

class Persona {

    String id;
    String nombre;
    int edad;

    //Constructor
    public Persona() {
        System.out.println("Creando obj");
        nombre = "Juan Perez";
        edad = 100;
    }

    public Persona(String nombre, int edad) {
        System.out.println("Creando obj con constructor que acepta vaLores");
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
