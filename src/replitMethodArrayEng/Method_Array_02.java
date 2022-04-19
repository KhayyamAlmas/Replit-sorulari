package replitMethodArrayEng;

/*
Write a Java program that reverse a sentence by using
Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC
 */

public class Method_Array_02 {
    public static void main(String[] args) {
        String str="Coding is greate.";
        tersCeviri(str);


    }

    private static void tersCeviri(String str) {
        String arr[]=str.split("");
        String newStr="";

        for (int i = arr.length-1; i >=0  ; i--) {
            newStr+=arr[i];


        }
        System.out.println(newStr);
    }

}
