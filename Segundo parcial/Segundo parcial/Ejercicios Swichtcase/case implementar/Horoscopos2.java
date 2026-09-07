import java.util.Scanner;

public class Horoscopos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String signo = "", continuar;

        do {
            System.out.print("\nIngrese su mes de nacimiento (1-12): ");
            mes = sc.nextInt();

            signo = switch (mes) {
                case 1 -> "Capricornio";
                case 2 -> "Acuario";
                case 3 -> "Piscis";
                case 4 -> "Aries";
                case 5 -> "Tauro";
                case 6 -> "Géminis";
                case 7 -> "Cáncer";
                case 8 -> "Leo";
                case 9 -> "Virgo";
                case 10 -> "Libra";
                case 11 -> "Escorpión";
                case 12 -> "Sagitario";
                default -> "❌ Mes inválido";
            };

            if (signo.contains("inválido")) {
                System.out.println(signo);
            } else {
                System.out.println("✨ Tu signo zodiacal es: " + signo);
            }

            System.out.print("\n¿Desea consultar otro signo? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por usar el programa de horóscopos!");
        sc.close();
    }
}