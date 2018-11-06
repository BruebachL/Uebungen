import java.util.Scanner;

public class pizzawert {
	public static void main(String[] args)
	{
		float pi = 3.1415f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie den ersten Preis an.");
		float pizzap1 = scanner.nextFloat();
		System.out.println("Bitte geben Sie den zweiten Preis an");
		float pizzap2 = scanner.nextFloat();
		System.out.println("Bitte geben Sie den ersten Durchmesser an");
		int pizzad1 = scanner.nextInt();
		System.out.println("Bitte geben Sie den zweiten Durchmesser an");
		int pizzad2 = scanner.nextInt();
		float pizzaf1 = pi * (float)pizzad1/2 * (float)pizzad1/2;
		float pizzaf2 = pi * (float)pizzad2/2 * (float)pizzad2/2;
		float pizzaw1 = pizzaf1/pizzap1;
		float pizzaw2 = pizzaf2/pizzap2;
		if (pizzaw1 > pizzaw2)
		System.out.println("Die erste Pizza ist kostenguenstiger");
		else
		System.out.println("Die zweite Pizza ist kostenguenstiger");
	}
}


