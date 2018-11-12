import java.util.Scanner;
public class strecke {
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte geben Sie die Zeit in Sekunden an.");
	int sekunden = scanner.nextInt();
	int zaehler = 0;
	double strecke = 0;
	while (sekunden != zaehler)
	{
		zaehler++;
		strecke = strecke + (zaehler * zaehler * 9.80665 / 2);
		
		if (zaehler == 1 || (zaehler-1)%5 == 0)
		
		System.out.println("Züruckgelegte Strecke: " + (int) Math.floor(strecke) + " Meter in " + zaehler + " Sekunden");
		
	}	
}
}
