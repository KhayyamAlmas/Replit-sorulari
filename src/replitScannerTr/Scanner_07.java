package replitScannerTr;

/*
Kullanıcı tarafından girilen DOUBLE sayıyı
tam sayıya çeviren bir program yazınız.
 */

import java.util.Scanner;

public class Scanner_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir double sayi giriniz: ");
        double doubleSayi=scan.nextDouble();
        int tamSayi=(int) doubleSayi;
        System.out.println(tamSayi);


    }
}
