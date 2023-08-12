package grupaIV.zadatak11;

public class Kvadrat extends Pravougaonik{
    public Kvadrat() {
        super();
    }

    public Kvadrat(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kvadrat stranice ").append(getA()).append(" ima:\n");
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsinu: ").append(povrsina());
        return sb.toString();
    }
}
