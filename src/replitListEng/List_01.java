package replitListEng;

/*
Write a Java program to get a String from user as input and
find the maximum occurring character in that string.
(Ignore case sensitivity)

input :

Learning java is easy

output:

maximum occurring character is : a
 */

import java.util.Scanner;

public class List_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = scan.nextLine().split("");
        String enCokTekrarEden = "";
        int maxSayac = 0;
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    sayac++;
                }
            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];
            }
            sayac = 0;
        }
        System.out.println("maximum occurring character is : "+enCokTekrarEden);


    }
}
