package grupaIV.zadatak08;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if (udaljenostUKm <= 0)
            System.out.println("GRESKA: Udaljenost ne sme biti negativna ili 0 km.");
        else
            this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if (udaljenostUKm <= 0)
            System.out.println("GRESKA: Udaljenost ne sme biti negativna ili 0 km.");
        else
            this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if (udaljenostUKm > 0)
            this.udaljenostUKm = udaljenostUKm;
        else
            System.out.println("UPOZORENJE: Udaljenost se ne moze promeniti u negativan broj ili 0!");
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    public double vremePutovanja(double brzinaPutovanja){
        double vremePutovanja = udaljenostUKm / brzinaPutovanja;
        return (double) Math.round(100 * vremePutovanja) / 100;
    }

    public void prijava(Osoba novoprijavljeni){
        prijavljeneOsobe.add(novoprijavljeni);
    }

    public void odjava(Osoba odjavljeni){
        prijavljeneOsobe.remove(odjavljeni);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(destinacija.getIme()).append(", ").append(destinacija.getDrzava()).append("\n");
        if (vodjaPuta == null)
            sb.append("Vodja puta je: ").append("N/A\n");
        else
            sb.append("Vodja puta je: ").append(vodjaPuta.getIme()).append(" ").append(vodjaPuta.getPrezime()).append("\n");
        sb.append("Putuje se automobilom: ").append(vozilo.getMarka()).append(", ").append(vozilo.getModel()).append(", ").append(vozilo.getSerijskiBroj()).append("\n");
        sb.append("Udaljenost do destinacije je: ").append(udaljenostUKm).append(" km\n");
        sb.append("Prijavljene osobe:\n");
        for (Osoba o : prijavljeneOsobe)
            sb.append(o.getIme()).append(" ").append(o.getPrezime()).append("\n");
        return sb.toString();
    }
}
