package grupaII;

//15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
public class Zadatak15 {

    static int suma(int[] niz){
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        return suma;
    }

    static int proizvod (int[] niz) {
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];

        }
        return proizvod;
    }

    static boolean daLiJeSumaVecaOdProizvoda(int[] niz){
        return suma(niz) > proizvod(niz);
    }

    public static void main(String[] args) {

        int[] niz = {1, 2, 3, 4, 0};

        if(daLiJeSumaVecaOdProizvoda(niz))
            System.out.println("Suma je veca od proizvoda!");
        else
            System.out.println("Nije! Proizvod je veci!");
    }


}
