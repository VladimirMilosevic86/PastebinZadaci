package grupaI;

import java.util.Scanner;

/*8. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).*/
public class Zadatak18 {

    public static void sumaBrojeva(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi " + n + " realnih brojeva: ");
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double unetBroj = sc.nextDouble();
            suma += unetBroj;
        }
        System.out.println("Zbir unetih brojeva iznosi: " + suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        sumaBrojeva(n);
    }
}
