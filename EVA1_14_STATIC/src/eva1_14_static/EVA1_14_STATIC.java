/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_14_static;

public class EVA1_14_STATIC {

    public static void main(String[] args) {

        double areaC = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo " + areaC);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area del trinagulo " + areaT);
        FormulasMatematicas miObj =new FormulasMatematicas();
        miObj.imprimirMensaje();
    }

}

class FormulasMatematicas {
    static int valor=100;
    public static double calcularAreaCirculo(double radio) {
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    public void imprimirMensaje(){
    
        System.out.println("Hello World!");
    
    }
}
