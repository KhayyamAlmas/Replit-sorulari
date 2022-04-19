package replitConstructorsEng;

/*
Write a java program which accept a sentence as parameter,
than reverses sentence by using StringBuilder and checks
if sentence is palindrome or not (without case sensitivity)
Eg : input : I love Java
Output: "Reversed sentence : avaJ evol I .
It is not a palindrome"
 */

import java.util.Scanner;

public class StrinBuilder_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strb = new StringBuilder(scan.nextLine());

        System.out.println(strb.reverse());
    }
}
