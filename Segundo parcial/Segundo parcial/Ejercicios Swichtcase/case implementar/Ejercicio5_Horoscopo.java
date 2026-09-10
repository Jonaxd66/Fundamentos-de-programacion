import java.util.Scanner;

public class Ejercicio5_Horoscopo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("\nIngrese el día de nacimiento (1-31): ");
            int dia;
            try {
                dia = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Día inválido.");
                continue;
            }
            if (dia < 1 || dia > 31) {
                System.out.println("Día inválido.");
                continue;
            }

            System.out.print("Ingrese el mes de nacimiento (1-12): ");
            int mes;
            try {
                mes = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Mes inválido.");
                continue;
            }
            if (mes < 1 || mes > 12) {
                System.out.println("Mes inválido.");
                continue;
            }

            String signo;

            switch (mes) {
                case 1:  signo = (dia <= 19) ? "Capricornio" : "Acuario";    break;
                case 2:  signo = (dia <= 18) ? "Acuario" : "Piscis";         break;
                case 3:  signo = (dia <= 20) ? "Piscis" : "Aries";          break;
                case 4:  signo = (dia <= 19) ? "Aries" : "Tauro";           break;
                case 5:  signo = (dia <= 20) ? "Tauro" : "Géminis";         break;
                case 6:  signo = (dia <= 20) ? "Géminis" : "Cáncer";        break;
                case 7:  signo = (dia <= 22) ? "Cáncer" : "Leo";            break;
                case 8:  signo = (dia <= 22) ? "Leo" : "Virgo";             break;
                case 9:  signo = (dia <= 22) ? "Virgo" : "Libra";           break;
                case 10: signo = (dia <= 22) ? "Libra" : "Escorpio";        break;
                case 11: signo = (dia <= 21) ? "Escorpio" : "Sagitario";    break;
                case 12: signo = (dia <= 21) ? "Sagitario" : "Capricornio"; break;
                default: signo = "Desconocido";
            }

            System.out.println("Tu signo del horóscopo es: " + signo);

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
