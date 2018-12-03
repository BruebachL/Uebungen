import java.util.Scanner;

public class GebrochenerAnteil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl:");
        double zahl = scanner.nextDouble();
        System.out.println(splitter(zahl));
    }
    private static String splitter(double zahl){
        String[] splitter = Double.toString(zahl).split("\\.");
        int ganzeZahl = Integer.parseInt(splitter[0]);
        int nachkommastelle = Integer.parseInt(splitter[1]);
        String nachkommastellen = Integer.toString(nachkommastelle);
        if(ganzeZahl>=0){
            return String.join(".","0",nachkommastellen);
        }else {
            return String.join(".","-0",nachkommastellen);
        }
    }
}
