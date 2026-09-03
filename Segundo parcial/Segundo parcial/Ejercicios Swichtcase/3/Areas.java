import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int opcion;
        int base, altura, lado, radio;
        double area;

        // Mostrar menú
        System.out.println("=== CALCULADOR DE ÁREAS ===");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.print("Seleccione una opción (1-4): ");
        opcion = sc.nextInt();

        // Switch para calcular áreas
        switch (opcion) {
            case 1:
                // Cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = sc.nextInt();
                area = lado * lado;
                System.out.println("Área del cuadrado: " + area + " m²");
                break;

            case 2:
                // Rectángulo
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();
                area = base * altura;
                System.out.println("Área del rectángulo: " + area + " m²");
                break;

            case 3:
                // Triángulo
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();
                area = (base * altura) / 2.0;
                System.out.println("Área del triángulo: " + area + " m²");
                break;

            case 4:
                // Círculo
                System.out.print("Ingrese el radio: ");
                radio = sc.nextInt();
                area = 3.1416 * (radio * radio);
                System.out.println("Área del círculo: " + area + " m²");
                break;

            default:
                System.out.println("❌ Opción no válida. Ingrese un número entre 1 y 4");
        }

        sc.close();
    }
}
