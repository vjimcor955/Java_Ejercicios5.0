import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(List.of());
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros");
        while (numeros.size() < 10) {
            numeros.add(userInput.nextInt());
        }
        for (int cont = numeros.size()-1; cont >= 0 ; cont--) {
            System.out.print(numeros.get(cont) + " ");
        }
    }
}
