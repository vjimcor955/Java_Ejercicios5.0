import java.util.Arrays;
import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int random_num = random.nextInt(101);
            numero[i] = random_num;
            cuadrado[i] = random_num * random_num;
            cubo[i] = random_num * random_num * random_num;
        }

        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(cuadrado));
        System.out.println(Arrays.toString(cubo));
    }
}
