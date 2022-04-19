package replitScannerTr;

/*
Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin
alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
 */

import java.util.Scanner;

public class Scanner_03 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Dikdortgen uzunluklarini giriniz: ");
        int a = scann.nextInt();
        int b = scann.nextInt();
        int Alan = a * b;
        int Cevre = 2 * (a + b);
        System.out.println("Alan: " + Alan);
        System.out.println("Cevre: " + Cevre);

    }
}
