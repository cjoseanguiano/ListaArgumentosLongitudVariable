/*
Uso de lista de longitud variable
 */
package listaargumentoslongitudvariable;

/**
 *
 * @author carlosjoseanguiano
 */
public class ListaArgumentosLongitudVariable {

    public static void main(String[] args) {

        double A = 1.2;
        double B = 1.3;
        double C = 1.4;
        double D = 1.5;

        System.out.println("Lista de valores 1");
        System.out.printf(""
                + "A = %.1f\n"
                + "B = %.1f\n"
                + "C = %.1f\n"
                + "D = %.1f\n",A,B,C,D);
        
        System.out.println("Lista de valores 2");
        System.out.printf(""
                + "A = %.1f\n"
                + "B = %.1f\n",A,B);
    }

    public static double promedio(double... numero) {

        double total = 0.0;

        for (double d : numero) {
            total += d;
        }
        return total / numero.length;
    }

}
