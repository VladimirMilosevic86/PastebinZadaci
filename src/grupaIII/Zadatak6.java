package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe. */
public class Zadatak6 {

    public static int najmanjiOdTriListe(ArrayList<Integer> lista1, ArrayList<Integer> lista2, ArrayList<Integer> lista3){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (Integer i : lista1) {
            if (i < min1)
                min1 = i;
        }

        for (Integer i : lista2) {
            if (i < min2)
                min2 = i;
        }

        for (Integer i : lista3) {
            if (i < min3)
                min3 = i;
        }

        return Math.min(Math.min(min1, min2), min3);
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(3, 7, 9, 17));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1, -4, 59, 28));
        ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(2, -1, 19, 0));

        System.out.println("Najmanji iz tri liste je: " + najmanjiOdTriListe(lista1, lista2, lista3));
    }

}
