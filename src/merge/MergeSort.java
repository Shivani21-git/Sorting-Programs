package merge;

import java.util.Arrays;
/* Merge sort is one of the most popular and widely used technique. It is better as compared to bubble sort, selection sort
and insertion sort.
In merge sort, the arrays are divided into subarrays from mid until one element in each subarray.
After that we merge in either ascending or descending order.
 */
public class MergeSort {
    static int a[]={5,1,7,6,8,9,3,1,4};

    public static void main (String[] args)
    {
        for(int i : a)
            System.out.println(i);
        System.out.println("");
        split(a);
        for(int i : a)
            System.out.println(i);
    }

    public static void split(int a[])
    {

        if(a.length>1)
        {
           int mid = a.length/2;

           /* Here we are using java utility Arrays which has one method copyOfRange. This method takes parameter
           as the original array and range and creates array of the given range and returns.
            */
            int a1[]= Arrays.copyOfRange(a,0, mid);
            int a2[]= Arrays.copyOfRange(a, mid ,a.length);
           /*This is recursion that means method is calling itself.
           Methods gets memory in stack area, so whenever a new method is called , a new stack is created  for it.
           In recursion, method calls itself multiple times because of which multiple stacks are created which in results
           take a lot of memory (Memory allocated for each stack )
           Therefore, recursion is not a very good technique to use because it takes lot of memory.
            */
            split(a1);
            split(a2);
            merge(a,a1,a2);
        }
    }
    public static void merge(int a[], int a1[], int a2[])
   {
       int i=0;
       int j=0;
       int k=0;
      /* Here we are comparing the elements of a1 and a2, whoever is smaller , we are putting it to the original array
      and also incrementing the indexes or original array and a1 or a2
       */
       while(i <a1.length && j <a2.length) {
           if (a1[i] < a2[j]) {
               a[k] = a1[i];
               i++;
           } else {
               a[k] = a2[j];
               j++;
           }
           k++;
       }
       /* Now, whatever is remaining in a1, we are just keeping it in the original array. Also, incrementing the index of both
       a1 and original array.
        */

       while (i<a1.length) {
           a[k] = a1[i];
           i++;
           k++;
       }
       /* Now, whatever is remaining in a2, we are just keeping it in the original array.Also, incrementing the index of both
        a2 and original array.
        */
       while (j<a2.length) {
           a[k] = a2[j];
           j++;
           k++;
       }

   }


}
