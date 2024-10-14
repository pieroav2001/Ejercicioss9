
package ejercicioss9;
import java.util.Scanner;


public class ejercicio2 {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = leer.nextInt();
        double[] ingresos = new double[n];
        double suma = 0;
        double ingresoMayor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = leer.nextDouble();
            suma += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        double promedio = suma / n;
        System.out.println("Ingreso promedio: " + promedio);
        System.out.println("Ingreso mayor: " + ingresoMayor);
    }
}
