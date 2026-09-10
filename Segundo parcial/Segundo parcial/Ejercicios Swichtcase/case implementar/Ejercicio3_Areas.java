import java.util.Scanner;

public class Ejercicio3_Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nElija una figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = leerDouble(sc);
                    System.out.printf("El área del cuadrado es: %.2f%n", lado * lado);
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = leerDouble(sc);
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = leerDouble(sc);
                    System.out.printf("El área del rectángulo es: %.2f%n", base * altura);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseT = leerDouble(sc);
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaT = leerDouble(sc);
                    System.out.printf("El área del triángulo es: %.2f%n", (baseT * alturaT) / 2);
                    break;
                case 4:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = leerDouble(sc);
                    System.out.printf("El área del círculo es: %.2f%n", Math.PI * radio * radio);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        System.out.println("Fin del programa.");
        sc.close();
    }

    private static double leerDouble(Scanner sc) {
        try {
            return Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
