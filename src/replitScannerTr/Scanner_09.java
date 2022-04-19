package replitScannerTr;

/*
Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
 */

import java.util.Scanner;

public class Scanner_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int saat=scan.nextInt();
        int dakika=scan.nextInt();
        int saniye=scan.nextInt();
        int saatSaniye=saat*60*60;
        int dakikaSaniye=dakika*60;
        int toplamSaniye=saatSaniye+dakikaSaniye+saniye;
        System.out.println(toplamSaniye+" saniye");


    }
}
