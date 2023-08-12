package grupaIV.zadatak03;

public class Krug {

    private double poluprecnik;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double obimKruga(double poluprecnik){
        double obim = 2 * poluprecnik * Math.PI;
        return (double) Math.round(obim * 100) / 100;
    }

    public double povrsinaKruga(double poluprecnik){
        double povrsina = 2 * Math.pow(poluprecnik, 2) * Math.PI;
        return (double) Math.round(povrsina * 100) / 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Krug ").append(" ima:\n");
        sb.append("Obim: ").append(obimKruga(poluprecnik)).append(",\n");
        sb.append("Povrsinu: ").append(povrsinaKruga(poluprecnik));
        return sb.toString();
    }
}
