package grupaIII;

import java.util.ArrayList;
import java.util.Arrays;

/* 12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova. */
public class Zadatak12 {

    public static String najduziString(ArrayList<String> lista) {
        String najduzaRec = "";
        for (String s: lista){
            if (s.length() > najduzaRec.length())
                najduzaRec = s;
        }
        return najduzaRec;
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Pera", "Milutin", "Vladimir", "Eo"));
        System.out.print("Najduza rec iz liste je: " + najduziString(lista));
    }
}
