public class wuerfel {
	public static void main(String[] args)
	{
		double x = Math.floor(Math.random()*6 + 1);
		if (x == 7)
		System.out.println("6");
		else
		System.out.println(x);
	}
}
