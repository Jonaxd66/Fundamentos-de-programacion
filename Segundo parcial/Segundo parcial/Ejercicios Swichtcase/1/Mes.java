import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int mes;

        // Leer entrada del usuario
        System.out.print("Ingrese el número del mes (1-12): ");
        mes = sc.nextInt();

        // Switch para mostrar los días de cada mes
        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
                break;

            case 2:
                System.out.println("Febrero tiene 28/29 días");
                break;

            case 3:
                System.out.println("Marzo tiene 31 días");
                break;

            case 4:
                System.out.println("Abril tiene 30 días");
                break;

            case 5:
                System.out.println("Mayo tiene 31 días");
                break;

            case 6:
                System.out.println("Junio tiene 30 días");
                break;

            case 7:
                System.out.println("Julio tiene 31 días");
                break;

            case 8:
                System.out.println("Agosto tiene 31 días");
                break;

            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;

            case 10:
                System.out.println("Octubre tiene 31 días");
                break;

            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;

            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;

            default:
                System.out.println("❌ Mes no válido. Ingrese un número entre 1 y 12");
        }

        sc.close();
    }
}
