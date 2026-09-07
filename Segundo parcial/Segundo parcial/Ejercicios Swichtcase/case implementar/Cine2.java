import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas;
        String dia, continuar;
        double precio = 50;

        do {
            System.out.println("\n=== CINEMA TICKETS ===");
            System.out.print("¿Cuántas personas van al cine? ");
            personas = sc.nextInt();
            System.out.print("¿Qué día de la semana es? (lunes, martes, miércoles...): ");
            dia = sc.next().toLowerCase();

            switch (dia) {
                case "miércoles", "miercoles" -> {
                    precio = 30;
                    System.out.println("¡Miércoles de descuento! 30% off");
                }
                case "jueves" -> {
                    precio = 40;
                    System.out.println("Jueves de promoción: $40 por persona");
                }
                case "lunes", "martes", "viernes", "sábado", "sabado", "domingo" -> {
                    precio = 50;
                    System.out.println("Precio normal: $50 por persona");
                }
                default -> {
                    System.out.println("❌ Día no válido");
                    sc.close();
                    return;
                }
            }

            double total = personas * precio;
            System.out.println("\n=== RESUMEN DE COMPRA ===");
            System.out.println("Personas: " + personas);
            System.out.println("Día: " + dia);
            System.out.println("Precio por persona: $" + precio);
            System.out.println("Total a pagar: $" + total);

            System.out.print("\n¿Desea realizar otra compra? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por su compra!");
        sc.close();
    }
}