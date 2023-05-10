public class Main {
    public static void main(String[] args)
    {
        Quicksort obj = new Quicksort() ;
        int[] arr = {3,2,1,5,6,4};
        int n = arr.length-1;

        obj.quicksort(arr, 0, n) ;
        obj.printArray(arr);
    }
}