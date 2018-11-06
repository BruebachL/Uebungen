import java.util.Scanner;

public class UhrzeitChecker {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben sie die Stunden an.");
		int Stunden = scanner.nextInt();
		System.out.println("Bitte geben sie die Minuten an.");
		int Minuten = scanner.nextInt();
		System.out.println("Bitte geben sie die Sekunden an.");
		int Sekunden = scanner.nextInt();
		if (Stunden >= 0 && Stunden < 24 && Minuten >= 0 && Minuten < 60 && Sekunden >= 0 && Sekunden < 60)
		System.out.println("Gueltige Uhrzeit");
		else
			System.out.println("Keine gueltie Uhrzeit");
		
	}
}
