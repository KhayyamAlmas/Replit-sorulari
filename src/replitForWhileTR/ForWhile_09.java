package replitForWhileTR;

/*
Kullanıcının girdiği sayıyı tersine çeviren
bir java programı yazınız. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
 */

import java.util.Scanner;

public class ForWhile_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int tersSayi= 0;

        System.out.print("Girilen Numaranin Tersi: ");
        while(sayi>0){
            tersSayi=sayi%10;
            sayi/=10;
            System.out.print(tersSayi);

        }
    }
}
