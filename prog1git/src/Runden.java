package prog1git.src;

import java.util.Scanner;

public class Runden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die zu rundende Zahl an.");
        double zahl = scanner.nextDouble();
        System.out.println("Bitte geben Sie die Anzahl der Nachkommastellen an.");
        int nachkommastellen = scanner.nextInt();
        System.out.println("Die gerundete Zahl betraegt: \n" + runden(zahl, nachkommastellen));
    }
    private static double runden(double zahl, int nachkommastellen) {
        if (nachkommastellen == 0) {
            if(zahl>0) {
                String[] splitter = Double.toString(zahl).split("\\.");
                while (splitter[1].length() != 1) {
                    double nachkommaziffern = Double.parseDouble(splitter[1]);
                    if (nachkommaziffern % 10 <= 4) {
                        nachkommaziffern = (nachkommaziffern - nachkommaziffern % 10) / 10;
                    } else {
                        nachkommaziffern = ((nachkommaziffern - nachkommaziffern % 10) / 10) + 1;
                    }
                    splitter[1] = Integer.toString((int) nachkommaziffern);
                }
                int ersteNachkommaziffer = Integer.parseInt(splitter[1]);
                if (ersteNachkommaziffer <= 4) {
                    return Integer.parseInt(splitter[0]);
                } else {
                    return Integer.parseInt(splitter[0]) + 1;
                }
            }else{
                String[] splitter = Double.toString(zahl).split("\\.");
                while (splitter[1].length() != 1) {
                    double nachkommaziffern = Double.parseDouble(splitter[1]);
                    if (nachkommaziffern % 10 <= 4) {
                        nachkommaziffern = (nachkommaziffern - nachkommaziffern % 10) / 10;
                    } else {
                        nachkommaziffern = ((nachkommaziffern - nachkommaziffern % 10) / 10) + 1;
                    }
                    splitter[1] = Integer.toString((int) nachkommaziffern);
                }
                int ersteNachkommaziffer = Integer.parseInt(splitter[1]);
                if (ersteNachkommaziffer <= 4) {
                    return Integer.parseInt(splitter[0]);
                } else {
                    return Integer.parseInt(splitter[0]) - 1;
                }
            }
        } else {
            String[] splitter = Double.toString(zahl).split("\\.");
            for (splitter[1].length(); splitter[1].length() > nachkommastellen; ) {
                double nachkommaziffern = Double.parseDouble(splitter[1]);
                if (nachkommaziffern % 10 <= 4) {
                    nachkommaziffern = (nachkommaziffern - nachkommaziffern % 10) / 10;
                } else {
                    nachkommaziffern = ((nachkommaziffern - nachkommaziffern % 10) / 10) + 1;
                }
                splitter[1] = Integer.toString((int) nachkommaziffern);
            }
            String zusammengesetzt = String.join(".", splitter[0], splitter[1]);
            return Double.parseDouble(zusammengesetzt);
        }
    }
}

