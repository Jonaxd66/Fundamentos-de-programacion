import java.util.Scanner;

public class TiendaOnline {

    static double calcularSubtotalProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularSubtotalGeneral(double s1, double s2, double s3) {
        return s1 + s2 + s3;
    }

    static double calcularDescuento(double subtotal, int tipoCliente) {
        return (tipoCliente == 2) ? subtotal * 0.10 : 0;
    }

    static double calcularEnvio(double subtotal, String codigoPostal) {
        if (subtotal < 1000) return 150;
        if (subtotal < 3000) return 80;
        return 0;
    }

    static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    static double calcularTotal(double subtotal, double descuento,
                                double impuesto, double envio) {
        return subtotal - descuento + impuesto + envio;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Precio producto 1: "); double p1 = sc.nextDouble();
            System.out.print("Cantidad producto 1: "); int c1 = sc.nextInt();
            System.out.print("Precio producto 2: "); double p2 = sc.nextDouble();
            System.out.print("Cantidad producto 2: "); int c2 = sc.nextInt();
            System.out.print("Precio producto 3: "); double p3 = sc.nextDouble();
            System.out.print("Cantidad producto 3: "); int c3 = sc.nextInt();

            if (p1 <= 0 || p2 <= 0 || p3 <= 0 || c1 <= 0 || c2 <= 0 || c3 <= 0) {
                System.out.println("Error: precios y cantidades deben ser positivos");
                return;
            }

            System.out.print("Tipo cliente (1=Regular, 2=Frecuente): ");
            int tipoCliente = sc.nextInt();
            if (tipoCliente != 1 && tipoCliente != 2) {
                System.out.println("Error: tipo inválido");
                return;
            }

            sc.nextLine(); // limpiar buffer
            System.out.print("Código postal (5 dígitos): ");
            String cp = sc.nextLine();
            if (!cp.matches("\\d{5}")) {
                System.out.println("Error: CP inválido");
                return;
            }

            double s1 = calcularSubtotalProducto(p1, c1);
            double s2 = calcularSubtotalProducto(p2, c2);
            double s3 = calcularSubtotalProducto(p3, c3);
            double subtotal = calcularSubtotalGeneral(s1, s2, s3);
            double descuento = calcularDescuento(subtotal, tipoCliente);
            double envio = calcularEnvio(subtotal, cp);
            double impuesto = calcularImpuesto(subtotal - descuento);
            double total = calcularTotal(subtotal, descuento, impuesto, envio);

            System.out.println("\n--- TICKET ---");
            System.out.printf("Subtotal:  $%.2f%n", subtotal);
            System.out.printf("Descuento: $%.2f%n", descuento);
            System.out.printf("Envío:     $%.2f%n", envio);
            System.out.printf("Impuesto:  $%.2f%n", impuesto);
            System.out.printf("TOTAL:     $%.2f%n", total);
        }
    }
}