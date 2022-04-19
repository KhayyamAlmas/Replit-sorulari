package replitListEng;

/*
Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT :
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
 */

import java.util.ArrayList;
import java.util.List;

public class List_02 {
    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list=new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);

        }

        String eleman3=list.get(2);
        String eleman8=list.get(7);

        list.set(2, eleman8);
        list.set(7, eleman3);

        System.out.println(list);
    }
}
