import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int[] array;

    public static void main(String[] args) {
        int n;
        boolean repetir = true;
        boolean arrayhecho = true ;
        while(repetir){

            try{
                if(arrayhecho) {
                    /*
                     * ENTRADA PARA EL TAMAÑO DEL ARRAY
                     */
                    System.out.println("\nIntroduce el tamaño del array: ");
                    Scanner entrada = new Scanner(System.in);
                    n = entrada.nextInt();
                    array = new int[n];

                    /*
                     * LOOP PARA CREAR EL ARRAY
                     */
                    for (int i = 0; (i) < n; i++) {
                        System.out.println("introduce el valor " + (i) + " del array: ");
                        Scanner crear = new Scanner(System.in);
                        int numero = crear.nextInt();
                        array[i] = numero;
                    }
                    arrayhecho = false;
                }

                /*
                 * ACCEDER A ALGUNO DE LOS ELEMENTOS DEL ARRAY MEDIANTE EL INDICE
                 */
                int x;
                System.out.println("------> Ahora accede a alguno de los elementos <-------");
                System.out.print("Introduce un número entero mayor o igual a 0 y menor a " + array.length + ": ");
                Scanner buscar = new Scanner(System.in);
                x = buscar.nextInt();
                System.out.println("------> Valor en la posición " + x + ": " + array[x] + " <------");
                repetir = false;
                /*
                 * CATCH PARA MANEJAR LAS EXCEPCIONES DE TIPO DE DATOS (YA QUE SE REQUIERE ESTRICTAMENTE UN INT)
                 */
            }catch(InputMismatchException e){
                System.out.println("\nHa ocurrido un error de tipo: " + e);
                System.out.println("Por lo tanto, debe introducir un número entero ");
                /*
                 * CATCH PARA MANEJAR LAS EXCEPCIONES EN CASO QUE SE SOBREPASE LA CAPACIDAD DEL ARRAY
                 */
            }catch(IndexOutOfBoundsException e){
                System.out.println("\nHa ocurrido un error de tipo: " + e);
                System.out.println("Por lo tanto, debe introducir un número entero mayor o igual a 0 y menor a "  + array.length + ": ");
                /*
                 * CATCH PARA MANEJAR CUALQUIER OTRO TIPO DE EXCEPCIONES
                 */
            }catch(Exception e){
                System.out.println("\nError inesperado " + e);
                /*
                 * FINALLY PARA REALIZAR UNA ACCIÓN SIEMPRE, OCURRA UNA EXECEPCION O NO
                 */
            }finally {
                System.out.println("\nLa ejecución del programa ha sido exitosa, array construido: " + Arrays.toString(array));

            }
        }
    }
}
