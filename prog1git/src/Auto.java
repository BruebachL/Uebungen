public class Auto {
    String marke;
    String model;
    String farbe;
    int hubraum;
    int baujahr;
    public Auto(String m, String mo, String f, int h, int b){
        marke = m;
        model = mo;
        farbe = f;
        hubraum = h;
        baujahr = b;
    }
    private String getMarke(){
        return this.marke;
    }
    private String getModel(){
        return this.model;
    }
    private String getFarbe(){
        return this.farbe;
    }
    private int getHubraum(){
        return this.hubraum;
    }
    private int getBaujahr(){
        return this.baujahr;
    }
}
