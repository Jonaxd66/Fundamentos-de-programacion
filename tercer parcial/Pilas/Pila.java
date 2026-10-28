import java.util.Scanner;

public class Pila {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int limiteCapacidad = 5;
        int[] contenedor = new int[limiteCapacidad];
        int cima = -1;
        boolean programaActivo = true;

        while (programaActivo) {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Agregar elemento ");
            System.out.println("2. Buscar y eliminar elemento");
            System.out.println("3. Imprimir pila");
            System.out.println("4. Salir");
            System.out.print("Seleccione una acción: ");
            
            int seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1:
                    if (cima >= limiteCapacidad - 1) {
                        System.out.println("Alerta: La pila ha alcanzado su límite máximo.");
                    } else {
                        System.out.print("Digite el número a guardar: ");
                        // Se omite el bucle for innecesario del código original
                        contenedor[++cima] = entrada.nextInt(); 
                        System.out.println("Elemento apilado con éxito.");
                    }
                    break;

                case 2:
                    if (cima < 0) {
                        System.out.println("Error: No se puede eliminar, la estructura está vacía.");
                    } else {
                        System.out.print("Escriba el valor que desea borrar: ");
                        int objetivo = entrada.nextInt();
                        int indiceHallado = -1;

                        // Búsqueda de arriba hacia abajo
                        for (int k = cima; k >= 0; k--) {
                            if (contenedor[k] == objetivo) {
                                indiceHallado = k;
                                break; 
                            }
                        }

                        if (indiceHallado < 0) {
                            System.out.println("RESULTADO: El dato buscado no se encuentra en la pila.");
                        } else {
                            // Se actualiza el tope para descartar el elemento y todo lo que esté sobre él
                            cima = indiceHallado - 1;
                            System.out.println("Operación exitosa: Se descartaron los datos hasta el valor indicado.");
                        }
                    }
                    break;

                case 3:
                    if (cima < 0) {
                        System.out.println("La pila se encuentra vacía actualmente.");
                    } else {
                        System.out.println("Estado actual de la pila (desde arriba hacia abajo):");
                        for (int k = cima; k >= 0; k--) {
                            System.out.println(" | " + contenedor[k] + " |");
                        }
                        System.out.println(" -----");
                    }
                    break;

                case 4:
                    System.out.println("Finalizando la ejecución...");
                    programaActivo = false;
                    break;

                default:
                    System.out.println("Comando inválido. Ingrese un número del 1 al 4.");
            }
        }
        
        entrada.close();
    }
}