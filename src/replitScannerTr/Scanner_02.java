package replitScannerTr;

/*
Kullanıcıdan karenin kenar uzunluğunu alın ve karenin
alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
 */

import java.util.Scanner;

public class Scanner_02 {
    public static void main(String[] args) {
        Scanner scann= new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz: ");
        int a=scann.nextInt();
        int Alan;
        int Cevre;
        Alan=a*a;
        Cevre=4*a;
        System.out.println("Alan: "+Alan+"\nCevre: "+Cevre);






    }
}
