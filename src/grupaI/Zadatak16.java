package grupaI;

//16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
public class Zadatak16 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i * j < 10)
                    System.out.print(i * j + "  ");
                else
                    System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
