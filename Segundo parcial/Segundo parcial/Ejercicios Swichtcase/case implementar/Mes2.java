import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String continuar;

        do {
            System.out.print("\nIngrese el número del mes (1-12): ");
            mes = sc.nextInt();

            switch (mes) {
                case 1 -> System.out.println("Enero tiene 31 días");
                case 2 -> System.out.println("Febrero tiene 28/29 días");
                case 3 -> System.out.println("Marzo tiene 31 días");
                case 4 -> System.out.println("Abril tiene 30 días");
                case 5 -> System.out.println("Mayo tiene 31 días");
                case 6 -> System.out.println("Junio tiene 30 días");
                case 7 -> System.out.println("Julio tiene 31 días");
                case 8 -> System.out.println("Agosto tiene 31 días");
                case 9 -> System.out.println("Septiembre tiene 30 días");
                case 10 -> System.out.println("Octubre tiene 31 días");
                case 11 -> System.out.println("Noviembre tiene 30 días");
                case 12 -> System.out.println("Diciembre tiene 31 días");
                default -> System.out.println("❌ Mes no válido. Ingrese un número entre 1 y 12");
            }

            System.out.print("\n¿Desea consultar otro mes? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por usar el programa!");
        sc.close();
    }
}