package replitForWhileEng;

/*
Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321
 */

import java.util.Scanner;

public class For_While_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        int revNum= 0;

        System.out.print("Reverse Of The Number: ");
        while(num>0){
            revNum=num%10;
            num/=10;
            System.out.print(revNum);

        }


    }
}
