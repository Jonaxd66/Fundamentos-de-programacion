import java.util.Scanner;

public class Ejercicio1_Meses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("\nIngrese un mes (1-12): ");
            int mes;
            try {
                mes = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                continue;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Error: el mes debe estar comprendido entre 1 y 12.");
            } else {
                String nombreMes;
                int dias;

                switch (mes) {
                    case 1:  nombreMes = "Enero";      dias = 31; break;
                    case 2:  nombreMes = "Febrero";    dias = 28; break;
                    case 3:  nombreMes = "Marzo";      dias = 31; break;
                    case 4:  nombreMes = "Abril";      dias = 30; break;
                    case 5:  nombreMes = "Mayo";       dias = 31; break;
                    case 6:  nombreMes = "Junio";      dias = 30; break;
                    case 7:  nombreMes = "Julio";      dias = 31; break;
                    case 8:  nombreMes = "Agosto";     dias = 31; break;
                    case 9:  nombreMes = "Septiembre"; dias = 30; break;
                    case 10: nombreMes = "Octubre";    dias = 31; break;
                    case 11: nombreMes = "Noviembre";  dias = 30; break;
                    case 12: nombreMes = "Diciembre";  dias = 31; break;
                    default: nombreMes = "Desconocido"; dias = 0;
                }

                System.out.println("El mes " + mes + " es " + nombreMes + " y tiene " + dias + " días.");
            }

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
