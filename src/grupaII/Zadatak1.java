package grupaII;

import java.util.Scanner;

/*
* 1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
* Primer: [4, 2, 3, 5] -> 5 3 2 4
* b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.*/
public class Zadatak1 {

static int[] kreirajNiz(int duzinaNiza){
    Scanner sc = new Scanner(System.in);
    int[] niz = new int[duzinaNiza];
    System.out.print("Unesi " + duzinaNiza + " elemenata niza: ");
    for (int i = 0; i < niz.length; i++) {
        niz[i] = sc.nextInt();
    }
    return niz;
}

static void ispisNiza(int niz[]){
    for (int i : niz) {
        System.out.print(i + " ");
    }
    System.out.println();
}

static void ispisujeObrnutRedosledElemenataNiza(int[] niz){
    for (int i = niz.length - 1; i >= 0 ; i--) {
        System.out.print(niz[i] + " ");
    }
    System.out.println();
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj elemenata niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza);
        System.out.print("Vas niz je: ");
        ispisNiza(niz);

        System.out.print("Obrnut redosled niza: ");
        ispisujeObrnutRedosledElemenataNiza(niz);

    }
}
