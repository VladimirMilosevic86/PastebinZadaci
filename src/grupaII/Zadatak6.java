package grupaII;

import java.util.Scanner;

//6. Napisati funkciju koja racuna proizvod 3 broja.
public class Zadatak6 {

    static int proizvod(int x, int y, int z){
        return x * y * z;
    }

    static double proizvod(double x, double y, double z){
        return x * y * z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi ceo broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesi ceo broj b: ");
        int b = sc.nextInt();
        System.out.print("Unesi ceo broj c: ");
        int c = sc.nextInt();

        System.out.println("Proizvod = " + proizvod(a, b , c));

    }
}
