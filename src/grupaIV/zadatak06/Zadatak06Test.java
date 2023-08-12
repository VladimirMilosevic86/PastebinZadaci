package grupaIV.zadatak06;

public class Zadatak06Test {

    public static void main(String[] args) {

        Osoba autor = new Osoba("Vladimir", "Milosevic", 1986, 1.84);
        Knjiga knjiga = new Knjiga("Boli me glava od Jave!!!", autor, 650, 2023);
        System.out.println(knjiga);

    }
}
