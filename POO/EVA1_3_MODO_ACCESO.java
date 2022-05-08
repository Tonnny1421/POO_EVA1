/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

public class EVA1_3_MODO_ACCESO {

    public static void main(String[] args) {
        persona per1 = new persona();
        per1.setId("21550740");
        per1.setNombre("Luis");
        per1.setEdad(18);
        
        System.out.println("Nombre "+ per1.getNombre());
        System.out.println("Edad "+ per1.getEdad());
        System.out.println("No. control "+ per1.getId());
        
        persona per2 = new persona();
        per2.setId("21550741");
        per2.setNombre("Tony");
        per2.setEdad(18);
        
        System.out.println( per2.getNombre()+", "+per2.getId());   
    }
}

class persona {

    private String id;
    private String nombre;
    private int edad;

    //Leer---> GET
    public String getId() {
        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Asignar---> SET
    public void setId(String valor) {
        id = valor;
    }
    
    public void setNombre(String valor) {
        nombre = valor;
    }
    
    public void setEdad(int valor) {
        edad = valor;
    }
}
