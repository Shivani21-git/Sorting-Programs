package selectionanother;

public class BinarySearchTest {
    static int arr[] = {2, 3, 6, 8, 9, 10, 14, 18};
    static int elementtosearch = 10;

    public static void main(String... args) {

        findElement(0, 7, arr);
    }

    private static void findElement(int startindex, int endindex, int arr[]) {
        int mid = startindex+((endindex-startindex) / 2);
        if (elementtosearch > arr[mid]) {
            findElement(mid + 1, endindex, arr);
        } else if (elementtosearch < arr[mid]) {
            findElement(startindex, mid - 1, arr);
        } else if (elementtosearch == arr[mid]) {
            System.out.println("Element found at index " + mid + " element is " + arr[mid]);
        }
    }
}