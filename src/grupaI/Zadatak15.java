package grupaI;

import java.util.Scanner;

//15. Za unete brojeve a, b i c ispisati najmanji od njih
public class Zadatak15 {
    public static void kojiJeNajmanji(int a, int b, int c){
        int x = Math.min(a, b);
        System.out.println("Najmanji je " + Math.min(x, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesi broj b: ");
        int b = sc.nextInt();
        System.out.print("Unesi broj c: ");
        int c = sc.nextInt();

        kojiJeNajmanji(a, b, c);
    }
}
