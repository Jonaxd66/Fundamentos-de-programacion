import java.util.Arrays;

/*
 * Ejercicio 2. Detección y eliminación de registros duplicados
 * Práctica de arreglos en Java
 */
public class Deteccionyeliminacion {

    public static void main(String[] args) {

        // Arreglo de identificadores de transacciones (con duplicados)
        int[] ids = {1052, 2087, 1052, 3301, 4410, 2087, 5523, 1052, 6789, 3301, 7012, 8845};

        System.out.println("===== DEPURACIÓN DE TRANSACCIONES =====\n");
        System.out.println("Arreglo original: " + Arrays.toString(ids));
        System.out.println("Total de registros: " + ids.length + "\n");

        // 1. Identificar duplicados
        // Se ordena una COPIA para no modificar el orden del arreglo original
        int[] copia = Arrays.copyOf(ids, ids.length);
        Arrays.sort(copia);

        System.out.println("Copia ordenada: " + Arrays.toString(copia) + "\n");

        System.out.println("Identificadores duplicados:");
        boolean hayDuplicados = false;
        int i = 0;
        while (i < copia.length) {
            int contador = 1;

            // en el arreglo ordenado los repetidos quedan juntos
            while (i + contador < copia.length && copia[i + contador] == copia[i]) {
                contador++;
            }

            if (contador > 1) {
                System.out.println("- " + copia[i] + " aparece " + contador + " veces");
                hayDuplicados = true;
            }

            i = i + contador;
        }
        if (!hayDuplicados) {
            System.out.println("No se encontraron duplicados.");
        }

        // 2. Construir el arreglo sin duplicados conservando el orden original
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

        System.out.println("\nArreglo depurado: " + Arrays.toString(depurado));

        // 3. Informar cuántas apariciones se eliminaron
        int eliminadas = ids.length - depurado.length;
        System.out.println("\nRegistros originales: " + ids.length);
        System.out.println("Registros depurados: " + depurado.length);
        System.out.println("Apariciones eliminadas: " + eliminadas);
    }
}