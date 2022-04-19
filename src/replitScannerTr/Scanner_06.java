package replitScannerTr;

/*
Kullanıcıdan bir Float değer girmesini isteyin,
bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
 */

import java.util.Scanner;

public class Scanner_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Float bir deger giriniz: ");
        float deger=scan.nextFloat();
        short sayi=(short) deger;
        System.out.println(sayi);




    }
}
