import java.util.Scanner;

public class QuerProdukt {
    public static void main(String[] args) {
        int produkt = 1;
        int eingabe = 0;
        Scanner scanner = new Scanner(System.in);
        boolean eingabeGueltig = false;
        while (!eingabeGueltig) {
            System.out.println("Bitte geben Sie eine Zahl ein.");
            eingabe = scanner.nextInt();
            if (eingabe > 0 && eingabe < 1000000) {
                eingabeGueltig = true;
            } else {
                System.out.println("\033[31mFehler: Zahl muss zwischen 0 und 1,000,000 liegen.\033[0m");
            }
        }
        int original = eingabe;
        while (eingabe != 0) {
            produkt = produkt * (eingabe % 10);
            eingabe = (eingabe - eingabe % 10) / 10;
        }
        System.out.println("Die Zahl " + original + " besitzt das Querprodukt " + produkt);
        scanner.close();
    }
}
