import java.util.Scanner;
public class strecke {
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte geben Sie die Zeit in Sekunden an.");
	double sekunden = scanner.nextDouble();
	double zaehler = 0;
	double strecke = 0;
	while (sekunden != zaehler)
	{
		strecke = strecke + (sekunden * sekunden * 9.80665 / 2);
		zaehler = zaehler + 1;
		if (zaehler%5 == 0)
		System.out.println("Zueruckgelegte Strecke:" + strecke + "Meter in " + zaehler + "Sekunden.");
	}	
}
}
