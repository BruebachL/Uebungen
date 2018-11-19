import java.util.Scanner;


public class PiRechteckNaeherung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der zu benutzenden Rechtecke an.");
        int rechtecke = scanner.nextInt();
        boolean eingabeGueltig = false;
        while(!eingabeGueltig){
            if(rechtecke>0){
                eingabeGueltig = true;
            }else{
                System.out.println("\033[31mFehler: Die Anzahl der Rechtecke kann weder 0, noch negativ sein.\033[0m");
                System.out.println("Bitte geben Sie die Anzahl der zu benutzenden Rechtecke an.");
                rechtecke = scanner.nextInt();
            }
        }
        double piApproxSumme = 1.0 / rechtecke;
        for (int cnt = 1; cnt < rechtecke; cnt++) {
            piApproxSumme = piApproxSumme + ((1.0 / (double) rechtecke) * Math.sqrt(1.0 - Math.pow((double) cnt / (double) rechtecke, 2)));
        }
        System.out.println("Pi ist schätzungsweise " + piApproxSumme * 4);
        scanner.close();
    }

}
