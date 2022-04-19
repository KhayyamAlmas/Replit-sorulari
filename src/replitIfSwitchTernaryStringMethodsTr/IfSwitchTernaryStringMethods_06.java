package replitIfSwitchTernaryStringMethodsTr;

/*
Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
 */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String isim=scan.next();

        String sonuc=isim.charAt(0)==isim.charAt(1) && isim.charAt(0)==isim.charAt(2) && isim.charAt(1)==isim.charAt(2) ? "isim ayni karakterlere sahiptir." : "ismin benzersiz karakterleri var.";
        System.out.println(sonuc);


    }
}
