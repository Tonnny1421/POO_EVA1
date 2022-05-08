/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_16_comunicacion;

public class EVA1_16_COMUNICACION {

    public static void main(String[] args) {
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(100);
        objB.setValorB(objA.getValorA());
        System.out.println("Valor " + objA.getValorA());
        System.out.println("Valor " + objB.getValorB());
    }

}

class ClaseA {

    private int valorA;

    //Interfaz/Mensajes
    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

}

class ClaseB {

    private int valorB;

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
}
