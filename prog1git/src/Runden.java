import java.util.Scanner;

public class Runden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die zu rundende Zahl an.");
        double zahl = scanner.nextDouble();
        System.out.println("Bitte geben Sie die Anzahl der Nachkommastellen an.");
        int nachkommastellen = scanner.nextInt();
        System.out.println("Die gerundete Zahl betraegt: \n" + runden(zahl, nachkommastellen));
        scanner.close();
    }
    private static double runden(double zahl, int nachkommastellen) {
        String[] splitter = Double.toString(zahl).split("\\.");
        if (nachkommastellen == 0) {
            if(zahl>0) {
                splitter[1] = rundung(splitter[1], 1, splitter[0]);
                int ersteNachkommaziffer = Integer.parseInt(splitter[1]);
                if (ersteNachkommaziffer <= 4) {
                    return Integer.parseInt(splitter[0]);
                } else {
                    return Integer.parseInt(splitter[0]) + 1;
                }
            }else{
                splitter[1] = rundung(splitter[1], 1, splitter[0]);
                int ersteNachkommaziffer = Integer.parseInt(splitter[1]);
                if (ersteNachkommaziffer <= 5) {
                    return Integer.parseInt(splitter[0]);
                } else {
                    return Integer.parseInt(splitter[0]) - 1;
                }
            }
        } else {
            splitter[1] = rundung(splitter[1], nachkommastellen, splitter[0]);
            String zusammengesetzt = String.join(".", splitter[0], splitter[1]);
            return Double.parseDouble(zusammengesetzt);
        }
    }
    private static String rundung(String splitter, int nachkommastellen, String splitter0){
        while (splitter.length() > nachkommastellen) {
            double nachkommaziffern = Double.parseDouble(splitter);
            int ersteZiffer = Integer.parseInt(splitter0);
            if (ersteZiffer>0) {
                if (nachkommaziffern % 10 <= 4) {
                    nachkommaziffern = (nachkommaziffern - nachkommaziffern % 10) / 10;
                } else {
                    nachkommaziffern = ((nachkommaziffern - nachkommaziffern % 10) / 10) + 1;
                }
            }else{
                if (nachkommaziffern % 10 <= 5) {
                    nachkommaziffern = (nachkommaziffern - nachkommaziffern % 10) / 10;
                } else {
                    nachkommaziffern = ((nachkommaziffern - nachkommaziffern % 10) / 10) + 1;
                }
            }
            splitter = Integer.toString((int) nachkommaziffern);
        }
        return splitter;
    }
}

