package replitListEng;

/*
Write a java program which accept a sentence as parameter,
than reverses sentence by using StringBuilder and checks
if sentence is palindrome or not (without case sensitivity).
Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"
 */

import java.util.Scanner;

public class List_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder strb=new StringBuilder(scan.nextLine());

        System.out.println(strb.reverse());

        if (strb.toString().equalsIgnoreCase(strb.reverse().toString())){
            System.out.println("It is a palindrome");
        }else System.out.println("It is not a palindrome");


    }
}
