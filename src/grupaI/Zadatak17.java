package grupaI;

import java.util.Scanner;

/*17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^}
i ispisuje resenje odgovarajuce operacije.*/
public class Zadatak17 {
    public static void digitron(double a, char x, double b){
        switch(x){
            case '+' -> System.out.println("a + b = " + (a + b));
            case '-' -> System.out.println("a - b = " + (a - b));
            case '*' -> System.out.println("a * b = " + a * b);
            case '/' -> System.out.println("a / b = " + a / b);
            case '%' -> System.out.println("a % b = " + a % b);
            case '^' -> System.out.println("a ^ b = " + Math.pow(a, b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj a: ");
        double a = sc.nextDouble();
        System.out.print("Unesi matematicki operand (+, -, *, /, %, ^): ");
        char operacija = sc.next().charAt(0);
        System.out.print("Unesi broj b: ");
        double b = sc.nextDouble();

        digitron(a, operacija, b);
    }
}
