package grupaI;

import java.util.Scanner;

/* 7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0. */
public class Zadatak07 {
    public static void ispisBrojeva(int n) {
        if (n < 0) {
            for (int i = n; i <= 0; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else
            System.out.println("Morate uneti negativan broj.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi negativan ceo broj: ");
        int n = sc.nextInt();

        ispisBrojeva(n);
    }
}
