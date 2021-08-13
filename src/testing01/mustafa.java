package testing01;

public class mustafa {

    public static void main(String[] args) {
        System.out.println("Bugun team1 olarak birlikte calisiyoruz");


/*
  	Q1) swap two numbers without creating and using a third variable??
		int a = 5;
		int b = 8;
*/
        int a = 5;
        int b = 8;
        int temp = 0;

        temp = b;
        b = a ;
        a= temp;


        System.out.println("Before change a : " + a);
        System.out.println("Before change b : " + b);

        System.out.println("After change a : " + a);
        System.out.println("After change b : " + b);




/*
	Q2) Create 3 wrapper classes and print max and min values of the wrapper classes.

int a1 = 15;
		        Integer a2 =15;

		        		System.out.println(a2.MAX_VALUE); //2147483647
		        		System.out.println(a2.MIN_VALUE); // -2147483648
		        		System.out.println(a2.SIZE); // 32
		        		System.out.println(a2.hashCode()); //15
		        		System.out.println(a2.shortValue()); //15
		        		System.out.println(a2.TYPE); //int

*/
        //code

 /*
    Q3)  a user should enter start and end number. create a loop to print even numbers from start to end

    Scanner scan = new Scanner(System.in);
		        		System.out.println("Enter a start and end number ");

		        		int start = scan.nextInt();
		        		int end = scan.nextInt();

		        		for(int i = start; i <= end; i++) {
		        			System.out.print(i + " "); //
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



/*
		How to find the missing number in integer array of 1 to 25?
​
				Note:
				You have given an integer array which contains numbers from 1 to 25 but one number is missing,
				you need to write a Java program to find that missing number in an array.
				[1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 12, 14, 17, 16, 23, 18, 19, 20, 21, 22, 15, 24, 25]
    	*/



        int arr[] = {1, 3, 8, 4, 5, 7, 10, 2, 12, 6, 11, 14, 17, 16, 9, 23, 18, 19, 20, 22, 15, 24,25};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i =1 ; i<26 ; i++) {
            if(i!=arr[i-1]) {
                System.out.print(i +" ");
                break;
            }
        }
    }
}
