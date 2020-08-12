// Code by Ma'ruf Anshari
import java.util.Scanner;

public class Pemanasan_Gemastik_B {

    public static void main(String[] args) {
        int n;
        char x;

        Scanner input = new Scanner(System.in);
    
        n = input.nextInt();
        x = input.next().charAt(0);
    
        if(n>1) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n-i-1; j++) 
                    System.out.print(" ");
                for(int j=0; j<n-(n-i-1); j++) {
                    System.out.print(x);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}