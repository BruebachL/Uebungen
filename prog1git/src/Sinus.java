import java.util.Scanner;

public class Sinus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sinus der Zahl: ");
        double x = scanner.nextDouble();
        System.out.println(sinus(x));
        scanner.close();
    }
    public static double sinus(double x) {

        double summe = x;
        double summand = 1;
        double zaehler = x;
        double nenner = 1.0;

        for (int i = 3; summand > 1E-10 || summand < -1E-10; i = i + 2)
        {
            zaehler = (zaehler * (-1) * x * x);
            nenner = (nenner * i * (i-1));
            summand = zaehler/nenner;
            summe += summand;
        }
        return summe;
    }
}
