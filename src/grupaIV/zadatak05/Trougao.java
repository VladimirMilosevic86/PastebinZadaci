package grupaIV.zadatak05;

public class Trougao {

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }

    public void daLiJeTrougaoValidan(double stranicaA, double stranicaB, double stranicaC){

        if (stranicaA <= 0 || stranicaB <= 0 || stranicaC <= 0) {
            System.out.println("Trougao nije validan! Stranica trougla ne moze biti nepozitivan broj.");
            setStranicaA(-1);
            setStranicaB(-1);
            setStranicaC(-1);
        }
        else if ((stranicaA + stranicaB) < stranicaC || (stranicaB + stranicaC) < stranicaA || (stranicaC + stranicaA) < stranicaB) {
            System.out.println("Trougao nije validan! Zbir dve stranice ne sme biti manji od duzine trece stranice");
            setStranicaA(-1);
            setStranicaB(-1);
            setStranicaC(-1);
        }
        else
            System.out.println("Trougao je validan");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina stranice A je: ").append(stranicaA).append("\n");
        sb.append("Duzina stranice B je: ").append(stranicaB).append("\n");
        sb.append("Duzina stranice C je: ").append(stranicaC).append("\n");
        return sb.toString();
    }
}
