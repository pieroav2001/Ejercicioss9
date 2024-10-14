
package ejercicioss9;

import java.util.Scanner;

public class ejercicio5 {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        System.out.println("Ingrese 5 numeros para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = leer.nextInt();
        }

        System.out.println("Ingrese 5 numeros para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            b[i] = leer.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            c[i * 2] = a[i];
            c[i * 2 + 1] = b[i];
        }

        System.out.print("Valores del arreglo c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}