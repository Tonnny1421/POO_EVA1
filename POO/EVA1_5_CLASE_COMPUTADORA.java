/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package POO;

public class EVA1_5_CLASE_COMPUTADORA {

    public static void main(String[] args) {
        PC myPC = new PC();
        myPC.setMarca("HP");
        myPC.setPrecio(29603.00);
        myPC.setProcesador("INTEL CORE DE 10ª GENERACIÓN");
        myPC.setRam(16);
        myPC.setSo("Windows 10");
        System.out.println("Marca: "+ myPC.getMarca());
        System.out.println("Precio: $"+ myPC.getPrecio());
        System.out.println("Procesador: "+ myPC.getProcesador());
        System.out.println("RAM: "+ myPC.getRam());
        System.out.println("Sistema Operativo: "+ myPC.getSo());
    }
}

class PC {
    
    private String procesador;
    private String so;
    private int ram;
    private String marca;
    private double precio;
    
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getSo() {
        return so;
    }

    public int getRam() {
        return ram;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
}
