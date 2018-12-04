public class Student {
    String vorname = new String();
    String nachname= new String();
    int matrikelnummer = 0;
    String studiengang = new String();
    public Student(String v, String n, int m, String s){
        vorname = v;
        nachname = n;
        matrikelnummer = m;
        studiengang = s;
    }
    public static void main(String[] args){
        Student lukas = new Student("Lukas", "Bruebach", 12345, "Informatik");
        Student lukask = new Student("Lukas", "Kraft", 6789, "Informatik");
        Student nicholas = new Student("Nicholas", "Kraft", 123456789, "Informatik");
        System.out.print(nicholas.getNachname() + " " + lukas.getNachname());
    }
    private String getVorname(){
        return this.vorname;
    }
    private void setVorname(String v){
        this.vorname = v;
    }
    private String getNachname(){
        return this.nachname;
    }
    private void setNachname(String n){
       this. nachname = n;
    }
    private int getMatrikelnummer(){
        return this.matrikelnummer;
    }
    private void setMatrikelnummer(int m){
        this.matrikelnummer=m;
    }
    private String getStudiengang(){
        return this.studiengang;
    }
    private void setStudiengang(String s){
        this.studiengang = s;
    }
}
