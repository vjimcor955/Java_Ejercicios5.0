import java.util.Arrays;
import java.util.Random;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] resultado = new int[20];

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int random_num = random.nextInt(101);
            numeros[i] = random_num;
        }

        int x = 0;
        for (int j = 0; j < 20; j++) {
            if (numeros[j] % 2 == 0) {
                resultado[x] = numeros[j];
                x++;
            }
        }

        for (int k = 0; k < 20; k++) {
            if (numeros[k] % 2 != 0) {
                resultado[x] = numeros[k];
                x++;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(resultado));
    }
}
