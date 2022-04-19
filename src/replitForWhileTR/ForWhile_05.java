package replitForWhileTR;

/*
100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT : 100 98 96 94 92 … … … … 2 0
 */

public class ForWhile_05 {
    public static void main(String[] args) {
        int sayi=100;
        do
        {
            if (sayi % 2 == 0)
            {
                System.out.print(sayi+" ");
            }

            sayi--;
        } while (sayi >= 0);
    }
}
