package grupaIV.zadatak02;

public class Pravougaonik {

    private double sirina;
    private  double visina;

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double obimPravougaonika(double sirina, double visina){
        return sirina + visina;
    }

    public double povrsinaPravougaonika(double sirina, double visina){
        return sirina * visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pravougaonik sirine ").append(sirina).append(" i visine ").append(visina).append(" ima:\n");
        sb.append("Obim: ").append(obimPravougaonika(sirina, visina)).append(",\n");
        sb.append("Povrsinu: ").append(povrsinaPravougaonika(sirina, visina));
        return sb.toString();
    }
}
