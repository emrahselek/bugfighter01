package javaPractice;

import java.util.*;

public class Aug19 {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------------

        /**
        Q-17
        remove duplicated characters from the String that is entered by user
        example : bananas ==> bans
        create a String method, and return type is String, and call the String method in the main method.

         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter a String...");
//        String str = scanner.next().toLowerCase();
        //1st way:
//        String cont="";
//        for(int i=0; i<str.length(); i++){
//
//                if(!cont.contains(str.substring(i,i+1))){
//                    cont = cont + str.charAt(i);
//                }
//            }
//        System.out.println(cont);

        //2nd way:
//        List<Character> list1 = new ArrayList<>();
//        for(int i=0; i<str.length(); i++){
//            if(!list1.contains(str.charAt(i))){
//                list1.add(str.charAt(i));
//            }
//        }
//        System.out.println(list1);

        //3rd way:
//        String  arr[]=str.split("");
//        String str1="";
//        for (int i=0; i<arr.length; i++){
//             if (!str1.contains(arr[i])){
//                str1=str1+arr[i];
//             }
//        }
//        System.out.println(str1);

//--------------------------------------------------------------------------------------------

        /**
         Q-18
         Check if the word or sentence is Palindrome. The String will be entered by user
         Example ==> "radar" is palindrome
         print on the console "the word is palindrome or not"
         create a String method, and return type is String, and call the String method in the main method.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string to find palindrome or not...");
//        String str = scanner.nextLine().toLowerCase();
//
//        String reversestr = "";
//        for(int i=str.length()-1; i>=0; i--)
//            reversestr+=str.charAt(i);
//        if(str.equals(reversestr)){
//            System.out.println(str+" is palindrom...");
//        }else {
//            System.out.println(str+" is not palindrom....");
//        }

//--------------------------------------------------------------------------------------
        /**
        Q-19
        Check how many words are there in the sentence that entered by user.
         print how many words and characters are used (exclude spaces for characters)
         If the word number is less than 10 words, print on the console "Your essay doesn't have enough words"
         if the word is more or equal to 10 words print "You can submit your essay"
        */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your essay here.....");
//        String essay = scanner.nextLine();
//
//        String chars [] = essay.split("");
//        String words [] = essay.split(" ");
//
//        System.out.println("Your essay have "+chars.length+" characters and "+words.length+" words...");
//        if(words.length>9){
//            System.out.println("You can submit your essay..");
//        }else{
//            System.out.println("Your essay doesn't have enough words...");
//        }

//------------------------------------------------------------------------------------


        /**
         Q-19
		 Ask user to enter firstname and lastname under given conditions;

            1)If user uses space characters at the beginning or at the end remove them.
            2)If user enters nothing or just space character, give a message like
              "Just space characters or nothing is not valid"
            3)If user does not use space character between first and last name
              give a message like "One of the lastname and first name is not entered
              or space is not used between firstname and lastname"
            4)If user uses multiple space characters between firstname and lastname
              make it single
            5)Initials of firstname and lastname should be uppercase,
              other characters should be lowercase.
              If user does not enter the name in this format fix it.

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and last name....");
        String name = scanner.nextLine();

        //1st section:
        String name1 = name.trim();
        System.out.println("Original: "+name);
        System.out.println("Trim: "+name1);

        //2nd section:
        if(name.isBlank())
            System.out.println("Just space characters or nothing is not valid");

        //3rd section:
        if(!name1.contains(" "))
            System.out.println("One of the lastname and first name is not entered or space is not used between firstname and lastname");

        //4rd section:
       String nameMiddle = name1.substring(0,name1.indexOf(" "))+ name1.substring(name1.lastIndexOf(" "));
        System.out.println("Middle: "+nameMiddle);

        //5th section:
        String nameFinal = nameMiddle.substring(0, 1).toUpperCase()+
                           nameMiddle.substring(1, nameMiddle.indexOf(" ")).toLowerCase()+
                           nameMiddle.substring(nameMiddle.indexOf(" "),nameMiddle.indexOf(" ")+2).toUpperCase()+
                           nameMiddle.substring(nameMiddle.indexOf(" ")+2).toLowerCase();
        /*
        String nameFinal = name1.substring(0, 1).toUpperCase()+
                           name1.substring(1, name1.indexOf(" ")).toLowerCase()+
                           name1.substring(name1.lastIndexOf(" "),name1.lastIndexOf(" ")+2).toUpperCase()+
                           name1.substring(name1.lastIndexOf(" ")+2).toLowerCase();
         */
       System.out.println("Final: "+nameFinal);


}}
