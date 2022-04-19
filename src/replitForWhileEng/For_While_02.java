package replitForWhileEng;

/*
Ask user to enter 2 integer then find
GCD (Greatest Common Divisor) andLCM (Least Common Multiple)

Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
 */

import java.util.Scanner;

public class For_While_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the 1nd integer: ");
        int num1= scan.nextInt();
        System.out.print("Enter the 2nd integer: ");
        int num2= scan.nextInt();
        int GCD=0;
        int LCM=0;
        int max;
        max=num1*num2;
        for (int i = 1; i <num1 ; i++) {
            if (num1%i==0 && num2%i==0){
                GCD=i;
            }
        }
        for (int i = max; i >0 ; i--) {
            if (i%num1==0 && i%num2==0){
                LCM=i;
            }
        }
        System.out.print(" GCD for "+num1+" and "+num2+" = "+GCD+"\n LCM for "+num1+" and "+num2+" = "+LCM);



    }
}
