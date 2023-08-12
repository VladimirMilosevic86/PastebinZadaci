package grupaI;

import java.util.Scanner;

public class Zadatak03 {

    //3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.

    public static void osnovneAritmetickeOperacije(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println(a + " % " + b + " = " + a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();

        osnovneAritmetickeOperacije(a, b);

    }
}
