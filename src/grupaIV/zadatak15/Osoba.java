package grupaIV.zadatak15;

public class Osoba {

    private String ime;
    private String prezime;
    private int brojGodina;
    private double visina;

    public Osoba() {
        ime = prezime = "";
        brojGodina = 0;
        visina = 0;
    }

    public Osoba(String ime, String prezime, int brojGodina, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        this.visina = visina;
    }

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
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

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime osobe je: ").append(ime).append("\n");
        sb.append("Prezime osobe je: ").append(prezime).append("\n");
        sb.append("Ima godina: ").append(brojGodina).append("\n");
        sb.append("Visina osobe je: ").append(visina).append(" m");
        return sb.toString();
    }
}
