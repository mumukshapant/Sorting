public class Quicksort {


    int pivot =0  ;

    public int partition(int[] arr, int start, int end)
    {

        pivot = arr[end];
        int i = start-1 ;

        for( int j = start; j<=end -1 ; j++)
        {
            if (arr[j] < pivot ) // swap using temp variable
            {
                i++ ;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return (i+1);

    }
    public int[] quicksort(int[] arr, int start , int end )
    {
        if(start < end )
        {
            pivot= partition(arr, start, end );
            quicksort(arr, start , pivot-1 );
            quicksort ( arr, pivot+1, end);
        }
        return arr;
    }
    public void printArray(int[] arr)
    {
        for (int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}
