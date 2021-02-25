public class FindMinElementArray {

     static int a[]= {5,0,9,4,3};
    public static void main(String[] args){
        //int a[]= {8,3,2,6,9,1};
        int m= methodMin(a,0);
        System.out.println("Minimum of array is " + a[m] );
    }



    static int methodMin(int a[], int startindex){
        int min=startindex;
        for (int i=startindex+1; i< a.length-1; i++){
          //  for (int i=startindex+1; i< a.length; i++){
            if(a[i]<a[min]){
                a[min]=a[i];
            }
        }
        return min;
    }
}
