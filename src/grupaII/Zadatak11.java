package grupaII;

import java.util.Scanner;

/* 11. Napisati funkciju koja duplira sve elemente niza.
    * Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]*/
public class Zadatak11 {

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

    static void duplirajElementeNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            niz[i] *= 2;
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

        System.out.print("Duplirani elementi niza su: ");
        duplirajElementeNiza(niz);

    }
}
