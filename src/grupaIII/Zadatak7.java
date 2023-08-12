package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.*/
public class Zadatak7 {

    public static ArrayList<Integer> nadoveziListe(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        ArrayList<Integer> lista = new ArrayList<>(lista1.size() + lista2.size());
        lista.addAll(lista1);
        lista.addAll(lista2);
        return lista;
    }

    public static void ispisiListu(ArrayList<Integer> lista){
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        ArrayList<Integer> nadovezanaLista = nadoveziListe(lista1, lista2);
        ispisiListu(nadovezanaLista);
    }
}
