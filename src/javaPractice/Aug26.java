package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aug26 {
    public static void main(String[] args) {
        /**
         Q-22)

         Show on the console one word as it is, and next word as reversed
         EXAMPLE
         String = "SQL takes time to learn, but it is useful software."
                =SQL sekat time ot learn, tub it si useful erawtfos.
         */
        String str= "SQL takes time to learn, but it is useful software.";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String rts = "";
        String word = "";
        String qwert="";


        for(int i=0; i<arr.length; i++) {
            if(i%2==0) {
                rts=rts+" "+arr[i];
            }else {
                qwert= arr[i];

                for(int j=qwert.length()-1; j>=0; j--) {

                    word =word+qwert.charAt(j);
                }
                rts=rts+" "+word;
                word="";
            }
        }
        System.out.println(rts);
/*

        String str = "SQL takes time to learn, but it is useful software.";
        List<String> wordList = new ArrayList<>(Arrays.asList(str.split(" ")));

        String a = "";
        String m = "";

        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (i % 2 == 1) {
                m = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    m = m + word.charAt(j);
                }
                a += " " + m;

            } else {
                a += " " + word;
            }
        }

        System.out.println(a);
*/

        /**
         Q-23)
         String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
         write a program to count "java"
         */



        /**
         Q-24)
         String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
         How many times each word is used in the String.
         */
    }
}
