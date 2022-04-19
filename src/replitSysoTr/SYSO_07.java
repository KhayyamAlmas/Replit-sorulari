package replitSysoTr;

/*
Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;

int b= 5;

Ornek Cikti:

a=5

b=3
 */

public class SYSO_07 {
    public static void main(String[] args) {
        int a= 3;
        int b= 5;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"\nb="+b);


    }
}
