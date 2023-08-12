package grupaI;

import java.util.Scanner;

public class Zadatak02 {

    /*Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili
    "Neutralan" ako je tacno 0.*/

    public static void negativanPozitivanBroj (int n){
        if (n > 0)
            System.out.println("Pozitivan");
        else if (n < 0)
            System.out.println("Negativan");
        else
            System.out.println("Neutralan");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj: ");
        int n = sc.nextInt();

        negativanPozitivanBroj(n);
    }
}
