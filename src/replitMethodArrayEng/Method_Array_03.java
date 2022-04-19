package replitMethodArrayEng;

/*
Write a method which accepts a String as parameter and
prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

Hint :
     Use Character.isDigit()
     Integer.valueOf()
 */

public class Method_Array_03 {
    public static void main(String[] args) {
        String str="ade1r4d3";
        sumNum(str);


    }

    private static void sumNum(String str) {
        String arr[]=str.split("");
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            if (Character.isDigit(arr[i].charAt(0))){
                sum+=Integer.valueOf(arr[i]);
            }


        }
        System.out.println(sum);
    }

}
