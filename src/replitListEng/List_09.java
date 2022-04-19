package replitListEng;

/*
Write a Java program to get a String from user as input and
find the maximum occurring character in that string.
(Ignore case sensitivity).

Input : Learning java is easy

Output: maximum occurring character is : a
 */

import java.util.Scanner;

public class List_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine().toLowerCase();

        int count=0;
        String maxCharacter="";
        int max=0;

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if (count>=max){
                max=count;
                maxCharacter=str.substring(i,i+1);
            }
            count=0;

        }
        System.out.println(maxCharacter);




    }
}
