package grupaIII;

import java.util.ArrayList;
import java.util.Scanner;

//1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
public class Zadatak1 {

    public static ArrayList<Integer> kreirajListu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uneti koliki broj elemenata zelite da ubacite u listu: ");
        int brojElemenata = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>(brojElemenata);
        for (int i = 0; i < brojElemenata; i++) {
            lista.add(sc.nextInt());
        }
        return lista;
    }


    public static void ispisiListu(ArrayList<Integer> lista){
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = kreirajListu();
        ispisiListu(lista);
    }

}
