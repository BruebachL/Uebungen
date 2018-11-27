import java.util.Scanner;

public class Rundungen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die zu rundende Zahl an.");
        double zahl = scanner.nextDouble();
        System.out.print("Bitte geben Sie die Anzahl der Nachkommastellen an.");
        int nachkommastellen = scanner.nextInt();
        System.out.print("Die gerundete Zahl betraegt: \n" + runden(zahl, nachkommastellen));
        scanner.close();
    }
    private static double runden(double zahl, int nachkommastellen){
        int verschiebung = 1;
        while(nachkommastellen>0) {
            verschiebung *= 10;
            nachkommastellen--;
        }
         double verschoben = (zahl * verschiebung);
         if ((verschoben%1)>= 0.5){
             verschoben++;
         }
        verschoben = (int) verschoben;
         verschoben /= verschiebung;
         return verschoben;
    }
}
