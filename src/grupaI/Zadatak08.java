package grupaI;

import java.util.Scanner;

/* 8. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.*/
public class Zadatak08 {

    public static void ispisBrojeva(int n) {
        if (n > 0) {
            for (int i = -14; i <= 2 * n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else
            System.out.println("Morate uneti pozitivan broj.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        ispisBrojeva(n);
    }

}
