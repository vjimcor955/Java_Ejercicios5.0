import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca el numero de la posicion " + i + " del array: ");
            int num = Integer.parseInt(lectura.next());
            numeros[(i)] = num;
        }

        System.out.print("Ingrese la posición inicial (0-9): ");
        int inicio = lectura.nextInt();
        System.out.print("Ingrese la posición final (0-9): ");
        int fin = lectura.nextInt();

        if (inicio < 0 || fin < 0 || fin > 9 || inicio >= fin) {
            System.out.println("La posicion inicial debe ser inferior a la final y estar comprendidas entre 0 y 9.");
        } else {
            System.out.println("\n- Array original   : " + Arrays.toString(numeros));
            int temp = numeros[inicio];
            for (int i = inicio; i < fin; i++) {
                numeros[i] = numeros[i + 1];
            }
            numeros[fin] = temp;
            System.out.println("- Array modificado : " + Arrays.toString(numeros));
        }
    }
}
