import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[] temperaturas = new int[12];

        for (int i = 1; i <= 12; i++) {
            System.out.print("Introduzca la temperatura del " + i + "º mes: ");
            int num = Integer.parseInt(lectura.next());
            temperaturas[(i-1)] = num;
        }

        String chr = "*";
        int i = 1;
        System.out.println("\n       |");
        for (int num: temperaturas) {
            if (i >= 10) {
                System.out.println("Mes " + i + " |" + chr.repeat(num));
                System.out.println("       |");
            } else {
                System.out.println("Mes " + i + "  |" + chr.repeat(num));
                System.out.println("       |");
            }
            i++;
        }
    }
}
