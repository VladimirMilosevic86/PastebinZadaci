package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 4. Napisati funkciju koja vraca najveci element iz ArrayListe. */
public class Zadatak4 {

    public static int najveciElementListe(ArrayList<Integer> lista){
        int max = Integer.MIN_VALUE;
        for (Integer i : lista) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(lista);
        System.out.println("Najveci element liste je: " + najveciElementListe(lista));
    }
}
