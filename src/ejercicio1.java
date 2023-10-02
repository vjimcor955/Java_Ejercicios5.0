import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 39;
        numeros[1] = -2;
        numeros[4] = 0;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;
        System.out.println(Arrays.toString(numeros));

        //Los valores no inicializados se reemplazan por ceros
    }
}