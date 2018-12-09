import java.util.Scanner;

public class Konkatenation {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Länge des ersten Char Feldes an: ");
    int ersteLänge = scanner.nextInt();
        System.out.print("Bitte geben Sie die Länge des zweiten Char Feldes an: ");
        int zweiteLänge = scanner.nextInt();
        printZiehung(konkatenieren(createTable(ersteLänge), createTable(zweiteLänge)));
    }
    private static char[] konkatenieren(char[] erstesFeld, char[] zweitesFeld){
        char[] zusammengefügt = new char[erstesFeld.length+zweitesFeld.length];
        for (int i = 0; i < erstesFeld.length; i++){
            zusammengefügt[i] = erstesFeld[i];
        }
        for (int i = erstesFeld.length; i < erstesFeld.length+zweitesFeld.length; i++){
            zusammengefügt[i] = zweitesFeld[i-erstesFeld.length];
        }
        return zusammengefügt;
    }
    private static char[] createTable(int tableSize){
        char[] table = new char[tableSize];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableSize; i++)
        {
            System.out.print((i + 1) + ". Wert: ");
            table[i] = scanner.next().charAt(0);
        }
        return table;
    }
    private static void printZiehung (char[] ziehung){
        for (int i = 0; i < ziehung.length; i++) {
            if (i==ziehung.length-1){
                System.out.println(ziehung[i] + ". ");
            }else {
                System.out.print(ziehung[i] + ", ");
            }
        }
    }
}
