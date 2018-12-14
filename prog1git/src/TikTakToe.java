import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        int[][] playfield = createPlayfield(3);
        char[] settings = {'0', 'X', 'W', 'R', 'G'};
        printPlayfield(playfield, settings);
        boolean noWinner = true;
        int playerToken = 1;
        while (noWinner) {
            playfield = playerTurn(playfield, playerToken, settings);
            for (int cnt = 0; cnt < 51; cnt++) {
                System.out.println();
            }
            printPlayfield(playfield, settings);
            playerToken++;
            if (playerToken == 3) {
                playerToken = 1;
            }
            System.out.println(checkWinner(playfield));
            if (checkWin(playfield)) {
                noWinner = false;
            }
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static char[] setSettings(char[] settings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose setting to adjust:");
        System.out.println("1. Player One Token");
        System.out.println("2. Player Two Token");
        System.out.println("3. Playfield Color");
        System.out.println("4. Player One Token Color");
        System.out.println("5. Player Two Token Color");
        int auswahl = scanner.nextInt();
        switch (auswahl) {
            case 1:
                System.out.println("Please choose a new token for Player One.");
                boolean validInputOne = false;
                while(!validInputOne) {
                    scanner.nextLine();
                    if(scanner.nextLine().charAt(0)!=settings[1]) {
                        settings[0] = scanner.nextLine().charAt(0);
                        validInputOne=true;
                    }
                }
                break;
            case 2:
                System.out.println("Please choose a new token for Player Two.");
                boolean validInput = false;
                while(!validInput) {
                    scanner.nextLine();
                    if(scanner.nextLine().charAt(0)!=settings[0]) {
                        settings[1] = scanner.nextLine().charAt(0);
                        validInput=true;
                    }
                }
                break;
            case 3:
                System.out.println("Please choose a new color for the playfield:");
                System.out.println("1. White");
                System.out.println("2. Cyan");
                System.out.println("3. Magenta");
                System.out.println("4. Blue");
                System.out.println("5. Yellow");
                System.out.println("6. Green");
                System.out.println("7. Red");
                boolean korrekteAuswahl = false;
                while (!korrekteAuswahl) {
                    int farbenwahl = scanner.nextInt();
                    switch (farbenwahl) {
                        case 1:
                            if (settings[3] != 'W' && settings[4] != 'W') {
                                settings[2] = 'W';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 2:
                            if (settings[3] != 'C' && settings[4] != 'C') {
                                settings[2] = 'C';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 3:
                            if (settings[3] != 'M' && settings[4] != 'M') {
                                settings[2] = 'M';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 4:
                            if (settings[3] != 'B' && settings[4] != 'B') {
                                settings[2] = 'B';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 5:
                            if (settings[3] != 'Y' && settings[4] != 'Y') {
                                settings[2] = 'Y';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 6:
                            if (settings[3] != 'G' && settings[4] != 'G') {
                                settings[2] = 'G';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 7:
                            if (settings[3] != 'R' && settings[4] != 'R') {
                                settings[2] = 'R';
                                korrekteAuswahl = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                    }
                }
                break;
            case 4:
                System.out.println("Please choose a new color for the Player One token:");
                System.out.println("1. White");
                System.out.println("2. Cyan");
                System.out.println("3. Magenta");
                System.out.println("4. Blue");
                System.out.println("5. Yellow");
                System.out.println("6. Green");
                System.out.println("7. Red");
                boolean korrekteAuswahl1 = false;
                while (!korrekteAuswahl1) {
                    int farbenwahl = scanner.nextInt();
                    switch (farbenwahl) {
                        case 1:
                            if (settings[2] != 'W' && settings[4] != 'W') {
                                settings[3] = 'W';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 2:
                            if (settings[2] != 'C' && settings[4] != 'C') {
                                settings[3] = 'C';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 3:
                            if (settings[2] != 'M' && settings[4] != 'M') {
                                settings[3] = 'M';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 4:
                            if (settings[2] != 'B' && settings[4] != 'B') {
                                settings[3] = 'B';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 5:
                            if (settings[2] != 'Y' && settings[4] != 'Y') {
                                settings[3] = 'Y';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 6:
                            if (settings[2] != 'G' && settings[4] != 'G') {
                                settings[3] = 'G';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 7:
                            if (settings[2] != 'R' && settings[4] != 'R') {
                                settings[3] = 'R';
                                korrekteAuswahl1 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                    }
                }
                break;
            case 5:
                System.out.println("Please choose a new color for the Player Two token:");
                System.out.println("1. White");
                System.out.println("2. Cyan");
                System.out.println("3. Magenta");
                System.out.println("4. Blue");
                System.out.println("5. Yellow");
                System.out.println("6. Green");
                System.out.println("7. Red");
                boolean korrekteAuswahl2 = false;
                while (!korrekteAuswahl2) {
                    int farbenwahl = scanner.nextInt();
                    switch (farbenwahl) {
                        case 1:
                            if (settings[2] != 'W' && settings[3] != 'W') {
                                settings[4] = 'W';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 2:
                            if (settings[2] != 'C' && settings[3] != 'C') {
                                settings[4] = 'C';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 3:
                            if (settings[2] != 'M' && settings[3] != 'M') {
                                settings[4] = 'M';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 4:
                            if (settings[2] != 'B' && settings[3] != 'B') {
                                settings[4] = 'B';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 5:
                            if (settings[2] != 'Y' && settings[3] != 'Y') {
                                settings[4] = 'Y';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 6:
                            if (settings[2] != 'G' && settings[3] != 'G') {
                                settings[4] = 'G';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                        case 7:
                            if (settings[2] != 'R' && settings[3] != 'R') {
                                settings[4] = 'R';
                                korrekteAuswahl2 = true;
                                break;
                            } else {
                                System.out.println("Invalid selection!");
                                break;
                            }
                    }
                }
                break;
        }
        return settings;
    }

    private static String checkWinner(int[][] playfield) {
        for (int row = 0; row < playfield.length; row++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[row][i];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return "Player 1 won with a horizontal victory!";
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return "Player 2 won with a horizontal victory!";
                    }
                }
            }
        }
        for (int row = 0; row < playfield.length; row++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[i][row];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return "Player 1 won with a vertical victory!";
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return "Player 2 won with a vertical victory!";
                    }
                }
            }
        }
        for (int check = 0; check < playfield.length; check++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[i][i];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return "Player 1 won with a diagonal victory!";
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return "Player 2 won with a diagonal victory!";
                    }
                }
            }
        }

        for (int check = 0; check < playfield.length; check++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[i][checkSize.length - 1 - i];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return "Player 1 won with a diagonal victory!";
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return "Player 2 won with a diagonal victory!";
                    }
                }
            }
        }

        return "No player has won yet.";
    }

    private static boolean checkWin(int[][] playfield) {
        for (int row = 0; row < playfield.length; row++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[row][i];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return true;
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return true;
                    }
                }
            }
        }
        for (int row = 0; row < playfield.length; row++) {
            int[] checkSize = new int[playfield.length];
            for (int i = 0; i < checkSize.length; i++) {
                checkSize[i] = playfield[i][row];
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 2)) {
                    if (contains(checkSize, 1)) {
                        return true;
                    }
                }
            }
            if (!contains(checkSize, 0)) {
                if (!contains(checkSize, 1)) {
                    if (contains(checkSize, 2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    private static int[][] playerTurn(int[][] playfield, int playerToken, char[] settings) {
        Scanner scanner = new Scanner(System.in);
        String[] split = new String[6];
        String turn = new String();
        {
            boolean validInput = false;
            while (!validInput) {
                turn = scanner.nextLine();
                split = turn.split(" ");
                if (turn.charAt(0) == 's') {
                    setSettings(settings);
                } else {
                    if ((Integer.parseInt(split[0]) > 3 || Integer.parseInt(split[0]) < 1 || Integer.parseInt(split[1]) > 3 || Integer.parseInt(split[1]) < 1)) {
                        System.out.println("Invalid move.");
                    } else {
                        validInput = true;
                    }
                }
            }
            boolean turnTaken = false;
            while (!turnTaken) {
                split = turn.split(" ");
                if (playerToken == 1) {
                    if (playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] == 0) {
                        playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] = 1;
                        turnTaken = true;
                    } else {
                        if (playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] == 2) {
                            System.out.println("Feld schon belegt!");
                            turn = scanner.nextLine();
                        } else {
                            System.out.println("Feld schon belegt! (Eigenes)");
                            turn = scanner.nextLine();
                        }
                    }
                } else {
                    if (playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] == 0) {
                        playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] = 2;
                        turnTaken = true;
                    } else {
                        if (playfield[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] == 1) {
                            System.out.println("Feld schon belegt!");
                            turn = scanner.nextLine();
                        } else {
                            System.out.println("Feld schon belegt! (Eigenes)");
                            turn = scanner.nextLine();
                        }
                    }
                }
            }
            return playfield;
        }
    }

    private static void printPlayfield(int[][] playfield, char[] settings) {
        for (int i = 0; i < playfield.length; i++) {
            for (int cnt = 0; cnt < playfield.length; cnt++) {
                if (cnt == 0) {
                    switch (settings[2]) {
                        case 'W':
                            System.out.print(ANSI_WHITE);
                            break;
                        case 'C':
                            System.out.print(ANSI_CYAN);
                            break;
                        case 'M':
                            System.out.print(ANSI_PURPLE);
                            break;
                        case 'B':
                            System.out.print(ANSI_BLUE);
                            break;
                        case 'Y':
                            System.out.print(ANSI_YELLOW);
                            break;
                        case 'G':
                            System.out.print(ANSI_GREEN);
                            break;
                        case 'R':
                            System.out.print(ANSI_RED);
                            break;
                    }
                    System.out.print("| ");
                    System.out.print(ANSI_RESET);
                    if (playfield[i][cnt] == 0) {
                        switch (settings[2]) {
                            case 'W':
                                System.out.print(ANSI_WHITE);
                                break;
                            case 'C':
                                System.out.print(ANSI_CYAN);
                                break;
                            case 'M':
                                System.out.print(ANSI_PURPLE);
                                break;
                            case 'B':
                                System.out.print(ANSI_BLUE);
                                break;
                            case 'Y':
                                System.out.print(ANSI_YELLOW);
                                break;
                            case 'G':
                                System.out.print(ANSI_GREEN);
                                break;
                            case 'R':
                                System.out.print(ANSI_RED);
                                break;
                        }
                        System.out.print(" - ");
                        System.out.print(ANSI_RESET);
                    } else {
                        if (playfield[i][cnt] == 1) {
                            switch (settings[3]) {
                                case 'W':
                                    System.out.print(ANSI_WHITE);
                                    break;
                                case 'C':
                                    System.out.print(ANSI_CYAN);
                                    break;
                                case 'M':
                                    System.out.print(ANSI_PURPLE);
                                    break;
                                case 'B':
                                    System.out.print(ANSI_BLUE);
                                    break;
                                case 'Y':
                                    System.out.print(ANSI_YELLOW);
                                    break;
                                case 'G':
                                    System.out.print(ANSI_GREEN);
                                    break;
                                case 'R':
                                    System.out.print(ANSI_RED);
                                    break;
                            }
                            System.out.print(" " + settings[0] + " ");
                            System.out.print(ANSI_RESET);
                        } else {
                            switch (settings[4]) {
                                case 'W':
                                    System.out.print(ANSI_WHITE);
                                    break;
                                case 'C':
                                    System.out.print(ANSI_CYAN);
                                    break;
                                case 'M':
                                    System.out.print(ANSI_PURPLE);
                                    break;
                                case 'B':
                                    System.out.print(ANSI_BLUE);
                                    break;
                                case 'Y':
                                    System.out.print(ANSI_YELLOW);
                                    break;
                                case 'G':
                                    System.out.print(ANSI_GREEN);
                                    break;
                                case 'R':
                                    System.out.print(ANSI_RED);
                                    break;
                            }
                            System.out.print(" " + settings[1] + " ");
                            System.out.print(ANSI_RESET);
                        }
                    }
                } else {
                    if (cnt == playfield.length - 1) {
                        if (playfield[i][cnt] == 0) {
                            switch (settings[2]) {
                                case 'W':
                                    System.out.print(ANSI_WHITE);
                                    break;
                                case 'C':
                                    System.out.print(ANSI_CYAN);
                                    break;
                                case 'M':
                                    System.out.print(ANSI_PURPLE);
                                    break;
                                case 'B':
                                    System.out.print(ANSI_BLUE);
                                    break;
                                case 'Y':
                                    System.out.print(ANSI_YELLOW);
                                    break;
                                case 'G':
                                    System.out.print(ANSI_GREEN);
                                    break;
                                case 'R':
                                    System.out.print(ANSI_RED);
                                    break;
                            }
                            System.out.print(" - ");
                            System.out.print(ANSI_RESET);
                        } else {
                            if (playfield[i][cnt] == 1) {
                                switch (settings[3]) {
                                    case 'W':
                                        System.out.print(ANSI_WHITE);
                                        break;
                                    case 'C':
                                        System.out.print(ANSI_CYAN);
                                        break;
                                    case 'M':
                                        System.out.print(ANSI_PURPLE);
                                        break;
                                    case 'B':
                                        System.out.print(ANSI_BLUE);
                                        break;
                                    case 'Y':
                                        System.out.print(ANSI_YELLOW);
                                        break;
                                    case 'G':
                                        System.out.print(ANSI_GREEN);
                                        break;
                                    case 'R':
                                        System.out.print(ANSI_RED);
                                        break;
                                }
                                System.out.print(" " + settings[0] + " ");
                                System.out.print(ANSI_RESET);
                            } else {
                                switch (settings[4]) {
                                    case 'W':
                                        System.out.print(ANSI_WHITE);
                                        break;
                                    case 'C':
                                        System.out.print(ANSI_CYAN);
                                        break;
                                    case 'M':
                                        System.out.print(ANSI_PURPLE);
                                        break;
                                    case 'B':
                                        System.out.print(ANSI_BLUE);
                                        break;
                                    case 'Y':
                                        System.out.print(ANSI_YELLOW);
                                        break;
                                    case 'G':
                                        System.out.print(ANSI_GREEN);
                                        break;
                                    case 'R':
                                        System.out.print(ANSI_RED);
                                        break;
                                }
                                System.out.print(" " + settings[1] + " ");
                                System.out.print(ANSI_RESET);
                            }
                        }
                        switch (settings[2]) {
                            case 'W':
                                System.out.print(ANSI_WHITE);
                                break;
                            case 'C':
                                System.out.print(ANSI_CYAN);
                                break;
                            case 'M':
                                System.out.print(ANSI_PURPLE);
                                break;
                            case 'B':
                                System.out.print(ANSI_BLUE);
                                break;
                            case 'Y':
                                System.out.print(ANSI_YELLOW);
                                break;
                            case 'G':
                                System.out.print(ANSI_GREEN);
                                break;
                            case 'R':
                                System.out.print(ANSI_RED);
                                break;
                        }
                        System.out.print(" |");
                        System.out.print(ANSI_RESET);
                    } else {
                        if (playfield[i][cnt] == 0) {
                            switch (settings[2]) {
                                case 'W':
                                    System.out.print(ANSI_WHITE);
                                    break;
                                case 'C':
                                    System.out.print(ANSI_CYAN);
                                    break;
                                case 'M':
                                    System.out.print(ANSI_PURPLE);
                                    break;
                                case 'B':
                                    System.out.print(ANSI_BLUE);
                                    break;
                                case 'Y':
                                    System.out.print(ANSI_YELLOW);
                                    break;
                                case 'G':
                                    System.out.print(ANSI_GREEN);
                                    break;
                                case 'R':
                                    System.out.print(ANSI_RED);
                                    break;
                            }
                            System.out.print(" - ");
                            System.out.print(ANSI_RESET);
                        } else {
                            if (playfield[i][cnt] == 1) {
                                switch (settings[3]) {
                                    case 'W':
                                        System.out.print(ANSI_WHITE);
                                        break;
                                    case 'C':
                                        System.out.print(ANSI_CYAN);
                                        break;
                                    case 'M':
                                        System.out.print(ANSI_PURPLE);
                                        break;
                                    case 'B':
                                        System.out.print(ANSI_BLUE);
                                        break;
                                    case 'Y':
                                        System.out.print(ANSI_YELLOW);
                                        break;
                                    case 'G':
                                        System.out.print(ANSI_GREEN);
                                        break;
                                    case 'R':
                                        System.out.print(ANSI_RED);
                                        break;
                                }
                                System.out.print(" " + settings[0] + " ");
                                System.out.print(ANSI_RESET);
                            } else {
                                switch (settings[4]) {
                                    case 'W':
                                        System.out.print(ANSI_WHITE);
                                        break;
                                    case 'C':
                                        System.out.print(ANSI_CYAN);
                                        break;
                                    case 'M':
                                        System.out.print(ANSI_PURPLE);
                                        break;
                                    case 'B':
                                        System.out.print(ANSI_BLUE);
                                        break;
                                    case 'Y':
                                        System.out.print(ANSI_YELLOW);
                                        break;
                                    case 'G':
                                        System.out.print(ANSI_GREEN);
                                        break;
                                    case 'R':
                                        System.out.print(ANSI_RED);
                                        break;
                                }
                                System.out.print(" " + settings[1] + " ");
                                System.out.print(ANSI_RESET);
                            }
                        }
                    }
                }

            }
            System.out.println();
        }
    }

    private static int[][] createPlayfield(int groeße) {
        int[][] playfield = new int[groeße][groeße];
        return playfield;
    }
}
