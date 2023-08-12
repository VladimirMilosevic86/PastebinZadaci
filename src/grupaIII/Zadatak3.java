package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste. */
public class Zadatak3 {

    public static boolean daLiSuListeIste(ArrayList<Double> lista1, ArrayList<Double> lista2){
        if (lista1.size() != lista2.size())
            return false;
        else {
            for (int i = 0; i < lista1.size(); i++) {
                if(!lista1.get(i).equals(lista2.get(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void daLiSuListeIste2(ArrayList<Double> lista1, ArrayList<Double> lista2){
        if (lista1.equals(lista2))
            System.out.println("Jesu iste!");
        else
            System.out.println("Nisu iste!");
    }

    public static void main(String[] args) {

        ArrayList<Double> lista1 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        ArrayList<Double> lista3 = new ArrayList<>(List.of(1.1, 2.2, 3.3, 4.4));
        ArrayList<Double> lista2 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));

        System.out.print("Prvi nacin: ");
        System.out.println(daLiSuListeIste(lista1, lista3));
        System.out.print("Drugi nacin: ");
        daLiSuListeIste2(lista1, lista2);

    }
}
