package Chess;

public class Figure{
    String name;
    int xPosition;
    int yPosition;
    boolean firstMove = false;

    public void figure (String name, int xPosition,int yPosition){
        this.name = name;
        if(this.name.contains("pawn")){
            firstMove = true;
        }
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
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkMoveRange(Figure[][] allFigures, int targetX, int targetY){
        String type = this.getType();
        if(type=="pawn"){
            if(firstMove){
                if (Math.abs(this.xPosition-targetX)==1&&Math.abs(this.yPosition-targetY)<=2){
                    if(!checkTargetField(allFigures,targetX,targetY)){
                        return true;
                    }
                }
                if (Math.abs(this.xPosition - targetX) == 0 && Math.abs(this.yPosition - targetY) <= 2) {
                    if(!checkTargetField(allFigures,targetX, targetY)){
                        return false;
                    }
                    firstMove=false;
                    return true;
                }
            }else {
                if (Math.abs(this.xPosition-targetX)==1&&Math.abs(this.yPosition-targetY)==1){
                    if(!checkTargetField(allFigures,targetX,targetY)){
                        return true;
                    }
                }
                if (Math.abs(this.xPosition - targetX) == 0 && Math.abs(this.yPosition - targetY) == 1) {
                    if(!checkTargetField(allFigures,targetX, targetY)){
                        return false;
                    }
                    return true;
                }
            }
        }
        if(type=="rook"){
            if(Math.abs(this.xPosition-targetX)==0||Math.abs(this.yPosition-targetY)==0){
                return true;
            }
        }
        if(type=="king"){
            if(Math.abs(this.xPosition-targetX)<=1&&Math.abs(this.yPosition-targetY)<=1){
                return true;
            }
        }
        if(type=="queen"){
            if(Math.abs(this.xPosition-targetX)<=8&&Math.abs(this.yPosition-targetY)<=8){
                return true;
            }
        }
        if(type=="bishop"){
            if(Math.abs(this.xPosition-targetX)-Math.abs(this.yPosition-targetY)==0){
                return true;
            }
        }
        if(type=="rook"){
            if((this.xPosition-targetX)==2&&(this.yPosition-targetY)==1){
                return true;
            }
        }
        if(type=="knight"){
            if(Math.abs(this.xPosition-targetX)==2&&Math.abs(this.yPosition-targetY)==1||Math.abs(this.xPosition-targetX)==1&&Math.abs(this.yPosition-targetY)==2)
                System.out.println("Knight can do it.");
                return true;
        }
        if(type=="invalid"){
            System.out.println("Type detection messed up.");
            return false;
        }
        return false;
    }
    public boolean collisionDetection(Figure[][] allFigures, int targetX, int targetY){
        if(this.xPosition-targetX==0){
            for(int walk = 1; walk<Math.abs(this.yPosition-targetY);walk++){
                for (Figure[] figures:allFigures) {
                    for (Figure current: figures) {
                        if(current.yPosition==this.yPosition+walk){
                            return true;
                        }
                    }
                }
            }
        }
        if(this.yPosition-targetY==0){
            for(int walk = 1; walk<Math.abs(this.xPosition-targetX);walk++){
                for (Figure[] figures:allFigures) {
                    for (Figure current: figures) {
                        if(current.xPosition==this.xPosition+walk){
                            return true;
                        }
                    }
                }
            }
        }
        if(Math.abs(this.xPosition-targetX)-Math.abs(this.yPosition-targetY)==0){
            for(int walk = 1; walk<Math.abs(this.xPosition-targetX);walk++){
                for (Figure[] figures:allFigures) {
                    for (Figure current: figures) {
                        if(current.xPosition==this.xPosition+walk&&current.yPosition==this.yPosition+walk){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public void moveFigure(Figure[][] allFigures, int targetX, int targetY){
        if(collisionDetection(allFigures, targetX, targetY)){
            System.out.println("Collision detected. Move not possible");
        }else {
            if (checkMoveRange(allFigures, targetX, targetY)) {
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
                                    System.out.println("Von eigener Figur belegt");
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Invalid Move");
            }
        }
    }
}
