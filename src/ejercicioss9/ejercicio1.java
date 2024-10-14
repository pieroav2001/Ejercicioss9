
package ejercicioss9;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = leer.nextInt();
        double[] pesos = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = leer.nextDouble();
            suma += pesos[i];
        }

        double promedio = suma / n;
        System.out.println("El peso promedio es: " + promedio);
    }
}
