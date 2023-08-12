package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.*/
public class Zadatak9 {

    public static int proizvodElemenataUvecanihZaTri(ArrayList<Integer> lista) {
        int proizvod = 1;
        for (Integer i : lista)
            proizvod = proizvod * (i + 3);
        return proizvod;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Rezultat: " + proizvodElemenataUvecanihZaTri(lista));
    }
}
