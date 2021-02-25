package selection;

/* The logic of selection sort is we give an start index and then from that index to the end of the array , we find minimum
array index. Then we swap the values of the start index and minimum index. Similarly we again give startindex one more than
what we gave last time and get the minimum of that range of array. In this way we get the sorted array.
So, basically the concept is find the minimum and keep it at the first index, then again find the minimum of array range
leaving the first index and keep it in the second index. And so on....
 */
public class SelectionSortClass {
    static int a[] = new int[]{9,1,4,5};
    public static void main(String[] args) {
        for(int i = 0; i< a.length; i++) {System.out.print(a[i]+ " ");}
        selectionSort(a);
        System.out.println();
        for(int i = 0; i< a.length; i++) {System.out.print(a[i]+ " ");}
    }

    static void selectionSort(int a[]) {
        int tmp =0;
        int minindex = 0;
        for(int k = 0; k < a.length-1; k++) {
            minindex = getIndexOfMin(a, k);
            tmp = a[k];
            a[k] = a[minindex];
            a[minindex] = tmp;
        }
    }

    static int getIndexOfMin(int a[], int startIndex) {
        int min = startIndex;
        for(int i = startIndex+1; i < a.length; i++) {
            if(a[i] < a[min]) {
                min = i;
            }
        }
        return min;
    }
}

