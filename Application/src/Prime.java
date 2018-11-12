import java.util.Scanner;

public class Prime {
		public static void main(String args[])
		   {		
			boolean istPrim=true;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Geben Sie eine Zahl ein:");
			int zahl=scanner.nextInt();
		    scanner.close();
			for(int i=2;i<=zahl/2;i++)
			{
			   if(zahl%i==0)
			   {
			      istPrim=false;
			      break;
			   }
			}
			if(istPrim)
			   System.out.println(zahl + " ist eine Primzahl");
			else
			   System.out.println(zahl + " ist keine Primzahl");
		   }
		}