package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class _Aug10 {
    public static void main(String[] args) {
/**
  	Q1) swap two numbers without creating and using a third variable?
		int a = 5;
		int b = 8;
*/
		//code
//        int a = 5;
//        int b = 8;
//        System.out.println("a =" + a); //5
//        System.out.println("b =" + b); //8
////                int temp = a;
////                a=b;
////                b=temp;
////
//        a= a+b; //13
//        b= a-b;
//        a= a- b;
//        System.out.println("a =" + a);
//        System.out.println("b =" + b);


/**
	Q2) Create 3 wrapper classes and print max and min values of the wrapper classes.

*/

		//code


//        System.out.println("max value of Integer: "+Integer.MAX_VALUE);
//        System.out.println("max value of Byte: "+Byte.MAX_VALUE);
//        System.out.println("max value of Short: "+Short.MAX_VALUE);
//        System.out.println("min value of Integer: "+Integer.MIN_VALUE);
//        System.out.println("min value of Byte: "+Byte.MIN_VALUE);
//        System.out.println("min value of Short: "+Short.MIN_VALUE);


 /**
    Q3)  a user should enter start and end number. create a loop to print even numbers from start to end
 */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter start and end numbers to print even number between your enteries");
//        int num1=scanner.nextInt();
//        int num2=scanner.nextInt();
//if (num1<num2){
// for(int i=num1; i<num2; i++){
//     if(i%2==0){
//         System.out.print(i+" ");
//     }
//
// }
//}else if (num2<num1){
//    for(int i=num2; i<num1; i++){
//        if(i%2==0){
//            System.out.print(i+" ");
//        }}
//}else {
//    System.out.println(num1%2==0?num1:"There is no even number");
//}


 /**
    Q4)  copy q3 solutions to q4, and add a new feature
            from Q3 ==> count from start to end and print even numbers, (this part is done)

            Count from end to start and print odd numbers.
 */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter start and end numbers to print odd number between your enteries");
//        int num1=scanner.nextInt();
//        int num2=scanner.nextInt();
//        if (num1<num2){
//            for(int i=num2; i>num1; i--){
//                if(i%2==1){
//                    System.out.print(i+" ");
//                }
//
//            }
//        }else if (num2<num1){
//            for(int i=num1; i>num2; i--){
//                if(i%2==1){
//                    System.out.print(i+" ");
//                }}
//        }else {
//            System.out.println(num1%2==1?num1:"There is no odd number");
//        }



/**
	Q5)
	How to find the missing number in integer array of 1 to 25?

	Note:
	You have given an integer array which contains numbers from 1 to 25 but one number is missing,
	you need to write a Java program to find that missing number in an array.
	[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 12, 14, 17, 16, 23, 18, 19, 20, 21, 22, 15, 24, 25]

*/
		//code
        int arr[] = {1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 12, 14, 17, 16, 23, 18, 19, 20, 21, 22, 15, 24, 25};


        Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

        for(int i=1; i<=25; i++) {
            int newA = Arrays.binarySearch(arr, i);

            if(newA <0) {
                System.out.println(i);
            }
        }




/**

	Q6)  from 1 to 25 but 3 numbers are missing

	[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 14, 17, 16, 23, 18, 19, 20, 22, 15, 24, 25]
		use different algorithm from the previous question
*/
        //code


    }
}
