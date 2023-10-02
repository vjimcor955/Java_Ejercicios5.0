import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca el " + i + "º numero: ");
            int num = Integer.parseInt(lectura.next());
            if (i != 15) {
                numeros[(i)] = num;
            } else {
                numeros[0] = num;
            }
        }

        System.out.println("\n" + Arrays.toString(numeros));
    }
}
