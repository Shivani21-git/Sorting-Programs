package insertion;

// Mela program :-)

public class InsertionSortTest {

    static int a[] = {23, 87, 4, 01, 67, 43, 22};

    public static void main(String[] args) {
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("");
        insertionSort(a);
        for (int i : a)
            System.out.println(i);
    }

    public static void insertionSort(int a[]) {

        for (int i = 1; i < a.length; i++) {
            // temp= a[i];
            // int j;
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = 0;
                    temp= a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}

