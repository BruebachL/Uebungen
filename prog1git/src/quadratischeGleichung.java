
public class quadratischeGleichung {
	 public static void main(String[] args)
	 {
		 int p = 12;
		 int q = 5;
		 double x1, x2;
		 x1 = (-(p/2)+Math.sqrt(Math.pow((p/2), 2)-q));
		 x2 = (-(p/2)-Math.sqrt(Math.pow((p/2), 2)-q));
		 System.out.println("Die Loesungen der quadratischen Gleichungen sind "+x1+" und "+x2);
	 }
}
