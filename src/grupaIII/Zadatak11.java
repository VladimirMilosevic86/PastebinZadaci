package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;
/* 11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe. */
public class Zadatak11 {

    public static double prosecnaVrednostListe(ArrayList<Integer> lista) {
        int zbir = 0;
        for (Integer i : lista){
            zbir += i;
        }
        return (double) zbir / lista.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.print("Prosecna vrednost iz liste je: " + prosecnaVrednostListe(lista));
    }
}
