import java.util.Scanner;

public class SeguroAutomovil {

    static double calcularTarifaBase(double valorVehiculo) {
        return valorVehiculo * 0.04;
    }

    static double calcularRecargoPorEdad(double tarifaBase, int edad) {
        if (edad < 25) return tarifaBase * 0.20;
        if (edad > 60) return tarifaBase * 0.10;
        return 0;
    }

    static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes) {
        return tarifaBase * 0.08 * accidentes;
    }

    static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad) {
        return tieneSeguridad ? subtotal * 0.05 : 0;
    }

    static double calcularCostoFinal(double tarifaBase, double recargoEdad,
                                     double recargoAccidentes, double descuento) {
        return tarifaBase + recargoEdad + recargoAccidentes - descuento;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Valor del vehículo: ");
            double valorVehiculo = sc.nextDouble();
            if (valorVehiculo <= 0) { System.out.println("Error: valor inválido"); return; }

            System.out.print("Edad del conductor (18-100): ");
            int edad = sc.nextInt();
            if (edad < 18 || edad > 100) { System.out.println("Error: edad inválida"); return; }

            System.out.print("Número de accidentes: ");
            int accidentes = sc.nextInt();
            if (accidentes < 0) { System.out.println("Error: accidentes inválidos"); return; }

            System.out.print("¿Tiene sistema de seguridad? (true/false): ");
            boolean tieneSeguridad = sc.nextBoolean();

            double tarifaBase = calcularTarifaBase(valorVehiculo);
            double recargoEdad = calcularRecargoPorEdad(tarifaBase, edad);
            double recargoAcc = calcularRecargoPorAccidentes(tarifaBase, accidentes);
            double subtotal = tarifaBase + recargoEdad + recargoAcc;
            double descuento = calcularDescuentoSeguridad(subtotal, tieneSeguridad);
            double costoFinal = calcularCostoFinal(tarifaBase, recargoEdad, recargoAcc, descuento);

            System.out.println("\n--- COTIZACIÓN ---");
            System.out.printf("Tarifa base:        $%.2f%n", tarifaBase);
            System.out.printf("Recargo por edad:   $%.2f%n", recargoEdad);
            System.out.printf("Recargo accidentes: $%.2f%n", recargoAcc);
            System.out.printf("Descuento:          $%.2f%n", descuento);
            System.out.printf("COSTO FINAL:        $%.2f%n", costoFinal);
        }
    }
}