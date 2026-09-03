import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int numPersonas;
        String dia;
        double precioPorPersona = 50;  // Precio por defecto
        double precioTotal;

        // Leer entrada del usuario
        System.out.print("¿Cuántas personas van al cine? ");
        numPersonas = sc.nextInt();

        System.out.print("¿Qué día de la semana es? (lunes, martes, miércoles, etc.): ");
        dia = sc.next().toLowerCase();

        // Switch para aplicar el precio según el día
        switch (dia) {
            case "miercoles":
                precioPorPersona = 30;  // Descuento del miércoles
                System.out.println("¡Día de descuento! 30% off");
                break;

            case "jueves":
                precioPorPersona = 40;  // Descuento del jueves
                System.out.println("Jueves de promoción: 40 pesos por persona");
                break;

            case "lunes":
            case "martes":
            case "viernes":
            case "sabado":
            case "domingo":
                precioPorPersona = 50;  // Precio normal
                break;

            default:
                System.out.println("❌ Día no válido");
                sc.close();
                return;
        }

        // Calcular precio total
        precioTotal = numPersonas * precioPorPersona;

        // Mostrar resultado
        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Personas: " + numPersonas);
        System.out.println("Día: " + dia);
        System.out.println("Precio por persona: $" + precioPorPersona);
        System.out.println("Precio total: $" + precioTotal);

        sc.close();
    }
}
