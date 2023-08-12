package grupaIV.zadatak08;

public class Osoba {

    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
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

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
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
        sb.append("Godina rodjenja osobe je: ").append(godinaRodjenja).append("\n");
        sb.append("Visina osobe je: ").append(visina).append(" m");
        return sb.toString();
    }
}
