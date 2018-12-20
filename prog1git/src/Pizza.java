public class Pizza {
    String name;
    int[] durchmesser;
    float[] preise;

    public Pizza(String n, int[] d, float[] p){
        name = n;
        durchmesser = d;
        preise = p;
    }
    public int[] getDurchmesser(){
        return this.durchmesser;
    }
}
