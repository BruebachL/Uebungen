import java.util.Scanner;

public class Sinus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sinus von: ");
        double zahl = scanner.nextDouble();

    }
    private static double cos(double x){
        double zaehler = 1.0;
        double nenner = 1.0;
        double summe = 1.0;
        for (int i = 2; ){
            zaehler = zaehler * ((i * i) + 1) * (-1);
        }
    }
}
