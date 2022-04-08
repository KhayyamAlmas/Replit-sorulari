package soru01;

import java.util.Scanner;

public class Q03 {
    // Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str= scan.next();

        for (int i = 0; i <str.length() ; i++) {

            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }
    }
}
