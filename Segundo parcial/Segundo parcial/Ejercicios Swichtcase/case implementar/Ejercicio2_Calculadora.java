import java.util.Scanner;

public class Ejercicio2_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("\nIngrese el primer número entero: ");
            int numero1;
            try {
                numero1 = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
                continue;
            }

            System.out.print("Ingrese el segundo número entero: ");
            int numero2;
            try {
                numero2 = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
                continue;
            }

            System.out.print("Ingrese la operación (+, -, *, /): ");
            String operadorTexto = sc.nextLine().trim();

            if (operadorTexto.length() != 1) {
                System.out.println("Operador inválido.");
                continue;
            }

            char operador = operadorTexto.charAt(0);

            switch (operador) {
                case '+':
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case '/':
                    if (numero2 == 0) {
                        System.out.println("Error: división por cero.");
                    } else {
                        double resultado = (double) numero1 / numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                    }
                    break;
                default:
                    System.out.println("Operador no reconocido.");
            }

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
