

//add check if palindrome is even or odd

public class P4Palindrome {
	public static void main(String[] args) {
		boolean istPalindrome = false;
		int produkt1 = 99;
		int produkt2 = 99;
		int zwischenspeicher = 0;
			while (produkt1 != 1 && produkt2 != 1)
			{
				System.out.println("a");
				while(produkt1 !=1)
				{
					produkt1=produkt1-1;
					System.out.println("b");
					while(produkt2 !=1)
					{
						produkt2=produkt2-1;
						System.out.println("c");
					char[] array = ("" + produkt1 * produkt2).toCharArray();
					int x = 0;
					int y = array.length - 1;
					char a = array[x];
					char b = array[y];
					if (array.length%2==0)
							{
						while (y-x>=1)
							{
								if(b==a)
									{
										istPalindrome = true;
										x++;
										y--;
										a = array[x];
										b = array[y];
										
									}
								else 
									{
										istPalindrome = false;
									}
								
							}
						if(produkt1*produkt2>zwischenspeicher && istPalindrome == true)
						{
							System.out.println("d");
							zwischenspeicher = produkt1*produkt2;
						}
							}
					if (array.length%2!=0)
					{
				while (y-x>=2)
					{
						if(b==a)
							{
								istPalindrome = true;
								x++;
								y--;
								a = array[x];
								b = array[y];
								
							}
						else 
							{
								istPalindrome = false;
							}
						
					}
				if(produkt1*produkt2>zwischenspeicher && istPalindrome == true)
				{
					System.out.println("d");
					zwischenspeicher = produkt1*produkt2;
				}
					}
						System.out.println("e");
					}
				}
			}
		System.out.println(zwischenspeicher);
	}
}
