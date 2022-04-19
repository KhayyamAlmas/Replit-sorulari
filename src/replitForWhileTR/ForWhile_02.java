package replitForWhileTR;

/*
Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :
30
40
Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
 */

import java.util.Scanner;

public class ForWhile_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1. tam sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("2. tam sayiyi giriniz: ");
        int sayi2= scan.nextInt();
        int GCD=0;
        int LCM=0;
        int max;
        max=sayi1*sayi2;
        for (int i = 1; i <sayi1 ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                GCD=i;
            }
        }
        for (int i = max; i >0 ; i--) {
            if (i%sayi1==0 && i%sayi2==0){
                LCM=i;
            }
        }
        System.out.print(sayi1+" ve "+sayi2+" icin GCD = "+GCD+"\n"+sayi1+" ve "+sayi2+" icin LCM = "+LCM);
    }
}
