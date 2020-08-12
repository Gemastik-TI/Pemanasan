// Code by Ma'ruf Anshari
import java.util.Scanner;

public class Pemanasan_Gemastik_D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n>2 && n<=100000) {
            String[] hasil = new String[n];

            for(int i=0; i<n; i++) {
                hasil[i] = input.next();
            }

            boolean output=true;
            for(int i=n-1; i>=0; i--) {
                if(i==n-1) {
                    if(hasil[i].equals("JUJUR")) {
                        output = true;
                    }
                    else {
                        output = false;
                    }
                } else {
                    if(output==true && hasil[i].equals("BOHONG")) {
                        output = false;
                    }
                    else if(output==false && hasil[i].equals("BOHONG")) {
                        output = true;
                    }
                }
            }

            if(output==true)
                System.out.print("\nJUJUR");
            else
                System.out.print("\nBOHONG");
        }
    }
}