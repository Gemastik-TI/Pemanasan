// Code by Ma'ruf Anshari
import java.util.Scanner;

public class Pemanasan_Gemastik_A {

    public static boolean validasi(int a, int b, int c) {
        if((a+b>c) && (a+c>b) && (b+c>a)) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a>0 && a<=1000000 && b>0 && b<=1000000 && c>0 && c<=1000000) {
            if(validasi(a, b, c)) 
                System.out.println("TRUE");
            else 
                System.out.println("FALSE");
        }
    }
}