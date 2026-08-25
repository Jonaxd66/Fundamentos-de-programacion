import java.util.Scanner;

public class Platillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de personas: ");
        int personas = sc.nextInt();

        float precioPlatillo;

        if (personas <= 0) {
            System.out.println("El numero de personas debe ser mayor a cero.");
            sc.close();
            return;
        } else if (personas <= 100) {
            precioPlatillo = 100;
        } else if (personas <= 200) {
            precioPlatillo = 95;
        } else if (personas <= 300) {
            precioPlatillo = 85;
        } else {
            precioPlatillo = 75;
        }

        float presupuesto = personas * precioPlatillo;

        System.out.print("El precio sera de " + presupuesto);
        System.out.println(" con un precio de " + precioPlatillo + " para este numero de personas " + personas);

        sc.close();
    }
}
