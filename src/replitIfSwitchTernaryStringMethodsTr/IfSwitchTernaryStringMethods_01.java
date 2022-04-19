package replitIfSwitchTernaryStringMethodsTr;

/*
Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
 */

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();
        double BMI = kilo / (boy*boy);
        System.out.println("BMI : " +BMI);
        if(BMI<18.5){
            System.out.println("Zayifsiniz.");
        }else if(BMI>=18.5 && BMI<25){
            System.out.println("kilonuz idealdir");
        }else if(BMI>=25 && BMI<30){
            System.out.println("sismansiniz");

        }else if(BMI>=30){
            System.out.println("obez");

        }



    }
}
