/* Sorting is the process of arranging the elements of an array so that they can be placed either in ascending or
descending order. */
/* In bubble sort we check the first element of array with another , if first is greater than second we swap them or else dont swap,
likewise we check for all the elements . This is the first round. In the second round again we do the same thing. The rounds will
continue until the array is sorted(To let the method know that the array has been sorted, we are using flag)
 */
/* three different ways to read the input from Java Console, they are –

Using Java Bufferedreader Class
Scanner Class in Java
Console Class in Java */
/* In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by
getClass().getName() method on the object.
 */
/*Java array is an object which contains elements of a similar data type. Additionally,
The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements.
We can store only a fixed set of elements in a Java array.
 */

import java.util.Scanner;

public class BubbleSort {
   // static int a[] = {9,1,4,2,5,6};

    static void bubble(int a[]) {
      //Below is the optimized solution
        //The algorithm needs one whole pass without any swap to know it is sorted, which is why we use flag to make it optimized.
        //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
        int temp = 0;
       boolean flag = false;
        for (int round = 0; round <= a.length - 1; round++) {
            for (int i = 0; i < a.length - 1 - round; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    // Below is unoptimized solution
   /*     for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j < a.length-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
        } */


    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the length of the array to be sorted");
        int length = s.nextInt();
        int a[]= new int[length];
        System.out.println("Please enter the elements of array");
        for(int i=0;i<length;i++) {
             a[i] = s.nextInt();
        }
        System.out.println("Printing original array");
        for(int i:a)
            System.out.println(i);
        bubble(a);
        System.out.println("Printing sorted array");
        for(int i:a)
            System.out.println(i);


    }

}
