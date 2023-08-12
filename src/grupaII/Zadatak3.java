package grupaII;
/*
 * 3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
 * Izracunati sumu tog niza. Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
 * b) Napraviti funkciju koja vraca sumu prosledjenog niza.
 */

import java.util.Scanner;

public class Zadatak3 {

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

static int suma(int[] niz){
    int suma = 0;
    for (int i = 0; i < niz.length; i++) {
        suma += niz[i];
    }
    return suma;
}

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz);

        System.out.print("Zbir svih brojeva u vasem nizu je: " + suma(niz));

    }

}
