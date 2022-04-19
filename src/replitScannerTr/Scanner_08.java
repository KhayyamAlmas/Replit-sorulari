package replitScannerTr;

/*
Kullanıcıdan üç basamaklı bir sayı girmesini ve
bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
 */

import java.util.Scanner;

public class Scanner_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        while(sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }

        System.out.print("Verilen tamsayinin rakamlari toplami " + toplam+"'dur.");
    }
}
