package prog1git.src;

import java.util.Scanner;

public class Sterne {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der zu druckenden Zeilen an:");
        Sterndruck(scanner.nextInt());
        scanner.close();
    }
    private static void Sterndruck(int zeilenAnzahl)
    {

        for(int zeile = 1; zeile <= zeilenAnzahl; zeile++)
        {
            for(int leerzeichen = zeile; leerzeichen<zeilenAnzahl; leerzeichen++)
            {
                System.out.print(" ");
            }
            for (int sterne=0; sterne<zeile;sterne++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
