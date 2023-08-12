package grupaII;

import java.util.Scanner;

/*Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
Ispisati svaki treci element u obrnutom redosledu. Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/

public class Zadatak4 {

    static int[] kreirajNiz(int duzinaNiza){
        Scanner sc = new Scanner(System.in);
        int [] niz = new int[duzinaNiza];
        System.out.print("Unesi " + duzinaNiza + " elemenata niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    static void ispisiNiz(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    static void ispisiSvakiTreciElementObrnutimRedosledom (int[] niz) {
        for (int i = niz.length - 1; i >= 0 ; i -= 3) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz);

        System.out.print("Obrnutim redosledom, svaki treci element niza: ");
        ispisiSvakiTreciElementObrnutimRedosledom(niz);
    }
}
