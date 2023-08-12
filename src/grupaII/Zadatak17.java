package grupaII;

//Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
public class Zadatak17 {

    static boolean proveraImena (String[] niz){
        for (int i = 0; i < niz.length; i++) {
            if(niz[i].equalsIgnoreCase("Marija") || niz[i].equalsIgnoreCase("Petar"))
                return true;
        }
        return false;
    }
    static void ispisDaLiImaImena(String[] niz){
        if(proveraImena(niz))
            System.out.println("U nizu ima imena Marija ili Petar.");
        else
            System.out.println("Marija i Petar ne postoje u nizu!");
    }

    public static void main(String[] args) {

        String[] nizImena = {"Marko", "Petar", "Djordje", "Zivorad", "Marija", "Nina"};

        ispisDaLiImaImena(nizImena);

    }
}
