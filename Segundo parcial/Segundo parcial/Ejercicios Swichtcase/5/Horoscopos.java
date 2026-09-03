import java.util.Scanner;

public class Horoscopos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int mes;
        String signo = "";

        // Leer entrada del usuario
        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        mes = sc.nextInt();

        // Switch para obtener el signo zodiacal (simplificado)
        switch (mes) {
            case 1:
                signo = "Capricornio";
                break;

            case 2:
                signo = "Acuario";
                break;

            case 3:
                signo = "Piscis";
                break;

            case 4:
                signo = "Aries";
                break;

            case 5:
                signo = "Tauro";
                break;

            case 6:
                signo = "Géminis";
                break;

            case 7:
                signo = "Cáncer";
                break;

            case 8:
                signo = "Leo";
                break;

            case 9:
                signo = "Virgo";
                break;

            case 10:
                signo = "Libra";
                break;

            case 11:
                signo = "Escorpión";
                break;

            case 12:
                signo = "Sagitario";
                break;

            default:
                System.out.println("❌ Mes no válido. Ingrese un número entre 1 y 12");
                sc.close();
                return;
        }

        System.out.println("✨ Tu signo zodiacal es: " + signo);

        sc.close();
    }
}
