import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Basis ein:");
        double a = scanner.nextDouble();
        System.out.println("Bitte geben Sie den Exponenten ein:");
        int b = scanner.nextInt();
        int c = 0;
        if (b < 0) {
            c = b * -1;
        } else {
            c = b;
        }
        double aPotenziert = 1.0;
        for (int i = 0; i < c; i++) {
            aPotenziert = aPotenziert * a;
        }
        if (b == 0) {
            System.out.println("Basis " + a + " potenziert mit Exponent " + b + " entspricht 1");
        } else {
            if (b < 0) {
                System.out.println("Basis " + a + " potenziert mit Exponent " + b + " entspricht " + (1.0 / aPotenziert));
            } else {
                System.out.println("Basis " + a + " potenziert mit Exponent " + b + " entspricht " + aPotenziert);
            }
        }
        scanner.close();
    }
}
