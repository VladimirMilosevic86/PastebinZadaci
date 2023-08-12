package grupaIV.zadatak08;

public class Zadatak08Test {

    public static void main(String[] args) {

        Osoba vodjaPuta = new Osoba("Vladimir", "Milosevic", 1986, 1.84);
        Osoba putnik1 = new Osoba("Strahinja", "Trninic", 1998, 1.82);
        Osoba putnik2 = new Osoba("Marko", "Tomin", 2000, 1.83);
        Osoba putnik3 = new Osoba("Dragoljub", "Boranijasevic", 1990, 1.85);



        Automobil auto = new Automobil("BMW", "i7", 12345, "Vladimir Milosevic");
        Grad grad = new Grad("Novi Sad", 400_000, "Srbija");
        Putovanje putovanje = new Putovanje(grad, vodjaPuta, auto, 80);
        putovanje.prijava(putnik1);
        putovanje.prijava(putnik2);
        putovanje.prijava(putnik3);

        System.out.println("Prva lista: ");
        System.out.println(putovanje);

        System.out.println("\nDragoljub odustao :(");
        putovanje.odjava(putnik3);
        System.out.println(putovanje);


    }

}
