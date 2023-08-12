package grupaIV.zadatak13;

import java.util.ArrayList;
import java.util.Collections;

public class Prodavnica {

    private String ime;
    private ArrayList<Namirnica> namirniceProdavnica;

    public Prodavnica(String ime, ArrayList<Namirnica> namirniceProdavnica) {
        this.ime = ime;
        this.namirniceProdavnica = new ArrayList<>();
        this.namirniceProdavnica.addAll(namirniceProdavnica);
    }

    public Prodavnica(String ime) {
        this.ime = ime;
        this.namirniceProdavnica = new ArrayList<>();
    }

    public Prodavnica(String ime, Namirnica ... namirniceProdavnica) {
        this.ime = ime;
        this.namirniceProdavnica = new ArrayList<>();
        Collections.addAll(this.namirniceProdavnica, namirniceProdavnica);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Namirnica> getNamirniceProdavnica() {
        return namirniceProdavnica;
    }

    public void setNamirniceProdavnica(ArrayList<Namirnica> namirniceProdavnica) {
        this.namirniceProdavnica = namirniceProdavnica;
    }

    public void dodajNamirnicu(Namirnica n){
        namirniceProdavnica.add(n);
    }

    public void ukloniNamirnicu(Namirnica n){
        namirniceProdavnica.remove(n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ima namirnice:\n");
        for (Namirnica n : namirniceProdavnica)
            sb.append(n).append("\n");
        return sb.toString();
    }
}
