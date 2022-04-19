package replitIfSwitchTernaryStringMethodsTr;

/*
2 kelime oluşturun: isim1 ve isim2

isim1 çift sayıda karakter içeriyorsa,
ikinci kelimeyi ilk adın ortasına yerleştirin
ilk kelime tek sayida karakter iceriyorsa
“isim1, isim2 ye eklenemiyor” yazdırın
Örneğin:
isim1= mehmet
isim2= ahmet
Yazdır ==> mehahmetmet
isim1= memet
isim2= ahmet
Yazdır ==> isim1, isim2 ye eklenemiyor */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name1=scan.next();

        String name2=scan.next();
        ikiyeBolen(name1, name2);
    }
    private static void ikiyeBolen(String name1, String name2) {
        int name1Uzunluk=name1.length();
        if (name1Uzunluk%2==0){
            System.out.println(name1.substring(0, name1Uzunluk / 2) + name2 + name1.substring(name1Uzunluk / 2, name1Uzunluk));
        }else System.out.println("isim1, isim2 ye eklenemiyor.");
    }
}
