/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_13_acces_modifiers;

public class Automovil {
    private String marca;
    private String modelo;
    private int año;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    void imprimirMensaje(){
    
            System.out.println("Hola mundo");
    }
    
}

class Carreta{//Modificador de acceso-->Default
    private String marcas;

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

}
