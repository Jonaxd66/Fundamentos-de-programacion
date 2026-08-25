import java.util.Scanner;

public class BecasUniversitarias {

    public static String calcularBeca(int edad, double promedio) {
        if (edad > 18) {
            if (promedio >= 9) return "Beca de $10,000.00";
            else if (promedio >= 7.5) return "Beca de $8,000.00";
            else if (promedio >= 6.0) return "Beca de $5,000.00";
            else return "Carta de invitacion a esforzarse mas";
        } else {
            if (promedio >= 9) return "Beca de $8,000.00";
            else if (promedio >= 8) return "Beca de $6,000.00";
            else if (promedio >= 6) return "Beca de $4,000.00";
            else return "Carta de invitacion a esforzarse mas";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.println(calcularBeca(edad, promedio));
        sc.close();
    }
}
