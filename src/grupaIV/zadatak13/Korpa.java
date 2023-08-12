package grupaIV.zadatak13;

import java.util.ArrayList;
import java.util.Collections;

public class Korpa {

    private ArrayList<Namirnica> namirniceKorpa;
    private double cenaKorpe;

    public Korpa(ArrayList<Namirnica> namirniceKorpa, double cenaKorpe) {
        this.namirniceKorpa = new ArrayList<>();
        this.namirniceKorpa.addAll(namirniceKorpa);
        this.cenaKorpe = cenaKorpe;
    }

    public Korpa(double cenaKorpe, Namirnica ... namirniceKorpa) {
        this.cenaKorpe = cenaKorpe;
        this.namirniceKorpa = new ArrayList<>();
        Collections.addAll(this.namirniceKorpa, namirniceKorpa);
    }

    public Korpa() {
        this.namirniceKorpa = new ArrayList<>();
        this.cenaKorpe = 0;
    }

    public ArrayList<Namirnica> getNamirniceKorpa() {
        return namirniceKorpa;
    }

    public void setNamirniceKorpa(ArrayList<Namirnica> namirniceKorpa) {
        this.namirniceKorpa = namirniceKorpa;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
    public void dodajUKorpu(Namirnica n){
        namirniceKorpa.add(n);
        cenaKorpe += n.getCena();
    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k){
        int brojac = 0;
        while (brojac < k){
            namirniceKorpa.add(n);
            cenaKorpe += n.getCena();
            brojac++;
        }
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    public void ukloniIzKorpe(Namirnica n){
        /*for (int i = 0; i < naminiceKorpa.size(); i++) {
            if (naminiceKorpa.get(i) == n){
                naminiceKorpa.remove(n);
                cenaKorpe -= n.getCena();
                break;
            }
        }*/
        namirniceKorpa.remove(n);
        cenaKorpe -= n.getCena();
    }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    public void ukloniIzKorpe(Namirnica n, int k){
        for (int i = 0; i < k; i++) {
            for (int j = namirniceKorpa.size() - 1; j >= 0; j--) {
                if (namirniceKorpa.get(j) == n){
                    namirniceKorpa.remove(n);
                    cenaKorpe -= n.getCena();
                }
            }
        }
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        for (int i = namirniceKorpa.size() - 1; i >= 0; i--) {
            if (namirniceKorpa.get(i) == n){
                namirniceKorpa.remove(n);
                cenaKorpe -= n.getCena();
            }
        }
    }

    /*public void ukloniIzKorpe2(Namirnica n, int k) {
        int brojUklonjenih = 0;
        for (int i = namirniceKorpa.size() - 1; i >= 0; i--) {
            if (n.equals(namirniceKorpa.get(i))) {
                namirniceKorpa.remove(i);
                cenaKorpe -= n.getCena();
                brojUklonjenih++;

            }
            if (brojUklonjenih == k)
                break;
        }
    }*/

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        namirniceKorpa.clear();
        setCenaKorpe(0);
    }

    //7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKorpe() {
        double ukupnaCena = 0;
        for (Namirnica n : namirniceKorpa) {
            ukupnaCena += n.getCena();
        }
        return ukupnaCena;
    }

    //ISPIS NIJE SKROZ DOBAR
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < namirniceKorpa.size(); i++){
            int brojKopija = 0;
            double cenaSvihNamirnica = 0;
            for (int j = 0; j < namirniceKorpa.size(); j++) {
                if (namirniceKorpa.get(i).equals(namirniceKorpa.get(j))){
                    cenaSvihNamirnica += namirniceKorpa.get(j).getCena();
                    brojKopija++;
                    //namirniceKorpa.get(j).setIme("");
                }
            }
            sb.append(namirniceKorpa.get(i).getIme()).append(" | ").append(brojKopija).append(" | ").append(cenaSvihNamirnica).append("\n");
        }
        return sb.toString();
    }
}
