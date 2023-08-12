package grupaII;

import java.util.Scanner;

//9. Napisati funkciju koja vraca najveci element niza.
public class Zadatak9 {

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

    static int najveciElementNiza(int[] niz){
        int najveciElement = Integer.MIN_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > najveciElement)
                najveciElement = niz[i];
        }
        return najveciElement;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz);

        System.out.println("Najveci element niza je: " + najveciElementNiza(niz));

    }
}
