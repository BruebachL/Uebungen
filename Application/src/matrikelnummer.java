import java.util.Scanner;

public class matrikelnummer {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	int MtrklNmr = scanner.nextInt();
	if (MtrklNmr <= 5000000 || MtrklNmr >= 6200000 || MtrklNmr <= 6100000 && MtrklNmr >= 5200000)
		System.out.println("Keine Gueltige MatrikelNummer");
	else
		System.out.println("Gueltig");
	
	System.out.println(MtrklNmr);
}
}
