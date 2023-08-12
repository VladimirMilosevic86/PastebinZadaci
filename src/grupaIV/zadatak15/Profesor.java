package grupaIV.zadatak15;

import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Osoba{

    private ArrayList<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, int brojGodina, double visina, ArrayList<String> predmetiKojePredaje) {
        super(ime, prezime, brojGodina, visina);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor(String ime, String prezime, int godinaRodjenja, ArrayList<String> predmetiKojePredaje) {
        super(ime, prezime, godinaRodjenja);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = new ArrayList<>();
    }

    public ArrayList<String> getPredmetiKojePredaje() {
        return predmetiKojePredaje;
    }

    public void setPredmetiKojePredaje(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public void add(String predmet){
        predmetiKojePredaje.add(predmet);
    }

    public void add(String predmet, int i){
        predmetiKojePredaje.add(i, predmet);
    }

    public void addAll(ArrayList<String> predmeti){
        predmetiKojePredaje.addAll(predmeti);
    }

    public void remove(int i){
        predmetiKojePredaje.remove(i);
    }

    public void remove(String predmet){
        predmetiKojePredaje.remove(predmet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (!(o instanceof Profesor profesor)) return false;
        return Objects.equals(predmetiKojePredaje, profesor.predmetiKojePredaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmetiKojePredaje);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" ").append(getPrezime()).append(" (").append(getBrojGodina()).append(" godina) je profesor i predaje:\n");
        for (String s : predmetiKojePredaje)
            sb.append(s).append(" ");
        return sb.toString();
    }
}
