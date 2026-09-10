import java.util.Scanner;

public class Ejercicio4_Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("\nIngrese la hora (0-23): ");
            int hora;
            try {
                hora = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Hora inválida. Debe ser un número entero.");
                continue;
            }

            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Debe estar entre 0 y 23.");
                continue;
            }

            switch (hora) {
                case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                    System.out.println("Buenos días");
                    break;
                case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                    System.out.println("Buenas tardes");
                    break;
                case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Buenas noches");
                    break;
                default:
                    System.out.println("Hora fuera de rango.");
            }

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
