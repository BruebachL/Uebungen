public class einfacherRechner {
    public static void main(String[] args){
        int[] ziffern = new int[args.length-1];
        for(int i = 0; i<ziffern.length;i++){
            ziffern[i]=Integer.parseInt(args[i]);
        }
        int result = 0;
        if(args[args.length-1].charAt(0)=='+'){
            for(int i = 0; i<ziffern.length;i++){
                result += ziffern[i];
            }
        }else{
            if(args[args.length-1].charAt(0)=='-'){
                for(int i = 0; i<ziffern.length;i++){
                    switch(i){
                        case 0: result = ziffern[0] - ziffern[1];
                        i++;
                        break;
                        default: result -= ziffern[i];
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
