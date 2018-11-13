
public class Kreisberechnung {
	 public static void main(String[] args)
	 {
		 int r = 10;
		 float pi = 3.1415f;
		 float kreisflaeche = pi * r * r;
		 float kreisumfang = 2 * pi * r;
		 double kugelvolumen = 4.0 / 3.0 * pi * r * r * r;
		 System.out.println("Die Kreisflaeche betraegt " + kreisflaeche);
		 System.out.println("Der Kreisumfang betragt " + kreisumfang);
		 System.out.println("Das Volumen der Kugel betraegt " + kugelvolumen);
		 
	 }
}
