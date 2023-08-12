package grupaI;

import java.util.Scanner;

/*11. Korisnik unosi ime, prezime i godinu rodjena.
Ispisati: "Dobrodosao u {x}. razred, {ime} {prezime}", pod pretpostavkom da je trenutna godina 2023.
Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/
public class Zadatak11 {
    public static void razred(String ime, String prezime, int godinaRodjenja){
        int godinaPolaska = godinaRodjenja + 7;
        int godinaZavrsetka = godinaPolaska + 11;
        int razred = 2023 - godinaPolaska;

        if ((2023 - godinaRodjenja) < 7)
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje " + godinaPolaska + ". godine.");
        else if ((2023 - godinaRodjenja) > 18)
            System.out.println(ime + " " + prezime + " je zavrsio skolu " + godinaZavrsetka + ". godine.");
        else if ((2023 - godinaRodjenja) >= 7 && (2023 - godinaRodjenja) <= 18)
            System.out.println("\nDobro dosao u " + razred + ". razred, " + ime + " " + prezime + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite Vase ime: ");
        String ime = sc.next();
        System.out.print("Unesite Vase prezime: ");
        String prezime = sc.next();
        System.out.print("Unesite Vasu godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        razred(ime, prezime, godinaRodjenja);
    }
}
