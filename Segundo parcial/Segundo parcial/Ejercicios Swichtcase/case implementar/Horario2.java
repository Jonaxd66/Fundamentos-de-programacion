import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        String continuar;

        do {
            System.out.print("\nIngrese la hora (0-23): ");
            hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("❌ Hora inválida. Debe estar entre 0 y 23");
            } else {
                switch (hora / 6) {
                    case 0 -> System.out.println("🌙 Buenas noches");
                    case 1 -> System.out.println("☀️ Buenos días");
                    case 2 -> System.out.println("🌤️ Buenas tardes");
                    case 3 -> System.out.println("🌙 Buenas noches");
                }
            }

            System.out.print("\n¿Desea consultar otra hora? (si/no): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("¡Gracias por usar el programa!");
        sc.close();
    }
}