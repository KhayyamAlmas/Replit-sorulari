package replitScannerTr;

/*
Kullanıcıdan dakika girmesini isteyin,
Dakikaları birkaç yıl ve gün sayısına
dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
 */

import java.util.Scanner;

public class Scanner_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dakika=scan.nextInt();
        int dakikaGun=dakika/(60*24);
        int gunYil=dakikaGun/365;
        int kalanGun=dakikaGun-(gunYil*365);

        System.out.println(dakika+" dakika yaklasik "+gunYil+" yil "+kalanGun+" gundur");


    }
}
