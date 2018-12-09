import java.util.Scanner;

public class MittelMinMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Tabellengröße an: ");
        int tableSize = scanner.nextInt();
        double[] table = sortTable(createTable(tableSize), tableSize);
        System.out.println("Kleinster Wert: " + table[0]);
        System.out.println("Größter Wert: "+ table[tableSize-1]);
        System.out.println("Arithmetischer Mittel: " + arithmeticMiddle(table, tableSize));
        System.out.println("Standardabweichung: " + standardDeviation(table, tableSize));
    }
    private static double arithmeticMiddle(double[] table, int tableSize){
        double result = 0;
        for(double i = 0; i < tableSize; i++){
            result += (table[(int)i]);
        }
        return result/tableSize;
    }
    private static double standardDeviation(double[] table, int tableSize){
        double result = 0;
        for(double i = 0; i < tableSize; i++){
            result += ((table[(int)i]-arithmeticMiddle(table, tableSize))*(table[(int)i]-arithmeticMiddle(table, tableSize)));
        }
        return Math.sqrt(result/tableSize);
    }
    private static double[] createTable(int tableSize){
        double[] table = new double[tableSize];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableSize; i++)
        {
            System.out.print((i + 1) + ". Wert: ");
            table[i] = scanner.nextDouble();
        }
        return table;
    }
    private static double[] sortTable(double[] table, int tableSize){
        double temp = 0;
        for (int cnt = 0; cnt <= tableSize-1; cnt++) {
            for (int i = cnt; i <= tableSize-1; i++) {
                if (table[cnt] > table[i]) {
                    temp = table[cnt];
                    table[cnt] = table[i];
                    table[i] = temp;
                }
            }
        }
        return table;
    }
}
