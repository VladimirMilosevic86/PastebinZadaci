package grupaI;

import java.util.Scanner;

/* Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).*/
public class Zadatak19 {

    public static void proizvodBrojeva(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi " + n + " realnih brojeva: ");
        double proizvod = 1;
        for (int i = 0; i < n; i++) {
            double unetBroj = sc.nextDouble();
            proizvod *= unetBroj;
        }
        System.out.println("Proizvod unetih brojeva iznosi: " + proizvod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        proizvodBrojeva(n);
    }
}
