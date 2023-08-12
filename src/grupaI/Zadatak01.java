package grupaI;

import java.util.Scanner;

public class Zadatak01 {

    //1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

    public static void paranNeparanBroj(int n){
        if (n % 2 == 0)
            System.out.println("Paran");
        else System.out.println("Neparan");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi ceo broj: ");
        int n = sc.nextInt();

        System.out.print("Broj koji ste uneli je: ");
        paranNeparanBroj(n);

    }
}
