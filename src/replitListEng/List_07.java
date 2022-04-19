package replitListEng;

/*
write a Java program to removes a specific element froman array
and put the remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_07 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        int element=6;

        List<Integer> newList=new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if (element!= list.get(i)){

                newList.add(list.get(i));

            }

        }
        System.out.println(newList);
    }
}
