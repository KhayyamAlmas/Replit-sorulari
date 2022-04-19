package replitScannerTr;

/*
Kullanıcıya günde ne kadar çay içtiğini ve
ne kadar şekerkullandığını sorun.
Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
 */

import java.util.Scanner;

public class Scanner_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double bardakCay=scan.nextDouble();

        double sekerAdedi=scan.nextDouble();
        double yildakiGUnSayisi=365;
        double birSekerAgirligi=0.0017;//kilograma  cevrildi
        double yildaKullanılanSeker=(bardakCay*sekerAdedi*
                yildakiGUnSayisi*birSekerAgirligi)/2;
        System.out.println("Yilda "+yildaKullanılanSeker+" kg seker kullaniyor." );

    }
}
