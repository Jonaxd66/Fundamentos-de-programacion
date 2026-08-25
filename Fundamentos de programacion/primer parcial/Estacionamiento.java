import java.util.Scanner;

public class Estacionamiento {

    public static double calcularCobro(double horas) {
        double total;
        if (horas <= 2) {
            total = horas * 30;
        } else if (horas <= 5) {
            total = (2 * 30) + (horas - 2) * 25;
        } else if (horas <= 10) {
            total = (2 * 30) + (3 * 25) + (horas - 5) * 20;
        } else {
            total = 380;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas de estacionamiento: ");
        double horas = sc.nextDouble();

        double total = calcularCobro(horas);
        System.out.printf("Total a pagar: $%.2f%n", total);
        sc.close();
    }
}
