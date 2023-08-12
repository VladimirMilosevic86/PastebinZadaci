package grupaII;

import java.util.Scanner;

//8. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
public class Zadatak8 {

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

    static boolean daLiJeParan (int x) {
        return x % 2 == 0;
    }

    static void ispisiParneElementeNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (daLiJeParan(niz[i])) {
                System.out.print(niz[i] + " ");
            }
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

        System.out.print("Parni elementi tog niza su: ");
        ispisiParneElementeNiza(niz);

    }
}
