public class Autos {
    public static void main(String[] args){
        Auto focus = new Auto("Ford","Focus","Rot",1560, 2008);
        Auto punto = new Auto("Fiat", "Punto", "Weiss", 1242, 2012);
        Auto mustang = new Auto("Ford","Mustang GT", "Schwarz", 5038, 2018);
        Auto[] autos = {focus,punto,mustang};
        int[] hubraum = new int[autos.length];
        for(int i=0;i<hubraum.length;i++){
            hubraum[i] = autos[i].hubraum;
        }
        sort(hubraum);
        for(int i = 0;i<autos.length;i++){
            if(autos[i].hubraum==hubraum[hubraum.length-1]){
                System.out.println(autos[i].marke + " " + autos[i].model + " " + autos[i].farbe + " " + autos[i].hubraum + " " + autos[i].baujahr);
            }
        }
    }
    private static void sort(int[] toSort) {
        int temp = 0;
        for (int cnt = 0; cnt < toSort.length; cnt++) {
            for (int i = cnt; i < toSort.length; i++) {
                if (toSort[cnt] > toSort[i]) {
                    temp = toSort[cnt];
                    toSort[cnt] = toSort[i];
                    toSort[i] = temp;
                }
            }
        }
    }
}
