package grupaIV.zadatak06;

public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.brojStrana = brojStrana;
        if (brojStrana <= 0)
            System.out.println("Greska! Knjiga ne moze imati negativan broj strana.");
        this.godinaIzdanja = godinaIzdanja;
        if (godinaIzdanja <= 0)
            System.out.println("Greska! Knjiga ne moze imati negativnu godinu izdanja.");
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        if (brojStrana <= 0)
            System.out.println("Greska! Knjiga ne moze imati negativan broj strana.");
        this.godinaIzdanja = godinaIzdanja;
        if (godinaIzdanja <= 0)
            System.out.println("Greska! Knjiga ne moze imati negativnu godinu izdanja.");
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana > 0)
            this.brojStrana = brojStrana;
        else
            System.out.println("Upozorenje! Broj strana se ne moze podesiti na negativan broj!");
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja > 0)
            this.godinaIzdanja = godinaIzdanja;
        else
            System.out.println("Upozorenje! Godina izdanja ne moze biti negativan broj!");
    }

    public String velicinaKnjige( int brojStrana){
        if (brojStrana <= 100) return "mala knjiga";
        if (brojStrana <= 300) return "srednje velika knjiga";
        if (brojStrana <= 600) return "velika knjiga";
        else
            return "bas velika knjiga";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ").append(nazivKnjige).append("\n");
        sb.append("Autor knjige je: ");
        if (autor == null)
            sb.append("Nepoznato").append("\n");
        else
            sb.append(autor.getIme()).append(" ").append(autor.getPrezime()).append("\n");
        sb.append("Vlasnik knjige je: ");
        if (vlasnik == null)
            sb.append("Nepoznato").append("\n");
        else
            sb.append(vlasnik.getIme()).append(" ").append(vlasnik.getPrezime()).append("\n");
        sb.append("Broj strana: ").append(brojStrana).append(" (ovo je ").append(velicinaKnjige(brojStrana)).append(")").append("\n");
        sb.append("Godina izdanja: ").append(godinaIzdanja);
        return sb.toString();
    }
}
