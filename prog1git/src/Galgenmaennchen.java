import java.util.Scanner;

public class Galgenmaennchen {
    public static void main(String[] args){
        System.out.println(playGame());
    }
    private static String returnString(){
        String[] woerter = {"wörter", "schifffahrtskapitän", "deine", "mutter", "stinkt", "nach", "fisch", "spast", "dampfdecker", "tyrannosaurus", "dolphin", "ubuntu", "hangman", "programming", "kotlinisbetter", "thisdebug", "easteregg", "lukas", "ciri", "test20"};
        int auswahl = (int)(Math.random()*20+1);
        return woerter[auswahl-1];
    }
    private static String playGame(){
        int versuche = 0;
        Scanner scanner = new Scanner(System.in);
        String Antwort = returnString();
        int[] korrekteVersuche = new int[Antwort.length()];
        while(versuche<16){
            System.out.print("("+ versuche + "/15 Versuch) Bitte geben sie einen Char ein:");
            char versuch = scanner.nextLine().charAt(0);
            korrekteVersuche = checkAntwort(Antwort, korrekteVersuche, versuch);
            printWord(Antwort, korrekteVersuche);
            System.out.println();
            boolean korrekt = true;
            for(int i = 0; i<korrekteVersuche.length;i++){
                if(korrekteVersuche[i]==0){
                    korrekt = false;
                }
            }
            if(korrekt){
                return "\nDas Wort wurde erraten!";
            }
            versuche++;
        }

        return "Versuchslimit überschritten";
    }
    private static int[] checkAntwort(String antwort, int[] korrekteVersuche, char versuch){
        for(int i = 0; i<antwort.length();i++){
            if(korrekteVersuche[i]==0){
                if (antwort.charAt(i)==versuch||antwort.charAt(i)==versuch+32||antwort.charAt(i)==versuch-32){
                    korrekteVersuche[i]=1;
                }
            }
        }
        return korrekteVersuche;
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
