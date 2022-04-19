package replitForWhileEng;

import java.util.Scanner;

public class For_While_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();
        int count=0;
        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                count+=i;
                System.out.print(i+" ");


            }
        }
        System.out.println();
        if (count==num){
            System.out.print(num+" is Perfect Number");
        }else System.out.print(num+" is not Perfect Number");


    }
}
