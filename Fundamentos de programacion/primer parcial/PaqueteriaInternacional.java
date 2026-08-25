import java.util.Scanner;

public class PaqueteriaInternacional {

    public static double tarifaPorZona(int zona) {
        switch (zona) {
            case 1: return 11;  // America del Norte
            case 2: return 10;  // America Central
            case 3: return 12;  // America del Sur
            case 4: return 25;  // Europa
            case 5: return 30;  // Asia
            default: return -1; // zona invalida
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso del paquete (kg): ");
        double pesoKg = sc.nextDouble();
        System.out.print("Zona (1-5): ");
        int zona = sc.nextInt();

        if (pesoKg > 5) {
            System.out.println("Paquete rechazado: excede el peso maximo permitido (5 kg).");
        } else {
            double tarifa = tarifaPorZona(zona);
            double pesoGramos = pesoKg * 1000;
            double costo = pesoGramos * tarifa;
            System.out.printf("Costo del envio: $%.2f%n", costo);
        }
        sc.close();
    }
}
