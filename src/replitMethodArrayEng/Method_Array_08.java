package replitMethodArrayEng;

/*
Write a return method that accepts 2 integer Arrays as
parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
 */

import java.util.Arrays;

public class Method_Array_08 {
    public static void main(String[] args) {

        int input1[]={1,2,3,4};
        int input2[]={5,6};

        System.out.println(Arrays.toString(birlestir(input1, input2)));


    }

    private static int[] birlestir(int[] input1, int[] input2) {
        int[] arr = new int[input1.length + input2.length];
        for (int i = 0; i < input1.length; i++) {
            arr[i] = input1[i];

        }
        for (int i = 0; i < input2.length; i++) {
            arr[arr.length - input2.length + i] = input2[i];

        }
        return arr;
    }
}
