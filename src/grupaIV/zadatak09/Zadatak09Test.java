package grupaIV.zadatak09;

import java.util.ArrayList;

public class Zadatak09Test {

    //Ispisi su ocajni :( ali metode rade :)

    public static void main(String[] args) {

        Ucenik u1 = new Ucenik("Vladimir", "Milosevic", 4, 5, 5, 3);
        Ucenik u2 = new Ucenik("Strahinja", "Trninic", 5, 5, 5, 5, 5);
        Ucenik u3 = new Ucenik("Marko", "Tomin", 4, 3, 5, 2, 3);
        Ucenik u4 = new Ucenik("Nikola", "Sarac", 1, 2, 3, 4, 5);
        Ucenik u5 = new Ucenik("Andjela", "Relic", 2, 3, 4, 2, 4);

        System.out.println(u1);

       ArrayList<Ucenik> dnevnik = new ArrayList<>();
       Odeljenje odeljnje21 = new Odeljenje("II-1", dnevnik);
       odeljnje21.upisiUcenika(u1);
       odeljnje21.upisiUcenika(u2);
       odeljnje21.upisiUcenika(u3);
       odeljnje21.upisiUcenika(u4);
       odeljnje21.upisiUcenika(u5, 1);

        System.out.println(odeljnje21);


       odeljnje21.pogledajOcene(u1);
       odeljnje21.pogledajOcene(1);

       odeljnje21.prosecnaOcena(u1);
       odeljnje21.prosecnaOcena(1);

        System.out.println("Prosek odeljenja: " + odeljnje21.prosecnaOcenaOdeljenja());

        odeljnje21.opisnaOcena(u4);
        System.out.println("===============================");
        System.out.println(odeljnje21.izlistajDnevnik());
        System.out.println(odeljnje21.velicinaOdeljenja());
        System.out.println("=============================");
        odeljnje21.ispisiUcenika(u2);
        System.out.println(odeljnje21.izlistajDnevnik());

    }

}
