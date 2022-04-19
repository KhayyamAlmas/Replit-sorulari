package replitForWhileTR;

/*
Girdi olarak bir tamsayı kabul eden ve
faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
 */

import java.util.Scanner;

public class ForWhile_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz: ");
        int sayi= scan.nextInt();
        int i, fakt=1;
        for ( i = 1; i <=sayi ; i++) {
            fakt=fakt*i;

        }
        System.out.println("6!=6*5*4*3*2*1="+fakt);
    }
}
