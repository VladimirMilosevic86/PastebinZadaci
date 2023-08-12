package grupaIV.zadatak11;

import java.util.Objects;

public class Pravougaonik {

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obim(){
        if (a == b)
            return 4 * a;
        else
            return 2 * a + 2 * b;
    }

    public double povrsina(){
        if (a == b)
            return Math.pow(a, 2);
        else
            return 2 * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() != o.hashCode()) return false;
        if (this == o) return true;
        if (!(o instanceof Pravougaonik that)) return false;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pravougaonik stranica ").append(a).append(" i ").append(b).append(" ima:\n");
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsinu: ").append(povrsina());
        return sb.toString();
    }
}
