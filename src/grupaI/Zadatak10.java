package grupaI;

import java.util.Scanner;

// 10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
public class Zadatak10 {
    public static void ispisiHoroskopskiZnak(int dan, String mesec){
        switch (mesec.trim().toLowerCase()) {
            case "januar" -> {
                if (dan <= 20)
                    System.out.println("Jarac");
                else
                    System.out.println("Vodolija");
            }
            case "februar" -> {
                if (dan <= 19)
                    System.out.println("Vodolija");
                else
                    System.out.println("Ribe");
            }
            case "mart" -> {
                if (dan <= 20)
                    System.out.println("Ribe");
                else
                    System.out.println("Ovan");
            }
            case "april" -> {
                if (dan <= 20)
                    System.out.println("Ovan");
                else
                    System.out.println("Bik");
            }
            case "maj" -> {
                if (dan <= 21)
                    System.out.println("Bik");
                else
                    System.out.println("Blizanci");
            }
            case "jun" -> {
                if (dan <= 21)
                    System.out.println("Blizanci");
                else
                    System.out.println("Rak");
            }
            case "jul" -> {
                if (dan <= 22)
                    System.out.println("Rak");
                else
                    System.out.println("Lav");
            }
            case "avgust" -> {
                if (dan <= 23)
                    System.out.println("Lav");
                else
                    System.out.println("Devica");
            }
            case "septembar" -> {
                if (dan <= 23)
                    System.out.println("Devica");
                else
                    System.out.println("Vaga");
            }
            case "oktobar" -> {
                if (dan <= 23)
                    System.out.println("Vaga");
                else
                    System.out.println("Skorpija");
            }
            case "novembar" -> {
                if (dan <= 22)
                    System.out.println("Skorpija");
                else
                    System.out.println("Strelac");
            }
            case "decembar" -> {
                if (dan <= 21)
                    System.out.println("Strelac");
                else
                    System.out.println("Jarac");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi dan rodjenja: ");
        int dan = sc.nextInt();
        sc.nextLine();
        System.out.print("Unesi mesec rodjenja (slovima): ");
        String mesec = sc.nextLine();

        ispisiHoroskopskiZnak(dan, mesec);
    }
}
