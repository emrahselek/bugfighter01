package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class _Aug10 {
    public static void main(String[] args) {
/*
  	Q1) swap two numbers without creating and using a third variable?
		int a = 5;
		int b = 8;
*/
        //code
//        int a = 5;
//        int b = 8;
//        System.out.println("a =" + a); //5
//        System.out.println("b =" + b); //8
//                int temp = a;
//                a=b;
//                b=temp;
//
//        a= a+b; //13
//        b= a-b;
//        a= a- b;
//       System.out.println("a =" + a);
//       System.out.println("b =" + b);

/*
	Q2) Create 3 wrapper classes and print max and min values of the wrapper classes.

*/
//        Integer num1 =45;
//        Short num2 ;
//        Byte num3 ;
//
//        System.out.println(num1.MAX_VALUE);
//        System.out.println(num1.MIN_VALUE);


 /*
    Q3)  a user should enter start and end number. create a loop to print even numbers from start to end
 */
     //   Scanner scanner = new Scanner(System.in);


 /*
    Q4)  copy q3 solutions to q4, and add a new feature
            from Q3 ==> count from start to end and print even numbers, (this part is done)

            Count from end to start and print odd numbers.
 */




/*
	Q5)
	How to find the missing number in integer array of 1 to 25?

	Note:
	You have given an integer array which contains numbers from 1 to 25 but one number is missing,
	you need to write a Java program to find that missing number in an array.
	[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 12, 14, 17, 16, 23, 18, 19, 20, 21, 22, 15, 24, 25]

*/
        int arr[] = {1, 3, 8, 4, 5, 10, 9, 6, 11, 12, 14, 17, 16, 23, 18, 19, 20, 21, 22, 15, 24, 25};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for(int i=1; i<26; i++) {
            int newA = Arrays.binarySearch(arr, i);
            if(newA<0) {
                System.out.print(i+" ");
            }

        }
    }

}


/*

	Q6)  from 1 to 25 but 3 numbers are missing

	[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 14, 17, 16, 23, 18, 19, 20, 22, 15, 24, 25]
		use different algorithm from the previous question
*/
        //code




