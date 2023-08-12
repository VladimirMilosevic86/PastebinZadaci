package grupaI;

import java.util.Scanner;

/*5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od
zbira njegovih drugih dveju cifara.*/
public class Zadatak05 {

    public static void cetvorocifrenBroj(int n){
        int prvaCifra = n / 1000;
        int drugaCifra = (n / 100) % 10;
        int trecaCifra = (n % 100) / 10;
        int cetvrtaCifra = n % 10;
        System.out.print(n + ": " + prvaCifra + " * " + drugaCifra + " - (" + trecaCifra + " + " + cetvrtaCifra + ") " +
                "= ");
        System.out.println(prvaCifra * drugaCifra - (trecaCifra + cetvrtaCifra));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi cetvorocifreni broj: ");
        int n = sc.nextInt();

        cetvorocifrenBroj(n);
    }


}
