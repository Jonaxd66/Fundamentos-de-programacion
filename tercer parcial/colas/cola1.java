import java.util.Scanner;

public class cola {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        int limite = 5;
        int[] buffer = new int[limite];
        int inicio = 0;
        int tope = 0;
        boolean enEjecucion = true;

        while (enEjecucion) {
            System.out.println("\n=== MENÚ DE ESTRUCTURA ===");
            System.out.println("1) Agregar nuevo dato");
            System.out.println("2) Extraer el primer valor");
            System.out.println("3) Borrar valores hasta encontrar objetivo");
            System.out.println("4) Mostrar cola");
            System.out.println("5) Finalizar programa");
            System.out.print("Seleccione una alternativa: ");
            
            int eleccion = lector.nextInt();

            switch (eleccion) {
                case 1:
                    if (tope >= buffer.length) {
                        System.out.println("Error: Capacidad máxima alcanzada.");
                    } else {
                        System.out.print("Digite el valor a guardar: ");
                        // Se compacta la lectura e inserción
                        buffer[tope++] = lector.nextInt(); 
                        System.out.println("Valor almacenado con éxito.");
                    }
                    break;

                case 2:
                    if (inicio == tope) {
                        System.out.println("No hay datos para extraer (Estructura vacía).");
                    } else {
                        System.out.println("Valor extraído: " + buffer[inicio]);
                        inicio++;

                        // Reinicio de índices si se vacía la fila
                        if (inicio == tope) {
                            inicio = 0;
                            tope = 0;
                        }
                    }
                    break;

                case 3:
                    if (inicio == tope) {
                        System.out.println("Error: Fila sin datos.");
                    } else {
                        System.out.print("Digite el número de referencia para cortar: ");
                        int valorObjetivo = lector.nextInt();
                        int indiceHallado = -1;

                        // Búsqueda del elemento
                        for (int k = inicio; k < tope; k++) {
                            if (buffer[k] == valorObjetivo) {
                                indiceHallado = k;
                                break; 
                            }
                        }

                        if (indiceHallado < 0) {
                            System.out.println("AVISO: El dato no se encuentra en el arreglo.");
                        } else {
                            int contadorDesplazados = 0;
                            
                            // Mover elementos restantes al principio
                            for (int k = indiceHallado + 1; k < tope; k++) {
                                buffer[contadorDesplazados++] = buffer[k];
                            }

                            // Limpiar la basura residual
                            for (int k = contadorDesplazados; k < tope; k++) {
                                buffer[k] = 0;
                            }

                            inicio = 0;
                            tope = contadorDesplazados;

                            System.out.println("Operación completada: Se cortó la fila hasta el objetivo.");
                        }
                    }
                    break;

                case 4:
                    if (inicio == tope) {
                        System.out.println("La fila no contiene elementos en este momento.");
                    } else {
                        System.out.print("Contenido actual de la fila: ");
                        for (int k = inicio; k < tope; k++) {
                            System.out.print("[" + buffer[k] + "] ");
                        }
                        System.out.println(); // Salto de línea estético
                    }
                    break;

                case 5:
                    System.out.println("Cerrando el sistema...");
                    enEjecucion = false;
                    break;

                default:
                    System.out.println("Entrada incorrecta. Intente con un número del 1 al 5.");
            }
        }

        lector.close();
    }
}