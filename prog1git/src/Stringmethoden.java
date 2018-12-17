public class Stringmethoden {
    public static void main(String[] args){
        String seite = "<body id=\"www‐wikipedia‐org\">" + "<div class=\"central‐textlogo\">" + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb" + "/b/bb/Wikipedia_wordmark.svg/174px‐Wikipedia_wordmark.svg.png\"" + "</div>" + "</body>";
        String startOfUrl = "img src=\"";
        String endOfUrl = "png";
        int imgIndex = seite.indexOf(startOfUrl)+startOfUrl.length();
        int pngIndex = seite.indexOf(endOfUrl)+endOfUrl.length();
        String url = seite.substring(imgIndex,pngIndex);
        System.out.println(url);
    }
}
