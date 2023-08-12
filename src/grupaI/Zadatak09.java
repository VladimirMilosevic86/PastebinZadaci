package grupaI;

import java.util.Scanner;

// 9. Ispisati proizvod prvih n celih brojeva [1, n].
public class Zadatak09 {
    public static void proizvodCelihBrojeva(int n){
        int proizvod = 1;
        for (int i = 1; i <= n; i++) {
            proizvod *= i;
        }
        System.out.println("Proizvod brojeva od 1 do " + n + " iznosi: " + proizvod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();

        proizvodCelihBrojeva(n);
    }
}
