package grupaII;

/* 13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
* Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]*/
public class Zadatak13 {

    static int[] nadoveziNizove(int[] niz1, int[] niz2){
        int[] niz = new int[niz1.length + niz2.length];
        //upisuj od index = 0 do index = 2 (tri elementa iz niza 1)
        for (int i = 0; i < niz1.length; i++) {
            niz[i] = niz1[i];
        }
        //nastavi od index = 3 pa do kraja niza (index = 7)
        for (int i = niz1.length; i < niz.length; i++) {
            niz[i] = niz2[i - niz1.length]; // da bi poceo da uzima od indexa 0 u drugom nizu
        }
        return niz;
    }

    static void ispisiNiz(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3};
        int[] niz2 = {17, 20, -3, 14, 20};

        int[] niz = nadoveziNizove(niz1, niz2);
        System.out.println("Ovo je nadovezan niz: ");
        ispisiNiz(niz);

    }
}
