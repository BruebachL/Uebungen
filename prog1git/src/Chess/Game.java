package Chess;
import Chess.Pawn;

public class Game {
    public static void main(String[] args){
        Pawn blacks[] = initFigures("black");
        Pawn whites[] = initFigures("white");
        for(int i = 0; i<whites.length;i++){
            System.out.println(whites[i].getName()+" "+whites[i].getXPosition()+" "+whites[i].getYPosition());
        }
        for(int i = 0; i<blacks.length;i++){
            System.out.println(blacks[i].getName()+" "+blacks[i].getXPosition()+" "+blacks[i].getYPosition());
        }
        int[][] playfield = initPlayfield(8);
        for(int i = 0; i<whites.length;i++){
            playfield[whites[i].getXPosition()][whites[i].getYPosition()]=1+i;
        }
        for(int i = 0; i<blacks.length;i++){
            playfield[blacks[i].getXPosition()][blacks[i].getYPosition()]=1+i;
        }
        printPlayfield(playfield, whites, blacks);
    }
    private static Pawn[] initFigures(String faction){
        Pawn pawns[] = new Pawn[8];
        for(int i=0; i<8;i++){
            pawns[i] = new Pawn();
            if(faction=="white") {
                pawns[i].pawn(faction + i, i, 1);
            }else{
                pawns[i].pawn(faction+i,i, 6);
            }
        }
        return pawns;
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
    private static void printPlayfield(int[][] playfield, Pawn[] whites, Pawn[] blacks) {
        for (int w = 0; w < whites.length; w++) {
        for (int cnt = 0; cnt < playfield.length; cnt++) {
            for (int i = 0; i < playfield.length; i++) {


                    if (i == whites[w].getXPosition() && cnt == whites[w].getYPosition()) {
                        System.out.print(ANSI_RED);
                        System.out.print(" W ");
                        System.out.print(ANSI_RESET);
                    } else {
                        if (i == blacks[w].getXPosition() && cnt == blacks[w].getYPosition()) {
                            System.out.print(ANSI_CYAN);
                            System.out.print(" B ");
                            System.out.print(ANSI_RESET);
                        } else {
                            System.out.print(" X ");
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
