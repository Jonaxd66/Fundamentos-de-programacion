import java.util.Scanner;

public class Ejercicio7_Tartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            double total = 0;
            boolean saborValido = true;

            System.out.print("\nElija el sabor de la tarta (manzana, fresa, chocolate): ");
            String sabor = sc.nextLine().trim().toLowerCase();

            switch (sabor) {
                case "manzana":
                    total = 200;
                    System.out.println("Tarta de manzana: $200 pesos");
                    break;
                case "fresa":
                    total = 250;
                    System.out.println("Tarta de fresa: $250 pesos");
                    break;
                case "chocolate":
                    System.out.print("¿El chocolate es negro o blanco?: ");
                    String tipoChocolate = sc.nextLine().trim().toLowerCase();
                    switch (tipoChocolate) {
                        case "negro":
                            total = 280;
                            System.out.println("Tarta de chocolate negro: $280 pesos");
                            break;
                        case "blanco":
                            total = 300;
                            System.out.println("Tarta de chocolate blanco: $300 pesos");
                            break;
                        default:
                            System.out.println("Tipo de chocolate no válido.");
                            saborValido = false;
                    }
                    break;
                default:
                    System.out.println("Sabor no válido.");
                    saborValido = false;
            }

            if (saborValido) {
                System.out.print("¿Desea agregar snacks? (s/n): ");
                boolean deseaSnack = sc.nextLine().trim().toLowerCase().equals("s");

                if (deseaSnack) {
                    System.out.print("¿Cuántos snacks desea agregar (fresa, galleta, durazno, etc.)?: ");
                    try {
                        int cantidad = Integer.parseInt(sc.nextLine().trim());
                        if (cantidad > 0) {
                            total += cantidad * 25;
                            System.out.println("Se agregaron " + cantidad + " snack(s): +$" + (cantidad * 25) + " pesos");
                        } else {
                            System.out.println("Cantidad inválida, no se agregaron snacks.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad inválida, no se agregaron snacks.");
                    }
                }

                System.out.print("¿Desea escribir un nombre personalizado en la tarta? (s/n): ");
                boolean deseaNombre = sc.nextLine().trim().toLowerCase().equals("s");

                if (deseaNombre) {
                    total += 30;
                    System.out.println("Se agregó nombre personalizado: +$30 pesos");
                }

                System.out.printf("%nEl presupuesto total de la tarta es: $%.2f pesos%n", total);
            }

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
