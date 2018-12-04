import java.util.Scanner;

public class GebrochenerAnteil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl:");
        double zahl = scanner.nextDouble();
        System.out.println(splitter(zahl));
    }
    private static Double splitter(double zahl){
        String[] splitter = Double.toString(zahl).split("\\.");
        int ganzeZahl = Integer.parseInt(splitter[0]);
        if(ganzeZahl>=0){
            return Double.parseDouble(String.join(".","0",splitter[1]));
        }else {
            return Double.parseDouble(String.join(".","-0",splitter[1]));
        }
    }
}
