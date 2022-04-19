package replitListEng;

/*
Write a program that accepts an integer as input and
prints first 10 prime numbers greater than input
Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();


        List<Integer> primeNumbersList=new ArrayList<>();
        int count=0;
        num++;
        while(primeNumbersList.size()<10){

            for (int i = 2; i <num ; i++) {

                if (num%i==0) {
                    count++;
                }

            }
            if(count==0){
                primeNumbersList.add(num);
            }
            num++;
            count=0;
        }
        System.out.println(primeNumbersList);

    }
}
