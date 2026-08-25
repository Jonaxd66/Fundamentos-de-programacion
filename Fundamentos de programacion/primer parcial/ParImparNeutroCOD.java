import java.util.Scanner;

public class ParImparNeutro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int n = sc.nextInt();

        String resultado;
        if (n == 0) {
            resultado = "Neutro";
        } else if (n % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        System.out.println("El numero es: " + resultado);
        sc.close();
    }
}
