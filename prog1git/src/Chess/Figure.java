package Chess;

public class Figure{
    String name;
    int xPosition;
    int yPosition;

    public void figure (String name, int xPosition,int yPosition){
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
    public String getType() {
        if(this.name.contains("rook")){
            return "rook";
        }
        if(this.name.contains("pawn")){
            return "pawn";
        }
        if(this.name.contains("knight")){
            return "knight";
        }
        if(this.name.contains("queen")){
            return "queen";
        }
        if(this.name.contains("bishop")){
            return "bishop";
        }
        if(this.name.contains("king")){
            return "king";
        }
        return "invalid";
    }
    public boolean checkTargetField(Figure[][] allFigures, int targetX, int targetY){
        for(Figure[] xPosition : allFigures){
            for(Figure currentFigure : xPosition){
                if(currentFigure.xPosition == targetX&&currentFigure.yPosition==targetY){
                    System.out.println("Feld schon belegt");
                    return false;
                }
            }
        }
        System.out.println("Feld frei");
        return true;
    }
    public boolean checkMoveRange(int targetX, int targetY){
        String type = this.getType();
        if(type=="pawn"){
            if(this.xPosition-targetX<=0&&this.xPosition-targetX<=1){
                return true;
            }
        }
        if(type=="rook"){
            if(targetX<=0||targetY<=0){
                return true;
            }
        }
        if(type=="king"){
            if(targetX<=1&&targetY<=1){
                return true;
            }
        }
        if(type=="queen"){
            if(targetX<=8&&targetY<=8){
                return true;
            }
        }
        if(type=="bishop"){
            if((this.xPosition-targetX)-(this.yPosition-targetY)==0){
                return true;
            }
        }
        if(type=="rook"){
            if((this.xPosition-targetX)==2&&(this.yPosition-targetY)==1){
                return true;
            }
        }
        return false;
    }
    public void moveFigure(Figure[][] allFigures, int targetX, int targetY){
        if(checkMoveRange(targetX,targetY)) {
            if (checkTargetField(allFigures, targetX, targetY)) {
                this.xPosition = targetX;
                this.yPosition = targetY;
            } else {
                for (int i = 0; i < allFigures.length; i++) {
                    for (int cnt = 0; cnt < allFigures[i].length; cnt++) {
                        if (allFigures[i][cnt].xPosition == targetX && allFigures[i][cnt].yPosition == targetY) {
                            if (allFigures[i][cnt].name.contains("white") != this.name.contains("white")) {
                                allFigures[i][cnt].xPosition = 999;
                                allFigures[i][cnt].yPosition = 999;
                                this.xPosition = targetX;
                                this.yPosition = targetY;
                            } else {
                                System.out.println("Von eigener Figure belegt");
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("Invalid Move");
        }

    }
}
