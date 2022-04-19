package replitMethodArrayEng;

/*
Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
 */



public class Method_Array_05 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        for (int i = 0; i < input.length ; i++) {
            sum+=input[i];

        }
        System.out.println(sum/ input.length);
    }

}
