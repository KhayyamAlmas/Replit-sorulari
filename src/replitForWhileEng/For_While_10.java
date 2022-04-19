package replitForWhileEng;

/*
Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050
 */

public class For_While_10 {
    public static void main(String[] args) {
        int num=100;
        int sum=0;

        for(int i=1; i<= num; i++){
            sum+=i;
        }
        System.out.print("Sum of Natural Numbers " + sum);


    }
}
