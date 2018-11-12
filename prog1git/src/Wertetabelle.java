import java.util.Scanner;
public class Wertetabelle {
	public static void main(String[] args)
	{
Scanner scanner = new Scanner(System.in);
char checkTrue = 't';
char checkFalse = 'f';
char first = scanner.next(".").charAt(0);
char second = scanner.next(".").charAt(0);
if (first == checkFalse && second == checkFalse)
System.out.println("0");
else
	if (first == checkFalse && second == checkTrue)
	System.out.println("1");
	else
		if (first == checkTrue && second == checkFalse)
 System.out.println("2");
		else
			if (first == checkTrue && second == checkTrue)
System.out.println("3");
else
	System.out.println("Keine gueltige Kombination.");
	}
}
