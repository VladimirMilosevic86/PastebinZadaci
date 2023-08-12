package grupaI;

import java.util.Scanner;

/*  4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka,
    a poruku "Suprotnog znaka", ako nisu istog znaka. */
public class Zadatak04 {

    public static void znakBrojeva(int a, int b) {
        if (a >= 0 && b >= 0 || a < 0 && b < 0)
            System.out.println("Brojevi su istog znaka.");
        else
            System.out.println("Brojevi su suprotnog znaka.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();

        znakBrojeva(a, b);

    }
}
