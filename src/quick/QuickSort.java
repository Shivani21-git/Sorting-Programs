package quick;

/* In quick sort, first we select mid element as pivot and then we select low and high. After that, we assign low as i
and high as j, We run a loop, element at i is compared with pivot element, if it is less than pivot then we increase
the value of i else dont increase. Also, element at j is compared with pivot element, if it is greater then value of j
is increased, if not then dont increase. The loop stops when value of i is greater than j. The element of i which
is greater than pivot and the element of j which is less than pivot, both the elements are swapped. After this
recursion happens. And the same thing is followed until the array is sorted.
*/
/*
Like Merge Sort, QuickSort is a Divide and Conquer algorithm
 */

public class QuickSort {
    static int a[] = {1,5,3,6,7,2,3};

    public static void main(String[] args) {
        System.out.println("Printing original array");
        for (int i : a) {
            System.out.println(i);
        }
        quickSort(0, a.length - 1);
        System.out.println("Printing original array");
        for (int i : a) {
            System.out.println(i);
        }

    }

     static void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[low + (high - low) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }
}
