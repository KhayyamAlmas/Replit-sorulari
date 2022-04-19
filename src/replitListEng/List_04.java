package replitListEng;

/*
Write a program that deletes the letters 'a' from the names in the list given as input.

INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}

OUTPUT : [Veli,Omer]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_04 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> list2 = new ArrayList<>();
        for (String w:list1){
            if (!w.toLowerCase().contains("a")){
                list2.add(w);
            }
        }

        System.out.println(list2);
    }
}
