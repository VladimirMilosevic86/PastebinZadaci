package grupaIV.zadatak13;

import java.util.Objects;

public class Namirnica {

    private String ime;
    private double cena;

    private void postaviIme(String ime) {
        if (ime != null)
            this.ime = ime;
        else
            this.ime = "";
    }

    private void postaviCenu(double cena) {
        if (cena > 0)
            this.cena = cena;
        else
            this.cena = 0;
    }

    public Namirnica(String ime, double cena) {
        postaviIme(ime);
        postaviCenu(cena);
    }

    public Namirnica() {
        this.ime = "";
        this.cena = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if (ime != null)
            this.ime = ime;
        else {
            System.out.println("UPOZORENJE: ime je vraceno na prethodnu vrednost: " + this.ime);
        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena > 0)
            this.cena = cena;
        else
            System.out.println("Cena je vracena na prethodnu vrednost: " + this.cena);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (!(o instanceof Namirnica namirnica)) return false;
        return Double.compare(namirnica.cena, cena) == 0 && Objects.equals(ime, namirnica.ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, cena);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" | ").append(cena);
        return sb.toString();
    }
}
