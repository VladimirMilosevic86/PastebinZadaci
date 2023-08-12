package grupaIV.zadatak09;

import java.util.ArrayList;
import java.util.Collections;

public class Ucenik {

    private String ime, prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime, Integer ... ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
        Collections.addAll(this.ocene, ocene);
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public double prosek(){
        double suma = 0;
        for (Integer i : ocene){
            suma += i;
        }
        return suma / ocene.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ucenik ").append(ime).append(" ").append(prezime).append(" ima ocene:\n");
        for (Integer i : ocene)
            sb.append(i).append(" ");
        return sb.toString();
    }
}
