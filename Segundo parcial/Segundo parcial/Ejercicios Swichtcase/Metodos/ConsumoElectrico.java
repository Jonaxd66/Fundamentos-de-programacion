import java.util.Scanner;

public class ConsumoElectrico {

    static final double CARGO_FIJO = 95.0;

    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    static double calcularCostoConsumo(double consumo) {
        double costo = 0;
        double restante = consumo;

        if (restante > 0) {
            double bloque1 = Math.min(restante, 150);
            costo += bloque1 * 1.20;
            restante -= bloque1;
        }
        if (restante > 0) {
            double bloque2 = Math.min(restante, 250);
            costo += bloque2 * 1.80;
            restante -= bloque2;
        }
        if (restante > 0) {
            costo += restante * 2.75;
        }
        return costo;
    }

    static double calcularDescuentoApoyo(double consumo, double costoAntesImpuesto, boolean tieneApoyo) {
        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        }
        return 0;
    }

    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    static double calcularTotal(double costoConsumo, double cargoFijo,
                                double descuento, double impuesto) {
        return costoConsumo + cargoFijo - descuento + impuesto;
    }

    static void mostrarRecibo(double consumo, double costoConsumo,
                              double descuento, double impuesto, double total) {
        System.out.println("\n===== RECIBO =====");
        System.out.printf("Consumo:          %.2f kWh%n", consumo);
        System.out.printf("Costo consumo:    $%.2f%n", costoConsumo);
        System.out.printf("Cargo fijo:       $%.2f%n", CARGO_FIJO);
        System.out.printf("Descuento:        $%.2f%n", descuento);
        System.out.printf("Impuesto:         $%.2f%n", impuesto);
        System.out.printf("TOTAL A PAGAR:    $%.2f%n", total);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Lectura anterior: ");
            double lecturaAnterior = sc.nextDouble();
            System.out.print("Lectura actual: ");
            double lecturaActual = sc.nextDouble();

            if (lecturaAnterior < 0 || lecturaActual < 0) {
                System.out.println("Error: lecturas no pueden ser negativas");
                return;
            }
            if (lecturaActual < lecturaAnterior) {
                System.out.println("Error: lectura actual debe ser >= anterior");
                return;
            }

            double consumo = calcularConsumo(lecturaAnterior, lecturaActual);
            if (consumo > 10000) {
                System.out.println("Error: consumo excede 10000 kWh");
                return;
            }

            System.out.print("¿Pertenece al programa de apoyo? (true/false): ");
            boolean tieneApoyo = sc.nextBoolean();

            double costoConsumo = calcularCostoConsumo(consumo);
            double baseImponible = costoConsumo + CARGO_FIJO;
            double descuento = calcularDescuentoApoyo(consumo, baseImponible, tieneApoyo);
            double impuesto = calcularImpuesto(baseImponible);
            double total = calcularTotal(costoConsumo, CARGO_FIJO, descuento, impuesto);

            mostrarRecibo(consumo, costoConsumo, descuento, impuesto, total);
        }
    }
}