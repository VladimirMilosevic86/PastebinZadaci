package grupaIV.zadatak08;

public class Automobil {

    private String marka;
    private String model;
    private int serijskiBroj;
    String vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil() {
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }
}
