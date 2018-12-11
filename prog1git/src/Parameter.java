public class Parameter {
    public static void main(String[] args){
        if(args.length==2){
            System.out.println(Integer.valueOf(args[0])*Integer.valueOf(args[1]));
        }else{
            System.out.println("Fehler: Ungueltige Anzahl an Parametern.");
        }
    }
}
