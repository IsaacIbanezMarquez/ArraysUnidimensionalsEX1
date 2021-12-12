



import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {


        // 1. Llegeix 10 enters i guarda'ls a un array i quan acabis els imprimeixes per pantalla amb un for.


        Scanner sc = new Scanner(System.in);
        //Crear Array
        int primerArray[] = new int[7];

        //Omplir de valors amb for i després amb while
        for (int i = 0; i < primerArray.length; i++) {
            primerArray[i] = sc.nextInt();
        }

        int i = 0;
        while (i < primerArray.length) {
            primerArray[i] = sc.nextInt();
            i++;
        }

        //Mostrar valors amb toString amb bucle for i bucle for millorat
        Arrays.toString(primerArray);

        for (i = 0; i < primerArray.length; i++) {
            System.out.println(primerArray[i]);
        }

        for (int valor : primerArray) {
            System.out.println(valor);
        }


    }
}
