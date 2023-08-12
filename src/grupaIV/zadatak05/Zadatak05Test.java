package grupaIV.zadatak05;

public class Zadatak05Test {

    public static void main(String[] args) {

        Trougao t1 = new Trougao(-5, 6 , 7);
        t1.daLiJeTrougaoValidan(-5, 6, 7);
        System.out.println(t1);

        System.out.println("----------------------------------------------");

        Trougao t2 = new Trougao(3, 4, 5);
        t2.daLiJeTrougaoValidan(3, 4, 5);
        System.out.println(t2);

    }

}
