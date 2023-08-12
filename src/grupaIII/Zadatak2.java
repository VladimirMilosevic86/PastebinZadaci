package grupaIII;

import java.util.ArrayList;
import java.util.Scanner;

/* Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
   proslednjenju ArrayListu. */
public class Zadatak2 {

    public static ArrayList<Integer> kreirajListu(int brojElemenata){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>(brojElemenata);
        System.out.print("Unesite " + brojElemenata + " elemenata liste: ");
        for (int i = 0; i < brojElemenata; i++) {
            lista.add(sc.nextInt());
        }
        return lista;
    }

    public static ArrayList<Integer> duplirajElementeListe(ArrayList<Integer> lista){
        ArrayList<Integer> dupliranaLista = new ArrayList<>(lista.size());
        for (Integer i : lista) {
            dupliranaLista.add(i * 2);
        }
        return dupliranaLista;
    }

    public static void ispisiListu(ArrayList<Integer> lista){
        for (Integer i:lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ArrayList<Integer> lista = kreirajListu(5);
        System.out.print("Ovo je vasa lista: ");
        ispisiListu(lista);
        ArrayList<Integer>dupliranaLista = duplirajElementeListe(lista);
        System.out.print("Ovo je lista sa dupliranim elementima: ");
        ispisiListu(dupliranaLista);

    }
}
