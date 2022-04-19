package replitForWhileEng;

/*
Write a return method that accepts an integer as input
and calculates factorial and prints like output.

Input : 6
Output: 6!=65432*1=720
 */

import java.util.Scanner;

public class For_While_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num= scan.nextInt();
        int i, fact=1;
        for ( i = 1; i <=num ; i++) {
            fact=fact*i;

        }
        System.out.println("6!=6*5*4*3*2*1="+fact);

    }
}
