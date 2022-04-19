package replitForWhileTR;

/*
1'den 100'e kadar olan doğal sayıların
toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050
 */

public class ForWhile_10 {
    public static void main(String[] args) {
        int sayi=100;
        int toplam=0;

        for(int i=1; i<= sayi; i++){
            toplam+=i;
        }
        System.out.print("Sayilarin Toplami : " + toplam);

    }
}
