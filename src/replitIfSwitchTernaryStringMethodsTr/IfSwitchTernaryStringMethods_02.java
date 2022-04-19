package replitIfSwitchTernaryStringMethodsTr;

/*
Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını
sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN : **** **** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
 */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String isim=scan.next().toUpperCase();

        String soyIsim=scan.next().toUpperCase();

        String kKNo=scan.next();

        String isimSoyIsim=isim.substring(0,1)+isim.replaceAll("\\w", "*").substring(1)+" "+soyIsim.substring(0,1)+soyIsim.replaceAll("\\w", "*").substring(1);

        System.out.println(isimSoyIsim);
        System.out.println("CCN  : **** **** **** "+(kKNo.substring(kKNo.length()-4)));


    }
}
