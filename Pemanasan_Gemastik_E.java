// Code by Ma'ruf Anshari
import java.util.Scanner;

public class Pemanasan_Gemastik_E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P, vg, vp;

        P = input.nextInt();

        if(P>=1 && P <=1000000000) {
            vp = P / 5;

            if(P==1 || P==3) {
                vg = 0;
            } else if(P%5%2==1) {
                vp -= 1;
                vg = ((P % 5) + 5) / 2;
            } else {
                vg = (P % 5) / 2;
            }

            if(vp==0 && vg==0)
                System.out.println("MUSTAHIL");
            else
                System.out.println(vg+" "+vp);
        }
    }
}