import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        while (numeros.size() < 100) {
            numeros.add(rand.nextInt(20));
        }
        System.out.println(numeros);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca numero a reemplazar");
        Integer numeroReemplazar1 = userInput.nextInt();
        System.out.println("Introduzca numero con el que reemplazar el anterior");
        Integer numeroReemplazar2 = userInput.nextInt();
        while (numeros.contains(numeroReemplazar1)) {
            numeros.set(numeros.indexOf(numeroReemplazar1),numeroReemplazar2);
        }
        System.out.println(numeros);
    }
}
