package javaPractice;

import java.util.Scanner;

public class Aug25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//------------------------------------------------------------------------------------
        /**
         Q-22
         Ask use to enter firstname and lastname under given conditions;

         1)If user uses space characters at the beginning or at the end remove them.
         2)If user enters nothing or just space character, give a message like
         "Just space characters or nothing is not valid"
         3)If user does not use space character between first and last name
         give a message like "One of the lastname and first name is not entered
         or space is not used between firstname and lastname"
         4)If user uses multiple space characters between firstname and lastname
         make it single
         5)Initials of firstname and lastname should be uppercase,
         other characters should be lowercases.
         If user does not enter the name in this format fix it.

         */


        System.out.println("Enter your firstname and your lastname");

        String fullName = scan.nextLine();
      //SECTION 1
        fullName = fullName.trim();
        System.out.println(fullName);

     //SECTION 2
        if (fullName.isBlank()) {
            System.out.println("Just space characters or nothing is not valid");
        }

    //SECTION 3
        if (!fullName.contains(" ")) {
            System.out.println("One of the lastname and first name is not entered  or space is not used between firstname and lastname");
        }

      // TO BE CONTINUED


        //------------------------------------------------------------------------------------
        /**
         Q-21
         Ask user to enter a password
         If the password  is "Apple1234" show user secret message as "Mission Complete- Find Spider-Man and punish him"
         If the password is wrong reverse the password in the system to make user to find it harder. Print on the console "The password is wrong, and changed"
         To see what is the new password print it.

         */


        /**
            String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
         write a program to count "java"

         */



        /**
         String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
       How many times each word is used in the String.

         */

    }


}
