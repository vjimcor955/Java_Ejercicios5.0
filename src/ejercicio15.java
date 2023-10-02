import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> mesas = new ArrayList<>();
        Integer cantidadPersonas;
        while (mesas.size() < 10) {
            mesas.add(rand.nextInt(4));
        }
        ListIterator mesasEnumerate = mesas.listIterator();;
        while (mesasEnumerate.hasNext()) {
            System.out.println("Ocupacion mesa " + mesasEnumerate.nextIndex() + ": " + mesasEnumerate.next());
        }
        while (true) {
            System.out.println("Cuantas personas sois?");
            cantidadPersonas = userInput.nextInt();
            if (cantidadPersonas == -1) {
                break;
            }
            else if (cantidadPersonas > 4 || cantidadPersonas < 1) {
                System.out.println("Lo siento, tamaño de grupo incorrecto. Solo entre 1 y 4 personas");
            }
            else {
                if (!mesas.contains(0)) {
                    System.out.println("Lo siento, no nos queda sitio");
                }
                else {
                    System.out.println("Por favor, sientese en la mesa " +  mesas.indexOf(0));
                    mesas.set(mesas.indexOf(0),cantidadPersonas);
                }
            }
            mesasEnumerate = mesas.listIterator();
            while (mesasEnumerate.hasNext()) {
                System.out.println("Ocupacion mesa " + mesasEnumerate.nextIndex() + ": " + mesasEnumerate.next());
            }
        }
    }
}
