package replitConstructorsEng;

/*
Write a return method that accepts more than one integer as parameter
and prints the sum of integers Method name = sum if you call method
like that sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
 */

public class Varargs_01 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        sum(arr);



    }

    private static void sum(int...a) {
        int sum=0;
        for (int each:a) {
            sum+=each;

        }
        System.out.println(sum);

    }
}
