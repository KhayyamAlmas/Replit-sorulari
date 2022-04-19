package replitIfSwitchTernaryStringMethodsTr;

/*
Verilen iki sayının (sıfırdan büyük veya sıfıra eşit)
toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa,
"OverFlow" yazdırın.
Ornek:
INPUT :
25
46
OUTPUT :
Numaralarin Toplami:
71
 */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;

        if(sayi1>=0 && sayi2>=0){
            if(!(sayi1>999999999)&& !(sayi2>999999999)){
                toplam=sayi1+sayi2;

            }else System.out.println("OverFlow");
        }

        System.out.println("numaralarin toplami : " +toplam);
    }
}
