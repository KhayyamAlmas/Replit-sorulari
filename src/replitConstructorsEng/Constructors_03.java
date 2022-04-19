package replitConstructorsEng;

/*
Create 2 constructors one is with parameters, the other one is without parameter.
By using that constructors create at least 2 objects then print their features on the console.


Biri parametreli, diğeri parametresiz 2 kurucu oluşturun.
Bu yapıcıları kullanarak en az 2 nesne oluşturun ve özelliklerini konsolda yazdırın.
 */

import java.util.Scanner;

public class Constructors_03 {
    String name;
    public Constructors_03(){
        System.out.println("Is without parametr onstructor is working");
    }
    public Constructors_03(String name){
        this.name=name;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Constructors_03 obj1=new Constructors_03();
        System.out.println("Enter name you want to change: ");
        Constructors_03 obj2=new Constructors_03(scan.next());
        System.out.println("Constructor is with parameter working: "+obj2.name);


    }
}
