// Using binary search , we search an element in a sorted array.
/* Logic - we first calculate the mid of entire array and then mid is compared with the element to search, if the element to search is
less than the mid then we will narrow down our range to the first half and we will follow the same thing again i.e we will find the mid of
first half range and then again we will see the same thing , we will repeat this until the element to search is found or we have got an empty
interval.
Similarly if the element to search is greater than mid then we will look into the second half and will follow the same thing again.
If element to search is equal to mid then hurray element found.
 */
public class BinarySearch {
    static int arr[] = {2, 3, 6, 8, 9, 10, 14, 18};
    static int elementtosearch = 18;

    public static void main(String... args) {

        findElement(0, 7, arr);
    }

    private static void findElement(int startindex, int endindex, int arr[]) {
        int mid = (startindex + endindex) / 2;
        while (arr[mid] != elementtosearch) {
            if (elementtosearch < arr[mid]) {
                mid = (startindex + (mid-1)) / 2;
                // mid = (left +(right-left))/2;
            } else {
                mid = ((mid+1) + endindex)/ 2;
            }
        }
        System.out.println("Element" + elementtosearch + " found at index" + mid);
    }
}
