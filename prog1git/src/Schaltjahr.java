import java.util.Scanner;
public class Schaltjahr {
	public static void main(String[] args)
	{
Scanner scanner = new Scanner(System.in);
System.out.println("Bitte geben sie eine Jahreszahl ein.");
int jahr = scanner.nextInt();
if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0)
System.out.println("Dieses Jahr ist ein Schaltjahr.");
else
	System.out.println("Dieses Jahr ist kein Schaltjahr");
scanner.close();
}
}