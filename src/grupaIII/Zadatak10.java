package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe. */
public class Zadatak10 {

    public static ArrayList<Integer> vracaNeparneIzListe (ArrayList<Integer> lista) {
        int duzinaListe = 0;
        ArrayList<Integer> listaNeparnih = new ArrayList<>(duzinaListe);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0){
                duzinaListe++;
                listaNeparnih.add(lista.get(i));
            }
        }
        return listaNeparnih;
    }

    public static void ispisiListu(ArrayList<Integer> lista){
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> listaNeparnih = vracaNeparneIzListe(lista);
        System.out.print("Ovo je lista neparnih: ");
        ispisiListu(listaNeparnih);
    }

}
