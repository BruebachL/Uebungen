package prog1git.src;

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl an.");
        int zahl = scanner.nextInt();
        System.out.println(zahl + " Fakultaet betraegt: \n" + fakultaet(zahl));
        scanner.close();
    }

    private static int fakultaet(int zahl) {
        int produkt = 1;
        for (int cnt = 1; cnt<=zahl; cnt++) {
            produkt *= cnt;
        }
        return produkt;
    }
}

