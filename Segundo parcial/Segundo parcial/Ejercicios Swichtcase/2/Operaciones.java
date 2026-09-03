import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int numero1, numero2, resultado = 0;
        String operacion;

        // Leer entrada del usuario
        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = sc.next();

        // Switch para realizar la operación
        switch (operacion) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;

            case "-":
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;

            case "*":
                resultado = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                break;

            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                } else {
                    System.out.println("❌ Error: No se puede dividir por cero");
                }
                break;

            default:
                System.out.println("❌ Operación no válida. Use (+, -, *, /)");
        }

        sc.close();
    }
}
