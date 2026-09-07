import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado = 0;
        String operacion, continuar;

        do {
            System.out.println("\n--- NUEVA OPERACIÓN ---");
            System.out.print("Primer número: ");
            num1 = sc.nextInt();
            System.out.print("Segundo número: ");
            num2 = sc.nextInt();
            System.out.print("Operación (+, -, *, /): ");
            operacion = sc.next();

            switch (operacion) {
                case "+" -> {
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                }
                case "-" -> {
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                }
                case "*" -> {
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                }
                case "/" -> {
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (double) num1 / num2);
                    } else {
                        System.out.println("❌ No se puede dividir por cero");
                    }
                }
                default -> System.out.println("❌ Operación no válida");
            }

            System.out.print("\n¿Desea realizar otra operación? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por usar la calculadora!");
        sc.close();
    }
}