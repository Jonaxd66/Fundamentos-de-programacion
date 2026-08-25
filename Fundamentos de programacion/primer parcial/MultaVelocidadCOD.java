import java.util.Scanner;

public class MultaVelocidad {

    public static int velocidad(int speed, boolean esCumpleanos) {
        int limiteBajo = 60;
        int limiteAlto = 80;
        if (esCumpleanos) {
            limiteBajo *= 5;
            limiteAlto *= 5;
        }
        if (speed <= limiteBajo) return 0;
        else if (speed <= limiteAlto) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidad: ");
        int speed = sc.nextInt();
        System.out.print("Es tu cumpleanos? (true/false): ");
        boolean esCumpleanos = sc.nextBoolean();

        int resultado = velocidad(speed, esCumpleanos);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
