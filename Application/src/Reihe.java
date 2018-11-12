
public class Reihe {
public static void main(String[] args)
	{
		float k = 1;
		float ergebnis = 1;
		float zwischenspeicher = 2;
		while (zwischenspeicher-ergebnis>0.00001 || ergebnis == zwischenspeicher)
			{
				zwischenspeicher = ergebnis;
				ergebnis = 1/(k*k);
				k++;
				System.out.println(6*ergebnis);
			}	
	}
}
