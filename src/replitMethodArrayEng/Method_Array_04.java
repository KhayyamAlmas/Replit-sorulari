package replitMethodArrayEng;

import java.util.Arrays;

/*
Create a custom return type method accepts a name
as parameter and prints the name as a char array.

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
 */
public class Method_Array_04 {
    public static void main(String[] args) {
        String str="John";
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
