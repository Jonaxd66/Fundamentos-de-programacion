import java.util.Scanner;

public class PatronesAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de líneas: ");
        int n = scanner.nextInt();
        System.out.println();
        
        // Patrón 1: Rectángulo
        System.out.println("Patrón 1: Rectángulo");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Patrón 2: Pirámide invertida
        System.out.println("Patrón 2: Pirámide invertida");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // Patrón 3: Triángulo rectángulo
        System.out.println("Patrón 3: Triángulo rectángulo");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}