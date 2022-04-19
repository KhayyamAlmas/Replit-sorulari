package replitForWhileEng;
/*
Ask user to enter a name and a character,
then check how many times the character
is repeated in the name using loops in the name

e.g:
char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
 */

import java.util.Scanner;

public class For_While_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name=scan.nextLine().toLowerCase();
        System.out.println("Please enter a character: ");
        char character =scan.next().charAt(0);
        int count=0;

        for (int i = 0; i <=name.length()-1 ; i++) {
            if (name.charAt(i)==character){
                count++;
            }

        }
        System.out.println("Number of "+character +" = "+count);

    }

}
