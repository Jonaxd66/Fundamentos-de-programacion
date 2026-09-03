import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        String sabor;
        int precioTarta = 0;
        double precioTotal;

        // Mostrar menú de sabores
        System.out.println("=== MENU DE TARTAS ===");
        System.out.println("1. Vainilla - $200");
        System.out.println("2. Chocolate - $250");
        System.out.println("3. Fresa - $300");
        System.out.print("Seleccione el sabor (vainilla, chocolate, fresa): ");
        sabor = sc.next().toLowerCase();

        // Switch para obtener el precio según el sabor
        switch (sabor) {
            case "vainilla":
                precioTarta = 200;
                System.out.println("Tarta de vainilla seleccionada");
                break;

            case "chocolate":
                precioTarta = 250;
                System.out.println("Tarta de chocolate seleccionada");
                break;

            case "fresa":
                precioTarta = 300;
                System.out.println("Tarta de fresa seleccionada");
                break;

            default:
                System.out.println("❌ Sabor no válido");
                sc.close();
                return;
        }

        // Preguntar si desea decoración
        System.out.print("¿Desea agregar decoración? (si/no): ");
        String decoracion = sc.next().toLowerCase();

        if (decoracion.equals("si")) {
            precioTarta += 50;
            System.out.println("Decoración agregada: +$50");
        }

        precioTotal = precioTarta;

        // Mostrar resumen
        System.out.println("\n=== RESUMEN DE PEDIDO ===");
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio total: $" + precioTotal);

        sc.close();
    }
}
