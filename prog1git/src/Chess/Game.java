package Chess;


public class Game {
    public static void main(String[] args){
        int[][] playfield = initPlayfield(8);
        Figure blacks[] = initFigures(playfield,"black", 8, "pawn");
        Figure whites[] = initFigures(playfield,"white",8, "pawn");
        Figure whiteKing[] = initFigures(playfield, "white", 1, "king");
        Figure blackKing[] = initFigures(playfield, "black", 1, "king");
        for(int i = 0; i<whites.length;i++){
            System.out.println(whites[i].getName()+" "+whites[i].getXPosition()+" "+whites[i].getYPosition());
        }
        for(int i = 0; i<blacks.length;i++){
            System.out.println(blacks[i].getName()+" "+blacks[i].getXPosition()+" "+blacks[i].getYPosition());
        }
        fillPlayfield(playfield,blacks,1);
        fillPlayfield(playfield,whites,2);
        fillPlayfield(playfield,whiteKing,3);
        fillPlayfield(playfield,blackKing,4);
        for(int i = 0; i<whiteKing.length;i++){
            System.out.println(whiteKing[i].getName()+" "+whiteKing[i].getXPosition()+" "+whiteKing[i].getYPosition());
        }
        printPlayfield(playfield, whites, blacks, whiteKing);
    }
    private static int[][] fillPlayfield(int[][] playfield, Figure[] figures, int uniqueID){
        for(int i = 0; i<figures.length;i++){
            playfield[figures[i].getXPosition()][figures[i].getYPosition()]=uniqueID;
        }
        return playfield;
    }
    private static Figure[] initFigures(int[][] playfield, String faction, int amount, String type){
        Figure Figure[] = new Figure[amount];
        for(int i=0; i<amount;i++){
            Figure[i] = new Figure();
            switch(type) {
                case "pawn": if (faction == "white") {
                    Figure[i].figure(faction + i, i, 1);
                    break;
                } else {
                    Figure[i].figure(faction + i, i, 6);
                    break;
                }
                case "king": if (faction == "white") {
                    Figure[i].figure(faction + i, 5, 0);
                    break;
                } else {
                    Figure[i].figure(faction + i, 5, 7);
                    break;
                }
                case "rook":
                    if (faction == "white") {
                        Figure[i].figure(faction + i, 0, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i, i, 7);
                        break;
                    }
            }
        }
        return Figure;
    }
    private static int[][] initPlayfield(int groeße) {
        int[][] playfield = new int[groeße][groeße];
        return playfield;
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
    private static void printFigures(Figure[] figures, char token){
        for (int cnt = 0; cnt < figures.length; cnt++) {
            for (int i = 0; i < figures.length; i++) {
                if (i == figures[i].getXPosition() && cnt == figures[i].getYPosition()) {
                    System.out.print(ANSI_RED);
                    System.out.print(" " + token + " ");
                    System.out.print(ANSI_RESET);
                }
            }
            System.out.println();
        }
    }
    private static void printPlayfield(int[][] playfield, Figure[] whitePawns, Figure[] blackPawns, Figure[] whiteKing) {
        for (int cnt = 0; cnt < playfield.length; cnt++) {
            for (int i = 0; i < playfield.length; i++) {


                    if (i == whitePawns[i].getXPosition() && cnt == whitePawns[i].getYPosition()) {
                        System.out.print(ANSI_RED);
                        System.out.print(" W ");
                        System.out.print(ANSI_RESET);
                    } else {
                        if (i == blackPawns[i].getXPosition() && cnt == blackPawns[i].getYPosition()) {
                            System.out.print(ANSI_CYAN);
                            System.out.print(" B ");
                            System.out.print(ANSI_RESET);
                        } else {
                            if (i == whiteKing[i].getXPosition() && cnt == whiteKing[i].getYPosition()) {
                                System.out.print(ANSI_CYAN);
                                System.out.print(" K ");
                                System.out.print(ANSI_RESET);
                            } else {
                                if(playfield[i][cnt]==0){
                                System.out.print(" - ");
                            }
                            }
                        }
                }

            }
            System.out.println();
        }
    }
    private static boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
