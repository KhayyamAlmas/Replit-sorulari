package replitForWhileTR;

/*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
herhangi bir sayı Mükemmel Sayı olarak bilinir.

Input :
6
Output:
6 Mukemmel Sayidir.
======================
Input

7

Output:

7 Mukemmel Sayidir degildir.
 */

import java.util.Scanner;

public class ForWhile_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");


            }
        }
        System.out.println();
        if (toplam==sayi){
            System.out.print(sayi+" Mukemmel Sayidir.");
        }else System.out.print(sayi+" Mukemmel Sayidir degildir.");
    }
}
