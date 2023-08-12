package grupaII;

/*12. Napisati funkciju koja sabira 2 niza iste duzine element po element.
      (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
      Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]*/
public class Zadatak12 {

    static int[] sumaNizova(int[] niz1, int[] niz2){
        int[] niz = new int[niz1.length];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = niz1[i] + niz2[i];
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

        int[] niz1 = {2, 4, 6};
        int[] niz2 = {1, 4, 4};

        int[] niz = sumaNizova(niz1, niz2);
        System.out.println("Novi niz: ");
        ispisiNiz(niz);
    }
}
