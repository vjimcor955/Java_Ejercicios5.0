import java.util.Arrays;
import java.util.Scanner;

public class ejercicio14 {
    public static boolean contienePalabra(String palabra, String[] array) {
        for (String elemento: array) {
            if (elemento.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] resultado = new String[8];

        System.out.println("Escriba 8 palabras: ");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + "º palabra: ");
            palabras[i] = lectura.nextLine().toLowerCase();
        }

        int cont = 0;
        for (String palabra: palabras) {
            if (contienePalabra(palabra, colores)) {
                resultado[cont] = palabra;
                cont++;
            }
        }
        for (String palabra: palabras) {
            if (!contienePalabra(palabra, colores)) {
                resultado[cont] = palabra;
                cont++;
            }
        }

        System.out.println("\n- Array original  : " + Arrays.toString(palabras));
        System.out.println("- Array resultado : " + Arrays.toString(resultado));
    }
}
