package grupaI;

import java.util.Scanner;

//14. Za unete brojeve a i b ispisati veci od njih.
public class Zadatak14 {
    public static void kojiJeVeci(int a, int b){
        System.out.println("Veci je " + Math.max(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesi broj b: ");
        int b = sc.nextInt();

        kojiJeVeci(a, b);
    }
}
