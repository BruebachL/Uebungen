import java.util.Scanner;
public class modulator {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int m = x%7;
		if (m != 0)
		System.out.println("Die Zahl ist nicht ganzteilig durch 7 teilbar.");
		else
		System.out.println("Die Zahl ist ganzteilig durch 7 teilbar");
	}
	}
