import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<>();
        System.out.println("Introduzca 8 numeros");
        while (numeros.size() < 8) {
            String numeroIntroducido = userInput.nextLine();
            if (parseInt(numeroIntroducido)%2 == 0) {
                numeros.add(numeroIntroducido+" par");
            }
            else {
                numeros.add(numeroIntroducido+" impar");
            }
        }
        System.out.println(numeros);
    }
}
