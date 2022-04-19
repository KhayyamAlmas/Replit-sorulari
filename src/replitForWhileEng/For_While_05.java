package replitForWhileEng;

/*
Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
 */

public class For_While_05 {
    public static void main(String[] args) {
        int num=20;
        System.out.print("Even Numbers from " +num+ " to 0 are: ");
        do
        {
            if (num % 2 == 0)
            {
                System.out.print(num+" ");
            }

            num--;
        } while (num >= 0);


    }
}
