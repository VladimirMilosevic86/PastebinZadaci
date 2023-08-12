package grupaIV.zadatak04;

public class Automobil {

    private String marka;
    private String zemljaPorekla;
    private int godinaProizvodnje;
    private double kilometraza;

    public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public Automobil(String marka, String zemljaPorekla, String godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = Integer.parseInt(godinaProizvodnje);
        this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobil marke ").append(marka).append(" je proizveden u ").append(zemljaPorekla).append(" ").
                append(godinaProizvodnje).append(". godine, i presao je ").append(kilometraza).append(" km.");
        return sb.toString();
    }
}
