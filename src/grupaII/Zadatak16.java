package grupaII;

//16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
public class Zadatak16 {

    static double suma(double[] niz){
        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        return suma;
    }

    static double prosecnaVrednostNiza(double[] niz){
        return suma(niz) / niz.length;
    }

    public static void main(String[] args) {

        double[] niz = {2.0, 3.0, 4.0};
        System.out.println("Prosecna vrednost niza je: " + prosecnaVrednostNiza(niz));
    }

}
