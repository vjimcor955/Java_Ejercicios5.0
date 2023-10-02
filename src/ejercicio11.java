import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        CopyOnWriteArrayList<Integer> numeros = new CopyOnWriteArrayList<>();  //Para poder modificar el array en un loop
        System.out.println("Introduzca 10 numeros");
        while (numeros.size() < 10) {
            numeros.add(userInput.nextInt());
        }
        ListIterator<Integer> numerosEnumerate = numeros.listIterator(); //Debe estar despues de las modificaciones a la lista
        while (numerosEnumerate.hasNext()) {
            System.out.println(numerosEnumerate.nextIndex() + " " + numerosEnumerate.next());
        }
        for (Integer numero: numeros) {
            for (int cont = 2; cont < numero; cont++) {
                if (numero % cont == 0) {
                    break;
                }
                numeros.remove(numeros.lastIndexOf(numero));
                numeros.add(0,numero);
            }
        }
        numerosEnumerate = numeros.listIterator();
        System.out.println("Lista después de modificarse:");
        while (numerosEnumerate.hasNext()) {
            System.out.println(numerosEnumerate.nextIndex() + " " + numerosEnumerate.next());
        }
    }
}