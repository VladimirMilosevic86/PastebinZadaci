package grupaII;

/*  18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element. Npr:
    [1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
    [1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8] */
public class Zadatak18 {

    public static int[] deliNizPaSabira(int[] niz){
        int[] niz1;
        int[] niz2;
        int[] nizSuma;

        if (niz.length % 2 == 0){
            niz1 = new int[niz.length / 2];
            niz2 = new int[niz.length / 2];
            nizSuma = new int[niz.length / 2];
            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length];
            }
        }
        else {
            nizSuma = new int[niz.length / 2 + 1];
            niz1 = new int[niz.length / 2 + 1];
            niz2 = new int[niz.length / 2 + 1];
            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length - 1];
            }
        }

        for (int i = 0; i < nizSuma.length; i++) {
            nizSuma[i] = niz1[i] + niz2[i];
        }
        return nizSuma;
    }

    public static void ispisNiza(int[] niz){
        for (int i : niz) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nizParan = {1, 2, 3, 4, 5, 6};
        int[] nizNeparan = {1, 2, 3, 4, 5};

        int[] nizSumaParan = deliNizPaSabira(nizParan);
        System.out.println("Paran niz: ");
        ispisNiza(nizSumaParan);

        int[] nizSumaNeparan = deliNizPaSabira(nizNeparan);
        System.out.println("Neparan niz: ");
        ispisNiza(nizSumaNeparan);


    }
}