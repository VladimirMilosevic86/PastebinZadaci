package grupaI;

import java.util.Scanner;

/* 13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
(dakle 1 + 2 + 3 + ... + t).*/
public class Zadatak13 {
    public static void nekeNebulozneSume(int n){
        for (int i = 1; i < n; i++) {
            int suma = 0;
            for (int j = 1; j < i+1; j++) {
                suma = suma+j;
            }
            System.out.println(i + ": " + suma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        nekeNebulozneSume(n);
    }
}
