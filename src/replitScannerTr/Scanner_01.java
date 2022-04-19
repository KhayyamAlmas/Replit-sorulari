package replitScannerTr;

/*
Kullanıcıdan bir sayı alın ve sayının küpünün
yarısını konsola yazdıran bir program yazın.
 */

import java.util.Scanner;

public class Scanner_01 {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        double sayi=scan.nextDouble();
        sayi=(sayi*sayi*sayi)/2;
        System.out.println(sayi);



    }
}
