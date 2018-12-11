import java.util.Scanner;

public class Spielen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String normalesWort = scanner.nextLine();
        System.out.println(spielen(normalesWort));
    }
    public static String spielen(String normaleswort){
        char[] normalesWort = normaleswort.toCharArray();
        char[] vokale = {'a','e','i','o','u'};
        int Stringerweiterung = 0;
        for (int i = 0; i<normalesWort.length; i++){
            for (int cnt = 0; cnt<vokale.length;cnt++){
                if(normalesWort[i]==vokale[cnt]){
                    Stringerweiterung = Stringerweiterung + 2;
                }
            }
        }
        System.out.println(Stringerweiterung);
        char[] bModifikation = new char[normaleswort.length()+Stringerweiterung*2];
        for(int position = 0; position<bModifikation.length-3;) {
            for (int i = 0; i < normalesWort.length-1;) {
                for (int cnt = 0; cnt < vokale.length; cnt++) {
                    if (normalesWort[i] == vokale[cnt]) {
                        bModifikation[position] = normalesWort[i];
                        bModifikation[position+1] = 'b';
                        bModifikation[position+2] = normalesWort[i];
                        position = position + 3;
                        i++;
                    }else{
                        bModifikation[position] = normalesWort[i];
                        position++;
                        i++;
                    }
                }
            }
        }
        return String.valueOf(bModifikation);
    }
}
