import java.util.Scanner;

public class Galgenmaennchen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Antwort = "test";
        int[] korrekteVersuche = {0,1,1,0};
        printWord(Antwort, korrekteVersuche);
    }
    private static void printWord(String Antwort, int[] korrekteVersuche){
        for(int i = 0; i<Antwort.length(); i++){
            if(korrekteVersuche[i]==1){
                System.out.print(Antwort.charAt(i));
            }else{
                System.out.print("-");
            }
        }
    }
}
