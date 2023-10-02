public class ejercicio2 {
    public static void main(String[] args) {
        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        System.out.println(simbolo);
    }
}

// Los valores de los elementos que no han sido inicializados se muestran con un caracter especial
// que da a entender que no hay ningun tipo de valor para esa posicion en el array.