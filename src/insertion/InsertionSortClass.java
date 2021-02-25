package insertion;

/* Insertion is good for small number of elements only because it requires more time for sorting large number of elements.
In insertion sort, the element at index 1 is compared with element at index 0,if the element at 1 is smaller , they are swaped.
This is the first round.
In the second round, the index is increased by 1, i.e element at index 2 is compared with the element at index 1,if smaller then
swapped.Now the element at index 1(element which was at index 2 originally) is compared with element at index 0, if smaller then
swapped.This is the second round.
This goes on until the element is sorted.
So, basically there are two loops in insertion sort, outer and inner. Outer one is increasing and inner one is decreasing.
 */

/*
 Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
 */
/*
The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
 */
public class InsertionSortClass {

    static int a[] = {5,2,1,9,8,7};

    public static void main (String[] args)
    {
        for(int i : a)
        {
            System.out.println(i);
        }
        System.out.println("");
        insertionSort(a);
        for(int i : a)
            System.out.println(i);
    }

    public static void insertionSort(int a[])
    {
        int temp=0;
        for(int i=1; i<a.length ; i++)
        {
            temp= a[i];
            int j;
            for(j=i-1; (j>=0 && a[j]>temp); j--)
            {
                a[j+1]=a[j];
            }
            a[j+1] = temp;
        }
    }

}
