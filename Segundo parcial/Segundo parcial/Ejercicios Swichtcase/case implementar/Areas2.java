import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double area = 0;
        String continuar;

        do {
            System.out.println("\n=== CALCULADORA DE ÁREAS ===");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.print("Opción (1-4): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();
                    area = lado * lado;
                    System.out.println("Área: " + area + " m²");
                }
                case 2 -> {
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    area = base * altura;
                    System.out.println("Área: " + area + " m²");
                }
                case 3 -> {
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("Área: " + area + " m²");
                }
                case 4 -> {
                    System.out.print("Radio: ");
                    double radio = sc.nextDouble();
                    area = Math.PI * radio * radio;
                    System.out.println("Área: " + String.format("%.2f", area) + " m²");
                }
                default -> System.out.println("❌ Opción no válida");
            }

            System.out.print("\n¿Desea calcular otra área? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por usar la calculadora de áreas!");
        sc.close();
    }
}