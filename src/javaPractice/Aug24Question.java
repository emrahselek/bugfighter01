

package javaPractice;

import java.util.Scanner;


/**
 Q-19
 Check if the word or sentence is Palindrome. The String will be entered by user
 Example ==> "radar" is palindrome
 print on the console "the word is palindrome or not"
 create a String method, and return type is String, and call the String method in the main method.
 */
public class Aug24Question {
    public static void main(String[] args) {
      isPlaindrome(scanner());

    }


    public static String scanner() {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter your input String: ");
        String  str1=scan.nextLine().toLowerCase();
        return str1;
    }


    public static String isPlaindrome(String str) {
        String result="";
        for(int i=str.length()-1;i>=0;i--) {
            result+=str.charAt(i);
        }

        if(result.equals(str)) {
            System.out.println(str+ " is palindrome");

        } else {
            System.out.println(str + " is not palindrome");
        }

        return result;

    }
}
