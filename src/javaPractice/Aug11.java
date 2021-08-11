package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aug11 {
    public static void main(String[] args) {
        /**
    Q7)  Use arraylist to find missing numbers,
         [1, 3, 8, 4, 5, 10, 7, 2, 9, 6, 11, 14, 17, 16, 23, 18, 19, 20, 22, 15, 24, 25]
            (This step is done)

   Question  ==> add missing numbers back to arraylist

         */
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 21,12,13, 4, 5,7, 2, 9, 6, 11, 14, 17,
                16, 23, 18, 19, 20, 22, 15, 24, 25));

        for(int i=0; i<number.size();i++) {
            if(!number.contains(i)) {
                System.out.println(i);
                number.add(i);
            }
        }

        System.out.println(number);




        /**
   Q8)
        swap two array list

         */

        int [] a = {1,2,3,4,0};
        int [] b = {9,8,7,6,5};
        int [] temp = new int[a.length];

        System.out.println("temp brore swap "+ Arrays.toString(temp));
        System.out.println("a before swap "+Arrays.toString(a));
        System.out.println("b before swap "+Arrays.toString(b));

        for(int i = 0; i<a.length; i++) {
            temp[i]=a[i];
            a[i]=b[i];
            b[i]=temp[i];
        }

        System.out.println("temp after swap "+Arrays.toString(temp));
        System.out.println("a after swap "+Arrays.toString(a));
        System.out.println("b after swap "+Arrays.toString(b));


   /**
   Q9 )
        Write a program to find a factorial that entered by user. Eliminate mistakes that can be entered by user
    */


    }
}
