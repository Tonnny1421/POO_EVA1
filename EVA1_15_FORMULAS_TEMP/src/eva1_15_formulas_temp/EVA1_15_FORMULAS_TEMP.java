/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

public class EVA1_15_FORMULAS_TEMP {

    public static void main(String[] args) {
        Scanner spect = new Scanner(System.in);

        //Celsius
        System.out.println("Introduce la temperatura en grados Celsius: ");
        double celsius = spect.nextDouble();
        double farenheit = Conversiones.convertirCaF(celsius);
        System.out.println(celsius + "°C = " + farenheit + "°F");
        double kelvin = Conversiones.convertirCaK(celsius);
        System.out.println(celsius + "°C = " + kelvin + "°K");

        //Farenheit
        System.out.println("Introduce la temperatura en grados Farenheit: ");
        farenheit = spect.nextDouble();
        celsius = Conversiones.convertirFaC(farenheit);
        System.out.println(farenheit + "°F = " + celsius + "°C");
        kelvin = Conversiones.convertirFaK(farenheit);
        System.out.println(farenheit + "°F = " + kelvin + "°K");

        //Kelvin
        System.out.println("Introduce la temperatura en grados Kelvin: ");
        kelvin = spect.nextDouble();
        celsius = Conversiones.convertirKaC(kelvin);
        System.out.println(kelvin + "°K = " + celsius + "°C");
         farenheit = Conversiones.convertirKaF(kelvin);
        System.out.println(kelvin + "°K = " + farenheit + "°F");
        

    }

}

class Conversiones {

    //Celsius
    public static double convertirCaF(double celcius) {
        return celcius * 1.8 + 32;
    }

    public static double convertirCaK(double celcius) {
        return celcius + 273.15;
    }

    //Farenheit
    public static double convertirFaC(double farenheit) {
        return (farenheit - 32) / 1.8000;
    }

    public static double convertirFaK(double farenheit) {
        return ((farenheit - 32) / 1.8000) + 273.15;
    }

    //Kelvin
    public static double convertirKaC(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static double convertirKaF(double kelvin) {
        return ((kelvin - 273.15)*1.8)+32;
    }
}
