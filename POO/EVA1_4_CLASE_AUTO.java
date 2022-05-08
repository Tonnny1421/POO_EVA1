
package POO;

public class EVA1_4_CLASE_AUTO {

    public static void main(String[] args) {
        Automovil myCar = new Automovil();
        myCar.setMarca("Ford");
        myCar.setModelo("Mustang");
        myCar.setTipo("Sedan");
        myCar.setAño(2022);
        myCar.setColor("Rojo");
        myCar.setPrecio(116700.00);

        System.out.println("Marca: " + myCar.getMarca());
        System.out.println("Modelo: " + myCar.getModelo());
        System.out.println("Año: " + myCar.getAño());

    }
}

class Automovil {

    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;

    public void setMarca(String valor) {
        marca = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String valor) {
        modelo = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String valor) {
        tipo = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public int getAño() {
        return año;
    }

    public void setColor(String valor) {
        color = valor;
    }

    public String getColor() {
        return color;
    }

    public void setPrecio(double valor) {
        precio = valor;
    }

    public double getPrecio() {
        return precio;
    }

}
