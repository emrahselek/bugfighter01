package javaPractice;

public class _Aug10 {
    public static void main(String[] args) {
/*
  	Q1) swap two numbers without creating and using a third variable??
		int a = 5;
		int b = 8;
*/
		//code
        int a=5;
        int b=8;
        System.out.println(a +" "+ b);

        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a +" "+ b);




/**
	Q2) Create 3 wrapper classes and print max and min values of the wrapper classes.

*/
		//code
        Integer i=3030;
        Short s=10;
        Double d=557.5;
        long l=101054646;
        Long lx=(long)12541;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(i.MAX_VALUE);
        System.out.println(s.MAX_VALUE);
        System.out.println(s.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(lx.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);



 /*
    Q3)  a user should enter start and end number. create a loop to print even numbers from start to end
 */



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
		//code



/*

	Q6)  from 1 to 25 but 3 numbers are missing

	[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 14, 17, 16, 23, 18, 19, 20, 22, 15, 24, 25]
		use different algorithm from the previous question
*/
        //code


    }
}
