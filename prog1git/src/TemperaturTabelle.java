
public class TemperaturTabelle {
    public static void main(String[] args) {
        System.out.printf("%9s%11s\n", "Fahrenheit", "Celsius");
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {

            float celsius = ((5.0f / 9.0f) * ((float) fahrenheit - 32.0f));
            System.out.printf("%-9d%12.2f\n", fahrenheit, celsius);
        }
    }
}
