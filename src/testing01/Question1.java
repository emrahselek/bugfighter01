package testing01;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers to find even numbers between them ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

       int start= Math.min(num1, num2);
       int end= Math.max(num1, num2);
       for (int i=start; i<=end; i++)
           if (i % 2 == 0) {
               System.out.print(i + " ");
           }else{
               System.out.println("there is not any even number");
           }

    }
}
