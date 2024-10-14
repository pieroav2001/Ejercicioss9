
package ejercicioss9;

import java.util.Scanner;

public class ejercicio3 {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero de compras: ");
        int n = leer.nextInt();
        double[] compras = new double[n];
        double suma = 0;
        double compraMayor = 0;
        double compraMenor = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra " + (i + 1) + ": ");
            compras[i] = leer.nextDouble();
            suma += compras[i];
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }

        double promedio = suma / n;
        System.out.println("Total de compras: " + suma);
        System.out.println("Promedio de compras: " + promedio);
        System.out.println("Compra mayor: " + compraMayor);
        System.out.println("Compra menor: " + compraMenor);
    }
}