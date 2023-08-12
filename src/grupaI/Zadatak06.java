package grupaI;

import java.util.Scanner;

/*Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.*/
public class Zadatak06 {
    public static void ispisBrojeva(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
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
