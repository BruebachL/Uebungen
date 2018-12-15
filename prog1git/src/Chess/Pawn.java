package Chess;

public class Pawn{
    String name;
    int xPosition;
    int yPosition;

    public void pawn (String name, int xPosition,int yPosition){
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public String getName(){
        return name;
    }
    public int getXPosition(){
        return xPosition;
    }
    public int getYPosition(){
        return yPosition;
    }
}
