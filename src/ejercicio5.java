import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(List.of());
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros");
        while (numeros.size() < 10) {
            numeros.add(userInput.nextInt());
        }
        numeros.sort(Comparator.naturalOrder());
        for (int cont = 0; cont < numeros.size(); cont ++) {
            if (cont == 0) {
                System.out.print(numeros.get(cont) + " mínimo ");
            }
            else if (cont == numeros.size()-1) {
                System.out.print(numeros.get(cont) + " máximo ");
            }
            else {
                System.out.print(numeros.get(cont) + " ");
            }
        }
    }
}