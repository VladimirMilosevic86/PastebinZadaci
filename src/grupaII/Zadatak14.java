package grupaII;

import java.util.Arrays;

//14.* Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
public class Zadatak14 {

    public static int sumaPrvihPratilja (int[] niz) {
        Arrays.sort(niz);
        return niz[1] + niz[niz.length - 2];
    }

    public static void main(String[] args) {

        int[] niz = {40, 1, 23, 8, 49, 32, 17, 5};
        System.out.println("Zbir drugog najmanjeg i drugog najveceg je: " + sumaPrvihPratilja(niz));
    }
}
