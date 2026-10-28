import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // los decimales se escriben con punto (ej. 12500.50)

        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun",
                          "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

        // Número de sucursales
        int numSucursales;
        do {
            System.out.print("¿Cuántas sucursales desea capturar? ");
            while (!sc.hasNextInt()) {
                System.out.print("Valor inválido. Escriba un número entero: ");
                sc.next();
            }
            numSucursales = sc.nextInt();
            if (numSucursales <= 0) {
                System.out.println("Debe ser mayor que cero.");
            }
        } while (numSucursales <= 0);
        sc.nextLine(); // limpiar el salto de línea

        String[] sucursales = new String[numSucursales];
        double[][] ventas = new double[numSucursales][meses.length];

        // Captura de datos
        for (int i = 0; i < numSucursales; i++) {
            System.out.print("\nNombre de la sucursal " + (i + 1) + ": ");
            sucursales[i] = sc.nextLine();

            for (int j = 0; j < meses.length; j++) {
                double valor;
                do {
                    System.out.print("  Ventas de " + sucursales[i] + " en " + meses[j] + ": $");
                    while (!sc.hasNextDouble()) {
                        System.out.print("  Valor inválido. Escriba un número: $");
                        sc.next();
                    }
                    valor = sc.nextDouble();
                    if (valor < 0) {
                        System.out.println("  Las ventas no pueden ser negativas.");
                    }
                } while (valor < 0);
                ventas[i][j] = valor;
            }
            sc.nextLine(); // limpiar el salto de línea
        }

        double[] totales = new double[numSucursales];
        double[] promedios = new double[numSucursales];
        int[] mejorMes = new int[numSucursales];

        System.out.println("\n===== ANÁLISIS DE VENTAS POR SUCURSAL =====\n");

        // 1. Total anual, promedio mensual y mejor mes de cada sucursal
        for (int i = 0; i < numSucursales; i++) {
            double suma = 0;
            double mayor = ventas[i][0];
            int posMayor = 0;

            for (int j = 0; j < ventas[i].length; j++) {
                suma += ventas[i][j];
                if (ventas[i][j] > mayor) {
                    mayor = ventas[i][j];
                    posMayor = j;
                }
            }

            totales[i] = suma;
            promedios[i] = suma / ventas[i].length;
            mejorMes[i] = posMayor;

            System.out.println("Sucursal: " + sucursales[i]);
            System.out.println("Ventas: " + Arrays.toString(ventas[i]));
            System.out.printf("Total anual: $%.2f%n", totales[i]);
            System.out.printf("Promedio mensual: $%.2f%n", promedios[i]);
            System.out.printf("Mes con más ventas: %s ($%.2f)%n%n", meses[posMayor], mayor);
        }

        // 2. Promedio global (promedio de los totales anuales de todas las sucursales)
        double sumaGlobal = 0;
        for (int i = 0; i < numSucursales; i++) {
            sumaGlobal += totales[i];
        }
        double promedioGlobal = sumaGlobal / numSucursales;

        System.out.printf("Promedio global de ventas anuales: $%.2f%n%n", promedioGlobal);

        // 3. Sucursales que superan el promedio global
        System.out.println("Sucursales que superan el promedio global:");
        boolean hayAlguna = false;
        for (int i = 0; i < numSucursales; i++) {
            if (totales[i] > promedioGlobal) {
                System.out.printf("- %s ($%.2f)%n", sucursales[i], totales[i]);
                hayAlguna = true;
            }
        }
        if (!hayAlguna) {
            System.out.println("Ninguna sucursal supera el promedio.");
        }

        // 4. Ordenar sucursales por ventas anuales (de mayor a menor)
        double[] totalesOrdenados = Arrays.copyOf(totales, totales.length);
        Arrays.sort(totalesOrdenados); // queda de menor a mayor

        System.out.println("\nTotales originales: " + Arrays.toString(totales));
        System.out.println("Totales ordenados:  " + Arrays.toString(totalesOrdenados));

        // Marca las sucursales ya mostradas (por si hay totales repetidos)
        boolean[] usada = new boolean[numSucursales];

        System.out.println("\nRanking de sucursales (mayor a menor):");
        int lugar = 1;
        for (int k = totalesOrdenados.length - 1; k >= 0; k--) {
            for (int i = 0; i < numSucursales; i++) {
                if (!usada[i] && totales[i] == totalesOrdenados[k]) {
                    usada[i] = true;
                    System.out.printf("%d. %s - $%.2f%n", lugar, sucursales[i], totales[i]);
                    lugar++;
                    break;
                }
            }
        }

        sc.close();
    }
}
