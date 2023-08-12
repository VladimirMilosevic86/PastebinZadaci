package grupaIV.zadatak15;

import java.util.ArrayList;

public class Ucenik extends Osoba{

    private ArrayList<Double> ocene;

    private void postaviOcene(ArrayList<Double> ocene) {
        for (int i = 0; i < ocene.size(); i++) {
            if (ocene.get(i) < 1.0)
                ocene.set(i, 1.0);
            else if (ocene.get(i) > 5.0)
                ocene.set(i, 5.0);
            else
                this.ocene = ocene;
        }
    }

    public Ucenik(String ime, String prezime, int brojGodina, ArrayList<Double> ocene) {
        super(ime, prezime, brojGodina);
        this.ocene = ocene;
    }

    public Ucenik(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }

    public Ucenik() {
        this.ocene = new ArrayList<>();
        postaviOcene(ocene);
    }

    public ArrayList<Double> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }

    public void dodajOcenu(double x) {
        if (x >= 1.0 && x <= 5.0)
            ocene.add(x);
        else
            System.out.println("Ocena mora biti izmedju 1.0 i 5.0, pa ocena " + x + " nije ubacena u listu ocena!");

    }
    public void promeniOcenu(double x, int i) {
        if (x >= 1.0 && x <= 5.0)
            ocene.set(i, x);
        else
            System.out.println("UPOZORENJE: ocena mora biti izmedju 1.0 i 5.0, pa je ocena " + x + " vracena na prethodnu vrednost: " + ocene.get(i));
    }

    public void izbrisiOcenu(int i) {
        ocene.remove(i);
    }
    public void izbrisiOcenu(double x) {
        ocene.remove(x);
    }

    public double prosek() {
        double suma = 0;
        for (int i = 0; i < ocene.size(); i++) {
            if (ocene.get(i) >= 1 && ocene.get(i) < 2.0)
                return 1.0;
            else {
                suma += ocene.get(i);
            }
        }
        return suma / ocene.size();
    }

    public String kakavJeDjak() {
        if (prosek() < 2.0)
            return "Nedovoljan";
        else if (prosek() < 2.5)
            return "Dovoljan";
        else if (prosek() < 3.5)
            return "Dobar";
        else if (prosek() < 4.5)
            return "Vrlo dobar";
        else
            return "Odlican";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" ").append(getPrezime()).append(" (").append(getBrojGodina()).append(" godina) ima ocene:\n");
        for (Double d : ocene)
            sb.append(d).append(" ");
        sb.append("\n").append("Prosek: ").append(prosek());
        return sb.toString();
    }
}
