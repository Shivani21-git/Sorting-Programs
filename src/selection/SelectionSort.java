package selection;

public class SelectionSort{
        static int a[] = {6, 2, 3, 7, 4, 9, 8};


        public static void main(String[] args) {
            System.out.println("Printing original array");
            for(int i : a) {
                System.out.println(i + " ");
            }
            selectionSort(a);
            for(int i : a) {
                System.out.println(i);
            }

        }

        static void selectionSort(int a[]){
            int m;
            int temp = 0;

            for (int i = 0; i < a.length - 1; i++) {
                m = getIndexOfMin(a, i);
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }

        }

        static int getIndexOfMin(int a[], int startindex){
            int min=startindex;
            for (int i=startindex; i< a.length-1; i++){
                if(a[min]>a[i+1]){
                    min=i+1;
                }
            }
            return min;
        }
    }



