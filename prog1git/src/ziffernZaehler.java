import java.util.Scanner;

public class ziffernZaehler {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein");
        String satz = scanner.nextLine();
        System.out.println("Der Satz enthaelt " + zaehler(satz.toCharArray()) + "Ziffern.");
    }
    private static int zaehler(char[] satz){
        int zaehler = 0;
        for(int i = 0;i<satz.length;i++){
            if(satz[i]>='0'&&satz[i]<='9'){
                zaehler++;
            }
        }
        return zaehler;
    }
}
