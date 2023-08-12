package grupaII;

import java.util.Scanner;

/*
* 2. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
* Primer: [1, 2, 3, 4, 5] -> 1 3 5
b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.*/

public class Zadatak2 {

    static int[] kreirajNiz (int duzinaNiza){
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[duzinaNiza];
        System.out.print("Unesite " + duzinaNiza + " elemenata niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    static void ispisiNiz (int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    static void ispisiSvakiDrugiElementNiza (int [] niz){
        for (int i = 1; i < niz.length; i+=2) {
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

        System.out.print("Svaki drugi element niza je: ");
        ispisiSvakiDrugiElementNiza(niz);
    }
}
