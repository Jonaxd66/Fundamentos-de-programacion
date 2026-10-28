import java.util.Arrays;
import java.util.Scanner;

public class Deteccionyeliminacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cantidad de registros
        int n;
        do {
            System.out.print("¿Cuántas transacciones desea capturar? ");
            while (!sc.hasNextInt()) {
                System.out.print("Valor inválido. Escriba un número entero: ");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Debe ser mayor que cero.");
            }
        } while (n <= 0);

        // Arreglo de identificadores de transacciones (capturados por el usuario)
        int[] ids = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.print("Identificador " + (j + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Valor inválido. Escriba un número entero: ");
                sc.next();
            }
            ids[j] = sc.nextInt();
        }

        System.out.println("\n===== DEPURACIÓN DE TRANSACCIONES =====\n");
        System.out.println("Arreglo original: " + Arrays.toString(ids));

        // 1. Construir el arreglo sin duplicados conservando el orden original
        int[] depurado = new int[ids.length]; // tamaño máximo posible
        int tam = 0; // cuántos elementos llevamos guardados

        for (int j = 0; j < ids.length; j++) {
            boolean yaExiste = false;

            // revisamos si el id ya está en el arreglo depurado
            for (int k = 0; k < tam; k++) {
                if (depurado[k] == ids[j]) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                depurado[tam] = ids[j];
                tam++;
            }
        }

        // Se ajusta el tamaño del arreglo para quitar los espacios sobrantes
        depurado = Arrays.copyOf(depurado, tam);

        System.out.println("Arreglo depurado: " + Arrays.toString(depurado));

        // 2. Identificar duplicados (en el orden en que aparecen por primera vez)
        String duplicados = "";
        for (int k = 0; k < depurado.length; k++) {
            int contador = 0;
            for (int j = 0; j < ids.length; j++) {
                if (ids[j] == depurado[k]) {
                    contador++;
                }
            }
            if (contador > 1) {
                if (!duplicados.isEmpty()) {
                    duplicados += ", ";
                }
                duplicados += depurado[k];
            }
        }
        if (duplicados.isEmpty()) {
            duplicados = "No se encontraron duplicados";
        }
        System.out.println("Identificadores duplicados: " + duplicados);

        // 3. Informar cuántos registros se eliminaron
        int eliminadas = ids.length - depurado.length;
        System.out.println("Registros eliminados: " + eliminadas);

        sc.close();
    }
}
