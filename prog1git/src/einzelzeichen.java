import java.io.IOException;

public class einzelzeichen {
	public static void main(String[] args) throws IOException
	{
	int bin = 0;
	int hex = 0;
	int oktal = 0;
	int grossb = 0;
	char c = (char) System.in.read();
	System.out.println(c);
	if (c == 48 || c == 49)
	bin = 1;
	if (c >= 65 && c <= 70)
	hex = 1;
	if (c >= 97 && c <= 102)
	hex = 1;
	if (c >= 48 && c <= 57)
	hex = 1;
	if (c >= 48 && c <= 55)
	oktal = 1;
	if (c >= 65 && c <= 90)
	grossb = 1;
	if (bin == 1)
	 System.out.print("Der eingebene Char war Binaer");
	if (hex == 1)
		 System.out.print("Der eingebene Char war ein Hex");
	if (oktal == 1)
		 System.out.print("Der eingebene Char war oktal");
	if (grossb == 1)
		 System.out.print("Der eingebene Char war oktal");
	}
	}
	