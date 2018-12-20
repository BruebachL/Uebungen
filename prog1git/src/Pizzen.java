public class Pizzen {
    public static void main(String[] args){
        Pizza margharita = new Pizza("Margharita",new int[]{15,30,45}, new float[]{15.5f,20.5f});
        Pizza speciale = new Pizza("Speciale",new int[]{15,30,45,50}, new float[]{15.5f,20.5f});
        Pizza tunfisch = new Pizza("Tunfisch",new int[]{15,30,45}, new float[]{15.5f,20.5f});
        Pizza vegetarisch = new Pizza("Vegetarisch",new int[]{15,30,45}, new float[]{15.5f,20.5f});
        Pizza salami = new Pizza("Salami",new int[]{15,30,45}, new float[]{15.5f,20.5f});
        Pizza[] pizzen = {margharita,speciale,tunfisch,vegetarisch,salami};
        int[] test = pizzen[1].durchmesser;
        for(int i = 0; i<test.length;i++){
            System.out.println(test[i]);
        }
    }
}
