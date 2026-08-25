import java.util.Scanner;

public class ConsultorioDrLorenzo {

    public static double costoCita(int numeroCita) {
        if (numeroCita <= 3) return 900.0;
        else if (numeroCita <= 5) return 800.0;
        else if (numeroCita <= 8) return 600.0;
        else return 500.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de cita: ");
        int numeroCita = sc.nextInt();

        double acumulado = 0;
        for (int i = 1; i <= numeroCita; i++) {
            acumulado += costoCita(i);
        }
        double montoCitaActual = costoCita(numeroCita);

        System.out.printf("Pago de la cita actual: $%.2f%n", montoCitaActual);
        System.out.printf("Total pagado en el tratamiento: $%.2f%n", acumulado);
        sc.close();
    }
}
