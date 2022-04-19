package replitForWhileTR;

/*
 Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
 kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

 char ch1= 'a' ;
 String name =“John came late"
 Expected Output:
 Number of a = 2
 */

import java.util.Scanner;

public class ForWhile_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz: ");
        String isim=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);
        int sayac=0;

        for (int i = 0; i <=isim.length()-1 ; i++) {
            if (isim.charAt(i)==karakter){
                sayac++;
            }

        }
        System.out.println("karakter sayisi "+karakter+"="+sayac);
    }

}
