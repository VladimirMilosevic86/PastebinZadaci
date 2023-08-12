package grupaIV.zadatak13;

import java.util.ArrayList;

public class Kupac extends Osoba{

    private Korpa korpa;
    private ArrayList<Namirnica> kupljeneNamirnice;
    private double novac;

    public Kupac(double novac) {
        this.novac = novac;
        this.korpa = new Korpa();
        this.kupljeneNamirnice = new ArrayList<>();
    }

    public Kupac(String ime, String prezime, int godinaRodjenja, double novac) {
        super(ime, prezime, godinaRodjenja);
        this.novac = novac;
        this.korpa = new Korpa();
        this.kupljeneNamirnice = new ArrayList<>();
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;

    }

    public ArrayList<Namirnica> getKupljeneNamirnice() {
        return kupljeneNamirnice;
    }

    public void setKupljeneNamirnice(ArrayList<Namirnica> kupljeneNamirnice) {
        this.kupljeneNamirnice = kupljeneNamirnice;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
    public void dodajUKorpu(Namirnica n){
        korpa.dodajUKorpu(n);
    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe
    // odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k){
        korpa.dodajUKorpu(n, k);
    }

    /*3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
                                artikla u korpi, uraditi nista.*/
    public void ukloniIzKorpe(Namirnica n){
        korpa.ukloniIzKorpe(n);
    }

    /*4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
                                       takve namirnice, obrisati sve takve namirnice.*/
    public void ukloniIzKorpe(Namirnica n, int k){
        korpa.ukloniIzKorpe(n, k);
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        korpa.ukloniIzKorpeSveNamirniceN(n);
    }

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        korpa.isprazniKorpu();
    }

    //7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKorpe() {
        return korpa.cenaKorpe();
    }

    /*8. kupi - koja kupuje sve namirnice iz korpe. Tj. prvo proverava da li kupac ima dovoljno novca.
    Ukoliko nema ispisati poruku "Nemate dovoljno novca".
    Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i dodati te namirnice u ArrayListu kupljenih namirnica i
    oduzeti od novca cenu korpe.*/
    public void kupi(){
        if(cenaKorpe() > novac)
            System.out.println("Nemate dovoljno novca.");
        else {
            for (int i = korpa.getNamirniceKorpa().size() - 1; i >= 0; i--){
                kupljeneNamirnice.add(korpa.getNamirniceKorpa().get(i));
                novac -= korpa.getNamirniceKorpa().get(i).getCena();
                korpa.getNamirniceKorpa().remove(i);
            }
        }
    }


    //MRZI ME DA PONAVLJAM ISPIS - OVO NE VALJA
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kupac ").append(getIme()).append(" ").append(getPrezime()).append(" ima u korpi:\n");
        sb.append(kupljeneNamirnice);
        return sb.toString();
    }
}
