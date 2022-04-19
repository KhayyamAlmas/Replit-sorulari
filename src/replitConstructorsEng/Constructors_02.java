package replitConstructorsEng;

/*
Create a student's variables in the main method and use this assign variables
create a method named Changename, student as parameter get the information and
change all the information in the method and add the new information have
it print The line where we call the Rename method in the Main method is immediately
then reprint student information Create a method named changesurname,
this method is "lastname" as parameter get the variable.
In the method, ask the user to enter a new last name and change the old last name (i.e. can).


Ana yöntemde bir öğrencinin değişkenlerini oluşturun ve bu değişkenleri atamayı kullanın
Changename adlı bir yöntem oluşturun, parametre olarak öğrenci bilgileri alın ve
yöntemdeki tüm bilgileri değiştirin ve yeni bilgileri ekleyin yazdırın
Rename yöntemini çağırdığımız satır Ana yöntem hemen ardından öğrenci bilgilerini yeniden yazdırır
changeurname adlı bir yöntem oluşturun, parametre değişkeni alırken bu yöntem "lastname" dir.
Yöntemde, kullanıcıdan yeni bir soyadı girmesini ve eski soyadını değiştirmesini isteyin (yani can).
 */

import java.util.Scanner;

public class Constructors_02 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "Khayyam";
        String surName = "Almas";
        System.out.printf("name: %4S surname: %4S", name, surName);
        System.out.println("");
        System.out.printf("name: %4S surname: %4S", changeName(name), changeSurName(surName));


    }

    private static String changeName(String name) {
        System.out.print("Degistirmek istediginiz ismi giriniz: ");
        name = scan.next();
        String rename = name;

        return rename;

    }

    private static String changeSurName(String surName) {
        System.out.print("Degistirmek istediginiz soyismi giriniz: ");
        surName = scan.next();
        String lastname = surName;

        return lastname;

    }
}