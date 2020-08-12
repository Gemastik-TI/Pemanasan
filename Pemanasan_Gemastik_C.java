// Code by Ma'ruf Anshari
import java.util.Scanner;

public class Pemanasan_Gemastik_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n>0 && n<101) {
            System.out.println("tek kotek kotek kotek, anak ayam turun berkotek ");

            for(int i=n; i>0; i--) {
                System.out.print("anak ayam turunlah "+i);
                if(i-1!=0) 
                    System.out.println(", mati satu tinggallah "+(i-1));
                else
                    System.out.println(", mati satu tinggallah induknya");
            }
        }

    }
}