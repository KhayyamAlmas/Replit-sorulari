package replitListEng;

/*
Get a sentence from the user.
Accept the sentence received from the user as a parameter,
Invert sentence using Array and write a Method that
returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
 */

import java.util.Scanner;

public class List_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String arr[]=str.split("");

        System.out.println(cumTersCevir(arr));


    }

    private static String cumTersCevir(String[] arr) {
        String str1="";
        for (int i = arr.length-1; i >=0 ; i--) {
            str1+=arr[i];


        }
        return str1;

    }
}
