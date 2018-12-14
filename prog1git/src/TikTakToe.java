import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        int[][] playfield = createPlayfield(3);
        printPlayfield(playfield);
        boolean noWinner = true;
        int playerToken = 1;
        while (noWinner) {
            playfield = playerTurn(playfield, playerToken);
            for (int cnt = 0; cnt<51; cnt++){
                System.out.println();
            }
            printPlayfield(playfield);
            playerToken++;
            if (playerToken == 3) {
                playerToken = 1;
            }
            System.out.println(checkWinner(playfield));
        }
    }

    private static String checkWinner(int[][] playfield) {
        for(int row = 0; row<playfield.length; row++) {
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
        for(int row = 0; row<playfield.length; row++) {
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
        return "No player has won yet.";
    }
    public static boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
    private static int[][] playerTurn(int[][] playfield, int playerToken) {
        Scanner scanner = new Scanner(System.in);
        String turn = scanner.nextLine();
        String[] split = turn.split(" ");
        boolean turnTaken = false;
        while (!turnTaken) {
            split = turn.split(" ");
            if (playerToken == 1) {
                if (playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] == 0) {
                    playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] = 1;
                    turnTaken = true;
                } else {
                    if (playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] == 2) {
                        System.out.println("Feld schon belegt!");
                        turn = scanner.nextLine();
                    } else {
                        System.out.println("Feld schon belegt! (Eigenes)");
                        turn = scanner.nextLine();
                    }
                }
            } else {
                if (playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] == 0) {
                    playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] = 2;
                    turnTaken = true;
                } else {
                    if (playfield[Integer.parseInt(split[0])-1][Integer.parseInt(split[1])-1] == 1) {
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

    private static void printPlayfield(int[][] playfield) {
        for (int i = 0; i < playfield.length; i++) {
            for (int cnt = 0; cnt < playfield.length; cnt++) {
                if (cnt == 0) {
                    System.out.print("| ");
                    if (playfield[i][cnt] == 0) {
                        System.out.print(" - ");
                    } else {
                        if (playfield[i][cnt] == 1) {
                            System.out.print(" x ");
                        } else {
                            System.out.print(" 0 ");
                        }
                    }
                } else {
                    if (cnt == playfield.length - 1) {
                        if (playfield[i][cnt] == 0) {
                            System.out.print(" - ");
                        } else {
                            if (playfield[i][cnt] == 1) {
                                System.out.print(" x ");
                            } else {
                                System.out.print(" 0 ");
                            }
                        }
                        System.out.print(" |");
                    } else {
                        if (playfield[i][cnt] == 0) {
                            System.out.print(" - ");
                        } else {
                            if (playfield[i][cnt] == 1) {
                                System.out.print(" x ");
                            } else {
                                System.out.print(" 0 ");
                            }
                        }
                    }
                }

            }
            System.out.println();
        }
    }

    private static int[][] createPlayfield(int größe) {
        int[][] playfield = new int[größe][größe];
        return playfield;
    }
}
