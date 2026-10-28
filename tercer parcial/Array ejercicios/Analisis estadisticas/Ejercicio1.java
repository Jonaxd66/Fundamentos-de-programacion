import java.util.Arrays;

/*
 * Ejercicio 1. Análisis estadístico de ventas por sucursal
 * Práctica de arreglos bidimensionales en Java
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun",
                          "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

        String[] sucursales = {"Centro", "Norte", "Sur", "Oriente", "Poniente"};

        // Cada fila es una sucursal y cada columna es un mes
        double[][] ventas = {
            {12500.50, 11800.00, 13200.75, 12950.00, 14100.25, 15000.00, 14800.50, 13900.00, 12700.00, 13500.25, 16200.00, 18500.80},
            {9800.00, 10200.50, 9950.25, 10500.00, 11000.75, 10800.00, 11200.00, 10900.50, 10300.00, 10700.00, 12500.00, 14000.00},
            {7500.25, 7200.00, 7800.50, 8100.00, 8300.75, 8000.00, 7900.00, 8200.25, 7700.00, 8400.00, 9100.50, 10500.00},
            {15200.00, 14800.50, 15500.25, 16000.00, 16800.00, 17200.75, 17000.00, 16500.50, 15900.00, 16300.25, 18900.00, 21000.00},
            {6800.75, 6500.00, 7000.00, 7200.50, 7100.25, 7400.00, 7300.00, 7150.75, 6900.00, 7250.00, 8000.50, 9200.00}
        };

        int numSucursales = ventas.length;

        double[] totales = new double[numSucursales];
        double[] promedios = new double[numSucursales];
        int[] mejorMes = new int[numSucursales];

        System.out.println("===== ANÁLISIS DE VENTAS POR SUCURSAL =====\n");

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
        // Se hace una copia de los totales para no perder el orden original,
        // porque así sabemos qué total pertenece a cada sucursal.
        double[] totalesOrdenados = Arrays.copyOf(totales, totales.length);
        Arrays.sort(totalesOrdenados); // queda de menor a mayor

        System.out.println("\nTotales originales: " + Arrays.toString(totales));
        System.out.println("Totales ordenados:  " + Arrays.toString(totalesOrdenados));

        // Arreglo para marcar las sucursales que ya se mostraron (por si hay totales repetidos)
        boolean[] usada = new boolean[numSucursales];

        System.out.println("\nRanking de sucursales (mayor a menor):");
        int lugar = 1;
        for (int k = totalesOrdenados.length - 1; k >= 0; k--) {
            for (int i = 0; i < numSucursales; i++) {
                // buscamos a qué sucursal le corresponde este total
                if (!usada[i] && totales[i] == totalesOrdenados[k]) {
                    usada[i] = true;
                    System.out.printf("%d. %s - $%.2f%n", lugar, sucursales[i], totales[i]);
                    lugar++;
                    break;
                }
            }
        }
    }
}