package grupaIV.zadatak13;

import java.util.ArrayList;

public class Zadatak13Test {

    public static void main(String[] args) {

        Namirnica n1 = new Namirnica("hleb", 50);
        Namirnica n2 = new Namirnica("mleko", 120);
        Namirnica n3 = new Namirnica("mleveno meso", 600);
        Namirnica n4 = new Namirnica("cokolada", 315);
        Namirnica n5 = new Namirnica("jabuke", 98);

        ArrayList<Namirnica> namirnice = new ArrayList<>();
        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);
        namirnice.add(n4);
        namirnice.add(n5);
        //namirnice.remove(n1);

        Prodavnica prodavnica = new Prodavnica("Maxi", namirnice);
        System.out.println(prodavnica);

        //Prodavnica prod = new Prodavnica("Ime", n1, n2, n3);

        Osoba o1 = new Osoba("Vladimir", "Milosevic", 1986, 1.84);
        System.out.println(o1);

        Korpa korpa = new Korpa();
        korpa.dodajUKorpu(n3);
        korpa.dodajUKorpu(n1, 3);
        korpa.dodajUKorpu(n2);
        //korpa.ukloniIzKorpe(n1, 4);
        //korpa.ukloniIzKorpeSveNamirniceN(n1);
        //korpa.isprazniKorpu();

        System.out.println(korpa);
        //System.out.println(korpa.cenaKorpe());

        Kupac kupacVladimirMilosevic = new Kupac("Vladimir", "Milosevic", 1986, 4000);
        //Kupac kupacKorpa = new Kupac(4000);
        kupacVladimirMilosevic.dodajUKorpu(n3);
        kupacVladimirMilosevic.dodajUKorpu(n1, 3);
        kupacVladimirMilosevic.dodajUKorpu(n2);
        System.out.println(kupacVladimirMilosevic);

        System.out.println("=======================");
        kupacVladimirMilosevic.kupi();
        System.out.println("Kupio je " + kupacVladimirMilosevic.getKupljeneNamirnice());
        System.out.println("Posle kupovine" + kupacVladimirMilosevic);

    }

}
