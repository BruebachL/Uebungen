import java.util.Arrays;
import java.util.Scanner;

public class StarsAndDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe der Zahl: ");
        int zahl = scanner.nextInt();
        System.out.print("Anzahl der Sterne: ");
        int sterne = scanner.nextInt();
        System.out.println(konvertierung(zahl, sterne));
    }
    private static String konvertierung(int zahl, int sterne){
        String zahlenString = Integer.toString(zahl);
        String s = new String();
        int[] ziffern = new int[zahlenString.length()];
        for(int i = 0; i<zahlenString.length(); i++){
            ziffern[i] = zahlenString.charAt(i);
        }
        char[] zahlenArray = new char[(zahlenString.length())*(sterne+1)];
        int ziffernPosition = 0;
        for(int cnt = zahlenArray.length-1; cnt >= 0; cnt--){
            if(cnt%(sterne+1)==0){
                zahlenArray[cnt] = (char)ziffern[ziffernPosition];
                ziffernPosition++;
            }else{
                zahlenArray[cnt] = '*';
            }
        }
        for(int i = 0; i<zahlenArray.length-sterne; i++){
            s = s+zahlenArray[i];
        }
        return s;
    }
}
