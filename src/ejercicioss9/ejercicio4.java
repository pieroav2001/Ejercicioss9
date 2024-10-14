
package ejercicioss9;
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = leer.next();
        }

        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = leer.next();
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El nombre existe en la posicion: " + posicion);
        } else {
            System.out.println("El nombre no existe.");
        }
    }
}
