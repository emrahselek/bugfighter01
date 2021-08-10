package javaPractice;

public class Aug10New {

    public static void main(String[] args) {
/**
  	Q1) swap two numbers without creating and using a third variable??
		int a = 5;
		int b = 8;
*/
        //code
        int a = 5;
        int b = 8;
        System.out.println("a =" + a); //5
        System.out.println("b =" + b); //8
//                int temp = a;
//                a=b;
//                b=temp;
//
        a= a+b; //13
        b= a-b;
        a= a- b;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

/*
	Q2) Create 3 wrapper classes and print max and min values of the wrapper classes.
*/
        System.out.println("max value of Integer: "+Integer.MAX_VALUE);
        System.out.println("max value of Byte: "+Byte.MAX_VALUE);
        System.out.println("max value of Short: "+Short.MAX_VALUE);
        System.out.println("min value of Integer: "+Integer.MIN_VALUE);
        System.out.println("min value of Byte: "+Byte.MIN_VALUE);
        System.out.println("min value of Short: "+Short.MIN_VALUE);

	    
	    
 /*
    Q3)  a user should enter start and end number. create a loop to print even numbers from start to end
 */

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first and last number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 < num2) {

            for (int i = num1; i < num2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");

                }

            }
        }else{
            for (int i = num2; i <num1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");

                }

            }


        }
    

	    

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
