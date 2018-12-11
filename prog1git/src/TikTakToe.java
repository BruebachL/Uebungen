import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        int[][] playfield = createPlayfield(3);
        printPlayfield(playfield);
        boolean noWinner = true;
        int playerToken = 1;
        while (noWinner) {
            playfield = playerTurn(playfield, playerToken);
            printPlayfield(playfield);
            playerToken++;
            if (playerToken == 3) {
                playerToken = 1;
            }
            System.out.println(checkWinner(playfield));
        }
    }

    private static int checkWinner(int[][] playfield) {
        boolean horizontalWinFailed = false;
        for (int row = 0; row < playfield.length; row++) {
            for (int i = 0; i < playfield.length - 1; i++) {
                for (int cnt = 0; cnt < playfield.length; cnt++) {
                    if (playfield[row][i] != 0) {
                        if (playfield[row][i] != playfield[row][cnt]) {
                            horizontalWinFailed = true;
                        }
                    }
                }
            }
            if (!horizontalWinFailed) {
                return 1;
            }
            horizontalWinFailed = false;
        }
        boolean verticalWinFailed = false;
        for (int column = 0; column < playfield.length; column++) {
            for (int i = 0; i < playfield.length - 1; i++) {
                for (int cnt = 0; cnt < playfield.length; cnt++) {
                    if (playfield[i][column] != 0) {
                        if (playfield[i][column] != playfield[cnt][column]) {
                            verticalWinFailed = true;
                        }
                    }
                }
            }
            if (!verticalWinFailed) {
                return 2;
            }
            verticalWinFailed = false;
        }
        return 0;
    }

    private static int[][] playerTurn(int[][] playfield, int playerToken) {
        Scanner scanner = new Scanner(System.in);
        String turn = scanner.nextLine();
        String[] split = turn.split(" ");
        boolean turnTaken = false;
        while (!turnTaken) {
            split = turn.split(" ");
            if (playerToken == 1) {
                if (playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] == 0) {
                    playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 1;
                    turnTaken = true;
                } else {
                    if (playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] == 2) {
                        System.out.println("Feld schon belegt!");
                        turn = scanner.nextLine();
                    } else {
                        System.out.println("Feld schon belegt! (Eigenes)");
                        turn = scanner.nextLine();
                    }
                }
            } else {
                if (playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] == 0) {
                    playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = 2;
                    turnTaken = true;
                } else {
                    if (playfield[Integer.parseInt(split[0])][Integer.parseInt(split[1])] == 1) {
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
