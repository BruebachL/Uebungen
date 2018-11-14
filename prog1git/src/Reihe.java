
public class Reihe {
public static void main(String[] args)
	{
		float k = 1;
		float ergebnis = 1;
		float zwischenspeicher = 1;
		float summe = 0;
		while (zwischenspeicher-ergebnis>0.00001 || ergebnis == zwischenspeicher)
			{
				zwischenspeicher = ergebnis;
				ergebnis = 1/(k*k);
				summe = summe+ergebnis;
				k++;
				System.out.println(6*summe);
			}	
	}
}
