package replitMethodArrayEng;

/*
Write a return method to reverse number.

Input : 12345

Output : 54321
 */

public class Method_Array_01 {
    public static void main(String[] args) {
        String str="12345";
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
