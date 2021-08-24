package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Aug24 {
    public static void main(String[] args) {

        /*
        NOTE :  Converting String to ArrayList
                String str="surhay";
                String []splite= str.split("");
                List<String> list= Arrays.asList(splite);

         */
        //--------------------------------------------------------------------------------------------

        /**
         Q-18
         "Enter a word, and print not repeated characters.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word...");
        String str = scan.next();

        String container = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                container += str.charAt(i);
//				container.concat(str.charAt(i)); --> we will check usage of .concat()
            }
        }
        System.out.println(container);

        //--------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------
        /**
         Q-20
         Check how many words are there in the sentence that entered by user.
         print how many words and characters are used (exclude spaces for characters)
         If the word number is less than 10 words, print on the console "Your essay doesn't have enough words"
         if the word is more or equal to 10 words print "You can submit your essay"
         */
        System.out.println("Enter a sentence");

        String sentence = scan.nextLine().toLowerCase();

        String word[] = sentence.replaceAll("\\p{Punct}", "").split(" ");
        String chars[] = sentence.replaceAll(" ", "").split("");
        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.toString(chars));
        System.out.println("your essay have " + word.length + " words and " + chars.length + " characters...");

        if (word.length < 10) {
            System.out.println("Your essay doesn't have enough words");
        } else {
            System.out.println("You can submit your essay");
        }




    }
}

