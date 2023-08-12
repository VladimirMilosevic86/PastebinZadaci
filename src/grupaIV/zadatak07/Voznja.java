package grupaIV.zadatak07;

public class Voznja {

    public static void main(String[] args) {

        Automobil a1 = new Automobil("BMW", "i7", 17653, "Vladimir Milosevic");
        Automobil a2 = new Automobil("Mercedes", "AMG GT 53", 758272, "Pera Peric");

        System.out.println("Automobil 1:");
        System.out.println("Marka: " + a1.getMarka());
        System.out.println("Model: " + a1.getModel());
        System.out.println("Serijski broj: " + a1.getSerijskiBroj());

        System.out.println("\nAutomobil 2:");
        System.out.println("Marka: " + a2.getMarka());
        System.out.println("Model: " + a2.getModel());
        System.out.println("Serijski broj: " + (a2.getSerijskiBroj() - 272));
        a2.setVlasnik("Vladimir Milosevic");
        System.out.println("Vlasnik: " + a2.getVlasnik());

        System.out.println("\nAutomobil 1: " + a1.getMarka() + "-" + a1.getModel() + ", serijski broj: " + a1.getSerijskiBroj());

    }

}
