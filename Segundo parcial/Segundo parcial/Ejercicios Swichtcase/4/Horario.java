import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int hora;

        // Leer entrada del usuario
        System.out.print("Ingrese la hora (0-23): ");
        hora = sc.nextInt();

        // Validar que la hora sea correcta
        if (hora < 0 || hora > 23) {
            System.out.println("❌ Error: La hora debe estar entre 0 y 23");
            sc.close();
            return;
        }

        // Switch para mostrar el saludo según la hora
        switch (hora / 6) {  // Dividimos en 4 períodos: 0-5, 6-11, 12-17, 18-23
            case 0:
                System.out.println("🌙 ¡Buenas noches!");
                break;

            case 1:
                System.out.println("☀️ ¡Buenos días!");
                break;

            case 2:
                System.out.println("🌤️ ¡Buenas tardes!");
                break;

            case 3:
                System.out.println("🌙 ¡Buenas noches!");
                break;
        }

        sc.close();
    }
}
