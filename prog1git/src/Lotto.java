public class Lotto {
    public static void main(String[] args) {
        int[] ziehung = ziehung(6);
        int temp = 0;
        boolean keineDoppelung = false;
        for (int cnt = 0; cnt <= 5; cnt++) {
            for (int i = cnt; i <= 5; i++) {
                if (ziehung[cnt] > ziehung[i]) {
                    temp = ziehung[cnt];
                    ziehung[cnt] = ziehung[i];
                    ziehung[i] = temp;
                }
            }
        }
        while(keineDoppelung == false) {
            for (int i = 0; i <= 4; i++) {
                if (ziehung[i] == ziehung[i + 1]) {
                    ziehung = ziehung(6);
                    i = 0;
                }
            }
            keineDoppelung = true;
        }
        for (int cnt = 0; cnt <= 5; cnt++) {
            for (int i = cnt; i <= 5; i++) {
                if (ziehung[cnt] > ziehung[i]) {
                    temp = ziehung[cnt];
                    ziehung[cnt] = ziehung[i];
                    ziehung[i] = temp;
                }
            }
        }
        for (int i = 0; i < ziehung.length; i++) {
            System.out.println(ziehung[i]);
        }
    }
    private static int[] ziehung(int anzahl){
        int[] ziehung = new int[anzahl];
        for (int i = 0; i <= 5; i++) {
            ziehung[i] = (int) (Math.random() * 49 + 1);
        }
        return ziehung;
    }
}
