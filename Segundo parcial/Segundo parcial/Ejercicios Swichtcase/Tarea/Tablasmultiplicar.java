import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, resultado;
        
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            n = scanner.nextInt();
            
            if (n != 0) {
                System.out.println("Tabla del " + n + ":");
                for (int i = 1; i <= 10; i++) {
                    resultado = n * i;
                    System.out.println(n + " x " + i + " = " + resultado);
                }
                System.out.println();
            }
        } while (n != 0);
        
        System.out.println("Programa terminado.");
        scanner.close();
    }
}