package grupaI;

import java.util.Scanner;

/*20.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n.
Zatim se unose n double brojeva jedan po jedan.
Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma:
a*x^2 + b*x + c, gde je x taj uneti broj.*/
public class Zadatak20 {
    public static void polinom(final double a, final double b, final double c, int n){
        Scanner sc = new Scanner(System.in);
        double vrednostPolinoma;
        System.out.println("Unesi " + n + " realnih brojeva: ");
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            vrednostPolinoma = a * Math.pow(x, 2) + b * x + c;
            System.out.println("Za x = " + x + " -> a*x^2 + b*x + c = " + vrednostPolinoma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi konstantu a (realan broj): ");
        final double a = sc.nextDouble();
        System.out.print("Unesi konstantu b (realan broj): ");
        final double b = sc.nextDouble();
        System.out.print("Unesi konstantu c (realan broj): ");
        final double c = sc.nextDouble();
        System.out.print("Unesi pozitivan ceo broj n: ");
        int n = sc.nextInt();

        polinom(a, b, c, n);
    }
}
