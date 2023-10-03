import java.util.Random;
import java.util.Scanner;

public class ejercicio16 {
    public static void multiplos(int[] array, int numero) {
        for (int i: array) {
            if (i % numero == 0) {
                System.out.print("[" + i + "] ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(401);
        }
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\n¿Resaltar los multiplos de 5 o de 7? (5/7): ");
        int num = lectura.nextInt();
        if (num == 5) {
            multiplos(numeros, 5);
        } else if (num == 7) {
            multiplos(numeros, 7);
        }
    }
}
