package replitForWhileTR;

/*
Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
 */

public class ForWhile_03 {
    public static void main(String[] args) {

        String str="Javaisalsoeasy";
        String output="";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {

            if(str.charAt(i)==str.charAt(j)) {
                count++;
             }
            }
            if (count>=1){
                if (!output.contains(str.substring(i,i+1))){
                    output+=str.charAt(i)+" ";
                }
            }
            count=0;
        }
        System.out.println(output);

    }
}
