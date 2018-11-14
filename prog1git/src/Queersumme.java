import java.util.Scanner;
public class Queersumme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl ein:");
		int UsrVlue = scanner.nextInt();
		while (UsrVlue < 0 || UsrVlue > 1000000)
		{
			System.out.println("Ungueltige Zahl. Bitte geben Sie eine neue Zahl zwischen 0 und 1 000 000 ein");
			int Usr = scanner.nextInt();
		}
		
	}

}
