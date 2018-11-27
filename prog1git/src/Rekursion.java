import java.util.Scanner;

public class Rekursion {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Basis an.");
        int basis = scanner.nextInt();
        System.out.println("Bitte geben Sie den Exponent an.");
        int exponent = scanner.nextInt();
        System.out.println("Das Ergebnis betraegt:");
        System.out.println(potenz(basis, exponent));
        scanner.close();
    }
    private static int potenz(int basis, int exponent)
    {
        if(exponent==0)
        {
            return 1;
        }
        else{
            return basis * potenz(basis, exponent-1);
        }

    }
}
