/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemanasan;

import java.util.Scanner;

/**
 *
 * @author Ibnu Fadillah
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        
        if ((X+Y>Z)&&(X+Z>Y)&&(Y+Z>X)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
