package grupaIV.zadatak15;

import java.util.ArrayList;

public class Zadtak15Test {

    public static void main(String[] args) {

        ArrayList<Double> ocene = new ArrayList<>();
        Ucenik ucenik = new Ucenik("Vladimir", "Milosevic", 1986, ocene);

        ucenik.dodajOcenu(5);
        ucenik.dodajOcenu(4);

        //System.out.println("Prosek: " + ucenik.prosek());
        //System.out.println("Kakav je djak: " + ucenik.kakavJeDjak());

        //System.out.println(ocene);

        System.out.println(ucenik);
    }
}
