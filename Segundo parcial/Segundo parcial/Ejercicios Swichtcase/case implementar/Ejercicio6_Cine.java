import java.util.Scanner;

public class Ejercicio6_Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("\nIngrese el día de la semana (lunes, martes, miercoles, jueves, viernes, sabado, domingo): ");
            String dia = sc.nextLine().trim().toLowerCase();

            System.out.print("Ingrese el número de personas: ");
            int personas;
            try {
                personas = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Número de personas inválido.");
                continue;
            }
            if (personas <= 0) {
                System.out.println("Número de personas inválido.");
                continue;
            }

            System.out.print("¿Tiene membresía? (s/n): ");
            boolean membresia = sc.nextLine().trim().toLowerCase().equals("s");

            double total;

            switch (dia) {
                case "miercoles":
                case "miércoles":
                    total = personas * 30.0;
                    break;
                case "jueves":
                    int parejas = personas / 2;
                    int individuales = personas % 2;
                    total = parejas * 75.0 + individuales * 50.0;
                    break;
                default:
                    total = personas * 50.0;
            }

            if (membresia) {
                total *= 0.9;
            }

            System.out.printf("El precio total a pagar es: $%.2f pesos%n", total);

            System.out.print("\n¿Desea repetir el programa? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();
            continuar = respuesta.equals("s");

        } while (continuar);

        System.out.println("Fin del programa.");
        sc.close();
    }
}
