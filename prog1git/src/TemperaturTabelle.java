
public class TemperaturTabelle {
public static void main(String[] args) {
	
	for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++)
	{
		
		float celsius = ((5.0f/9.0f)*((float) fahrenheit-32f));
		System.out.println(fahrenheit + "\t" + Math.floor(celsius * 100.00)/100.00);
	}
	}
}

//printf print format revidieren