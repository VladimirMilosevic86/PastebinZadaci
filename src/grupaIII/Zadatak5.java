package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe. (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3
	elemenata).   1 2 3 4 5 */
public class Zadatak5 {

    public static int drugiNajmanjiElementListe(ArrayList<Integer> lista){
        int min2 = 0;

        if(lista.size() < 3)
            System.out.println("Lista mora imati najmanje 3 elementa!");
        else {
            Collections.sort(lista);
            min2 = lista.get(1);
        }
        return min2;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 2));
        System.out.println("Drugi najmanji je: " + drugiNajmanjiElementListe(lista));
    }
}
