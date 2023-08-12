package grupaIV.zadatak09;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj){
        for (int i = 0; i < dnevnik.size(); i++)
            if (redniBroj - 1 == i)
                dnevnik.add(i, u);
    }

    public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u){
        System.out.println(u.getOcene());
    }

    public void pogledajOcene(int i){
        System.out.println(dnevnik.get(i) + " su: " + dnevnik.get(i).getOcene());
    }

    public void prosecnaOcena(Ucenik u){
        System.out.println("Prosek ucenika " + u + " je: " + u.prosek());
    }

    public void prosecnaOcena(int i){
        System.out.println("Prosek ucenika " + dnevnik.get(i) + " je: " + dnevnik.get(i).prosek());
    }

    public double prosecnaOcenaOdeljenja(){
        double sumaProseka = 0;
        if (dnevnik.size() == 0)
            return 0;
        else {
            for (Ucenik u : dnevnik) {
                sumaProseka += u.prosek();
            }
        }
        double prosekOdeljenja = sumaProseka / dnevnik.size();
        return (double) Math.round(100 * prosekOdeljenja) / 100;
    }

    public void opisnaOcena(Ucenik u){
        if (u.prosek() >= 4.5)
            System.out.println("Odlican");
        else if (u.prosek() >= 3.5)
            System.out.println("Vrlo dobar");
        else if (u.prosek() >= 2.5)
            System.out.println("Dobar");
        else if (u.prosek() >= 2.0)
            System.out.println("Dovoljan");
        else
            System.out.println("Nedovoljan");
    }

    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for (Ucenik u : dnevnik){
            sb.append(u.getIme()).append(" ").append(u.getPrezime()).append(" ima ocene:\n");
            for (int i = 0; i < u.getOcene().size(); i++){
                sb.append(u.getOcene().get(i)).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String velicinaOdeljenja(){
        if (dnevnik.size() >= 25)
            return "Veliko odeljenje";
        if (dnevnik.size() >= 15)
            return "Strednje odeljenje";
        else
            return "Malo odeljenje";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenje ima djake:\n");
        for (Ucenik u : dnevnik)
            sb.append(u.getIme()).append(" ").append(u.getPrezime()).append("\n");
        return sb.toString();
    }
}
