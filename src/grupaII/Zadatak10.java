package grupaII;

import java.util.Scanner;

//10. Napisati funkciju koja vraca najmanji element niza.
public class Zadatak10 {

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

    static int najmanjiElementNiza(int[] niz){
        int najmanjiElement = Integer.MAX_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < najmanjiElement)
                najmanjiElement = niz[i];
        }
        return najmanjiElement;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz);

        System.out.println("Najmanji element niza je: " + najmanjiElementNiza(niz));

    }

}
