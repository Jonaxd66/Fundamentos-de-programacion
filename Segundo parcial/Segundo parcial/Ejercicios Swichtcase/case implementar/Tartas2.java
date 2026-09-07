import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor, continuar;
        int precio = 0;

        do {
            System.out.println("\n=== MENÚ DE TARTAS ===");
            System.out.println("1. Vainilla - $200");
            System.out.println("2. Chocolate - $250");
            System.out.println("3. Fresa - $300");
            System.out.print("Seleccione el sabor (vainilla, chocolate, fresa): ");
            sabor = sc.next().toLowerCase();

            switch (sabor) {
                case "vainilla" -> {
                    precio = 200;
                    System.out.println("✅ Tarta de vainilla seleccionada");
                }
                case "chocolate" -> {
                    precio = 250;
                    System.out.println("✅ Tarta de chocolate seleccionada");
                }
                case "fresa" -> {
                    precio = 300;
                    System.out.println("✅ Tarta de fresa seleccionada");
                }
                default -> {
                    System.out.println("❌ Sabor no válido");
                    sc.close();
                    return;
                }
            }

            System.out.print("¿Desea agregar decoración? (si/no): ");
            String decoracion = sc.next().toLowerCase();
            if (decoracion.equals("si")) {
                precio += 50;
                System.out.println("🎨 Decoración agregada (+$50)");
            }

            System.out.println("\n=== RESUMEN DE PEDIDO ===");
            System.out.println("Sabor: " + sabor);
            System.out.println("Total a pagar: $" + precio);

            System.out.print("\n¿Desea realizar otro pedido? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por su pedido!");
        sc.close();
    }
}