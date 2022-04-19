package replitListEng;

/*
Write a program to find the common elements between two
String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_06 {
    public static void main(String[] args) {
        List<String> input1=new ArrayList<>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));

        List<String> input2=new ArrayList<>(Arrays.asList("sofia","brad","grace","emily","hazel"));

        List<String> commonElements=new ArrayList<>();

        for (int i = 0; i <input2.size() ; i++) {
            for (int j = 0; j <input1.size() ; j++) {

                if (input2.get(i).equalsIgnoreCase(input1.get(j))){
                    commonElements.add(input2.get(i));
                }

            }

        }
        System.out.println(commonElements);

    }
}
