package Chess;


import java.util.Scanner;

public class Game {
    static boolean debugDone = false;
    public static void main(String[] args){
        int[][] playfield = initPlayfield(8);
        Figure blacks[] = initFigures(playfield,"black", 8, "pawn");
        Figure whites[] = initFigures(playfield,"white",8, "pawn");
        Figure whiteKing[] = initFigures(playfield, "white", 1, "king");
        Figure blackKing[] = initFigures(playfield, "black", 1, "king");
        Figure whiteRooks[] = initFigures(playfield, "white", 2, "rook");
        Figure whiteKnights[] = initFigures(playfield, "white", 2, "knight");
        Figure whiteBishops[] = initFigures(playfield, "white", 2, "bishop");
        Figure whiteQueen[] = initFigures(playfield, "white", 1, "queen");
        Figure blackRooks[] = initFigures(playfield, "black", 2, "rook");
        Figure blackKnights[] = initFigures(playfield, "black", 2, "knight");
        Figure blackBishops[] = initFigures(playfield, "black", 2, "bishop");
        Figure blackQueen[] = initFigures(playfield, "black", 1, "queen");
        Figure allFigures[][] = {blacks,whites,whiteKing,blackKing,whiteRooks,whiteKnights,whiteBishops,whiteQueen,blackRooks,blackKnights,blackBishops,blackQueen};
        for(int i=0;i<allFigures.length;i++){
            fillPlayfield(playfield,allFigures[i],i);
        }
        printPlayfield(playfield,allFigures);
        while(!debugDone) {
            moveFigure(playfield, allFigures);
            System.out.println("\r");
            printPlayfield(playfield, allFigures);
            if(blackKing[0].xPosition==999){
                debugDone=true;
            }
            if(whiteKing[0].xPosition==999){
                debugDone=true;
            }
        }
    }
    private static void moveFigure(int[][] playfield,Figure[][] allFigures){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please take a turn");
        String turn = scanner.nextLine();
        if(turn.charAt(0)=='d'){
            debugDone=true;
        }else {
            String[] splitter = turn.split(" to ");
           // allFigures[0][0].checkTargetField(allFigures, Integer.parseInt(splitter[1]) % 10, (Integer.parseInt(splitter[1]) - Integer.parseInt(splitter[1]) % 10) / 10);
            for (int i = 0; i < allFigures.length; i++) {
                for (int cnt = 0; cnt < allFigures[i].length; cnt++) {
                    if (allFigures[i][cnt].xPosition == Integer.parseInt(splitter[0]) % 10 && allFigures[i][cnt].yPosition == (Integer.parseInt(splitter[0]) - Integer.parseInt(splitter[0]) % 10) / 10) {
                        allFigures[i][cnt].moveFigure(allFigures, Integer.parseInt(splitter[1]) % 10, (Integer.parseInt(splitter[1]) - Integer.parseInt(splitter[1]) % 10) / 10);
                    }
                }
            }
        }
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
                case "pawn":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, i, 1);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, i, 6);
                        break;
                    }
                case "king":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, 3, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, 3, 7);
                        break;
                    }
                case "rook":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, i * 7, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, i * 7, 7);
                        break;
                    }
                case "knight":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, i*5+1, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, i*5+1, 7);
                        break;
                    }
                case "bishop":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, i*3+2, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, i*3+2, 7);
                        break;
                    }
                case "queen":
                    if (faction == "white") {
                        Figure[i].figure(faction + i+type, 4, 0);
                        break;
                    } else {
                        Figure[i].figure(faction + i+type, 4, 7);
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
    private static void getColor(Figure[] subFigures, int i, int cnt){
        for (Figure current:subFigures) {
            if(current.xPosition==i&&current.yPosition==cnt){
                if(current.name.contains("white")){
                    System.out.print(ANSI_CYAN);
                }else{
                    System.out.print(ANSI_RED);
                }
            }
        }
    }
    private static void printPlayfield(int[][] playfield,Figure[][] allFigures) {
        for (int cnt = 0; cnt < playfield.length; cnt++) {
            for (int i = 0; i < playfield.length; i++) {
                boolean printedSomething = false;
                for(int f = 0; f<allFigures.length;f++){
                    switch(f){
                        case 0: if(checkFigure(allFigures[f],i,cnt)) {
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" P ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 1: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" P ");
                            printedSomething = true;
                            System.out.print(ANSI_RESET);
                            break;
                        }
                        case 2: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" K ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 3: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" K ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 4: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" R ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 5: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" k ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 6: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" B ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 7: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" Q ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 8: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" R ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 9: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" k ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 10: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" B ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                        case 11: if(checkFigure(allFigures[f],i,cnt)){
                            getColor(allFigures[f],i,cnt);
                            System.out.print(" Q ");
                            System.out.print(ANSI_RESET);
                            printedSomething = true;
                            break;
                        }
                    }
                }
                if(!printedSomething){
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
    private static boolean checkFigure(Figure[] tobechecked, int row, int column){
        for(int i=0;i<tobechecked.length;i++){
            if(tobechecked[i].xPosition==row&&tobechecked[i].yPosition==column){
                return true;
            }
        }
        return false;
    }
    private static String checkFigurePresent(Figure[][] allFigures, int row, int column){
        for(int cnt=0;cnt< allFigures.length;cnt++)
        for(int i=0;i<allFigures.length;i++){
            if(allFigures[cnt][i].xPosition==row&&allFigures[cnt][i].yPosition==column){
                return allFigures[cnt][i].name;
            }
        }
        return "Null";
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
