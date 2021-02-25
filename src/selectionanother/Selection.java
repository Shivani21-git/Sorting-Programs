package selectionanother;
/* In selection sort, the entire array is considered as unsorted  and then the minimum of this array is found ,  the
minimum is kept at the first index. This is the first round.
In the second round, the elements excluding first index is considered as unsorted array. minimum element
of this unsorted array is found and kept at first index of this unsorted array(i.e 2nd index of actual array).
This goes on until the array is sorted.
 */

/*
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 */
public class Selection {
    static int a[] = new int[]{23, 67, 5, 55};
    public static void main(String[] args) {
        for(int i = 0; i< a.length; i++) {System.out.print(a[i]+ " ");}
        selectionSort(a);
        System.out.println();
        for(int i = 0; i< a.length; i++) {System.out.print(a[i]+ " ");}
    }
 // This method swaps the minimum index value with the element at startindex.
    static void selectionSort(int a[]) {
        int tmp =0;
        int minindex = 0;
        for(int k = 0; k < a.length; k++) {
            minindex = getIndexOfMin(a, k);
            tmp = a[k];
            a[k] = a[minindex];
            a[minindex] = tmp;
        }
    }
 //This method takes the array and startindex as input and returns the minimum index of array.
    static int getIndexOfMin(int a[], int startIndex) {
        int min = startIndex;
        for(int i = startIndex; i < a.length-1; i++) {
            if(a[min] > a[i+1]) {
                min = i+1;
            }
        }
        return min;
    }
}
