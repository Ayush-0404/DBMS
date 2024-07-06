import java.util.Scanner;

public class ScannerClass {
    private static Scanner sc = new Scanner(System.in);
    public int readInt(){
        int a = sc.nextInt();
        return a;
    }
    public String readString(){
        String a = sc.nextLine();
        return a;
    }
    public Double readDouble(){
        double a = sc.nextDouble();
        return a;
    }
}