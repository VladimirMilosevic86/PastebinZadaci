package grupaIV.zadatak11;

public class Zadatak11Test {

    public static void main(String[] args) {

        Pravougaonik pravougaonik1 = new Pravougaonik(2, 5);
        Pravougaonik pravougaonik2 = new Pravougaonik(5, 2);
        System.out.println(pravougaonik1);
        System.out.println(pravougaonik2);
        if(pravougaonik1.equals(pravougaonik2))
            System.out.println("Isti su.");
        else
            System.out.println("Nisu isti.");

        System.out.println("=====================================");
        Kvadrat kvadrat1 = new Kvadrat(5);
        Kvadrat kvadrat2 = new Kvadrat(2);
        System.out.println(kvadrat1);
        System.out.println(kvadrat2);
        if(kvadrat1.equals(kvadrat2))
            System.out.println("Isti su.");
        else
            System.out.println("Nisu isti.");
    }
}
