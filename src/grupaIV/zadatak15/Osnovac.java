package grupaIV.zadatak15;

import java.util.ArrayList;

public class Osnovac extends Ucenik{

    private ArrayList<String> bojice;

    public Osnovac(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, ArrayList<String> bojice) {
        super(ime, prezime, brojGodina, ocene);
        this.bojice = bojice;
        if (brojGodina <7 || brojGodina > 14)
            throw new IllegalArgumentException("Osnovac mora imati izmedju 7 i 14 godina!");
    }

    public Osnovac() {
        this.bojice = new ArrayList<>();
    }

    public ArrayList<String> getBojice() {
        return bojice;
    }

    public void setBojice(ArrayList<String> bojice) {
        this.bojice = bojice;
    }
}
