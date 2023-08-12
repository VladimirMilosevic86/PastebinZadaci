package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe. */
public class Zadatak8 {

    public static int zbirElemenataListe(ArrayList<Integer> lista){
        int zbir = 0;
        for(Integer i : lista){
            zbir += i;
        }
        return zbir;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Zbir svih elemenata liste je: " + zbirElemenataListe(lista));
    }

}
