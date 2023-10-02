import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<>();
        Integer numeroMinimo = 501;
        Integer numeroMaximo = 0;
        while (numeros.size() < 100) {
            Integer numeroGenerado = rand.nextInt(500);
            if (numeroGenerado > numeroMaximo) {
                numeroMaximo = numeroGenerado;
            }
            else if (numeroGenerado < numeroMinimo) {
                numeroMinimo = numeroGenerado;
            }
            numeros.add(String.valueOf(numeroGenerado));
        }
        System.out.println(numeros);
        System.out.println("Introduzca 'maximo' para resaltar el numero máximo, y 'minimo' para el minimo");
        String opcionElegida = userInput.nextLine().toLowerCase();
        switch (opcionElegida) {
            case "maximo":
                numeros.set(numeros.indexOf(String.valueOf(numeroMaximo)), "**" + numeroMaximo + "**");
                break;
            case "minimo":
                numeros.set(numeros.indexOf(String.valueOf(numeroMinimo)), "**" + numeroMinimo + "**");
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(numeros);
    }
}
