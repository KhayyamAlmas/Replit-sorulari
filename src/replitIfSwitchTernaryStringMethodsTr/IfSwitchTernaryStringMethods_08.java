package replitIfSwitchTernaryStringMethodsTr;

/*
Kullanıcıdan bir isim girmesini isteyin ve
son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
 */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String isim=scan.next();

        System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));

    }
}
