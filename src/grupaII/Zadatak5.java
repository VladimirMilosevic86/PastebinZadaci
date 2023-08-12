package grupaII;/*
* Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
* Izracunati proizvod elemenata tog niza. Primer: [2, 4] -> 8
* b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.
* */

import java.util.Scanner;

public class Zadatak5 {

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

    static int proizvod (int[] niz) {
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];

        }
        return proizvod;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz);

        System.out.print("Proizvod brojeva u nizu iznosi: " + proizvod(niz));

    }
}
