import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        System.out.print("Bitte geben Sie die Anzahl der zu ziehenden Zahlen an: ");
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        while(anzahl>49||anzahl<0){
            System.out.println("Ziehung kann nur von Mengen zwischen 0 und 50 erfolgen");
            anzahl = scanner.nextInt();
        }
        int[] ziehung = ziehung(anzahl);
        int[] tip = createTip(anzahl);
        System.out.println("Die heutige Ziehung ist:");
        printZiehung(sortZiehung(ziehung, anzahl));
        System.out.println("Ihre Lottozahlen waren:");
        printZiehung(sortZiehung(tip, anzahl));
        if (compareHits(ziehung, tip) == 0) {
            System.out.println("Sie haben leider keine richtigen Zahlen getippt.");
        } else {
            System.out.println("Sie haben " + compareHits(ziehung, tip) + " richtige getippt:");
            printZiehung(stashHits(ziehung, tip, compareHits(ziehung, tip)));
        }
        scanner.close();

    }

    private static int[] stashHits(int[] ziehung, int[] tip, int hits) {
        int[] correctGuesses = new int[hits];
        int guessPosition = 0;
        for (int i = 0; i < ziehung.length; i++) {
            for (int cnt = 0; cnt < tip.length; cnt++) {
                if (tip[i] == ziehung[cnt]) {
                    correctGuesses[guessPosition] = tip[i];
                    guessPosition++;
                }
            }
        }
        return correctGuesses;
    }

    private static int compareHits(int[] ziehung, int[] tip) {
        int hits = 0;
        for (int i = 0; i < ziehung.length; i++) {
            for (int cnt = 0; cnt < tip.length; cnt++) {
                if (tip[i] == ziehung[cnt]) {
                    hits++;
                }
            }
        }
        return hits;
    }

    private static int[] createTip(int ziehungsGröße) {
        int[] tip = new int[ziehungsGröße];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ziehungsGröße; i++) {
            System.out.print("Ihr " + (i + 1) + ". Tip: ");
            tip[i] = scanner.nextInt();
            boolean correctTip = false;
            while (!correctTip) {
                if (tip[i] > 0 && tip[i] < 50) {
                    correctTip = true;
                } else {
                    System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 49 an.");
                    tip[i] = scanner.nextInt();
                }
            }

        }
        scanner.close();
        return tip;

    }

    private static int[] sortZiehung(int[] ziehung, int anzahl) {
        int temp = 0;
        for (int cnt = 0; cnt <= anzahl - 1; cnt++) {
            for (int i = cnt; i <= anzahl - 1; i++) {
                if (ziehung[cnt] > ziehung[i]) {
                    temp = ziehung[cnt];
                    ziehung[cnt] = ziehung[i];
                    ziehung[i] = temp;
                }
            }
        }
        return ziehung;
    }

    private static void printZiehung(int[] ziehung) {
        for (int i = 0; i < ziehung.length; i++) {
            if (i == ziehung.length - 1) {
                System.out.println(ziehung[i] + ". ");
            } else {
                System.out.print(ziehung[i] + ", ");
            }
        }
    }

    private static int[] ziehung(int anzahl) {
        int[] ziehung = new int[anzahl];
        for (int i = 0; i <= anzahl - 1; i++) {

            ziehung[i] = (int) (Math.random() * 49 + 1);
            for (int cnt = 0; cnt < i; cnt++) {
                if (ziehung[cnt] == ziehung[i]) {
                    ziehung[i] = (int) (Math.random() * 49 + 1);
                    cnt = 0;
                }
            }
        }
        return ziehung;
    }
}
