import java.util.Arrays;

public class kLargestElement {

    private Quicksort qs;

    public int kMaxElement(int [] arr, int k )
    {

        int n = arr.length;
//        qs.quicksort(arr, 0 ,n );
        Arrays.sort(arr);
        for(int i= n-1 ; i>=0 ; i--)
        {
            System.out.println("k largest element "+ arr[n-k]);
            return arr[n-k];
        }

        return -1;
    }
}
