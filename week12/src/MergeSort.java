
public class MergeSort {
	//Iteractive MergeSort 
    public static void mergeSort(int arr[])
    {
    	int n = arr.length;
        int size;
   
        int left;
                         
   
        for (size = 1; size <= n-1; size = 2*size)
        {
             

            for (left = 0; left < n-1; left += 2*size)
            {
               
                int mid = Math.min(left + size - 1, n-1);
   
                int right = Math.min(left+2*size - 1, n-1);
         
                merge(arr, left, mid, right);
            }
        }
    }
    static void merge(int arr[], int left, int mid, int r)
    {
        int i, j, k;
        
 
     
        /* temp arrays for right and left half */
        int [] Left = new int[mid - left + 1];
        int [] Right = new int[r - mid];
     
     
        for (i = 0; i < Left.length ; i++)
            Left[i] = arr[left + i];
        for (j = 0; j < Right.length ; j++)
            Right[j] = arr[mid + 1+ j];
     
    
        i = 0;
        j = 0;
        k = left;
        
        while (i < Left.length && j < Right.length)
        {
            if (Left[i] <= Right[j])
            {
                arr[k] = Left[i];
                i++;
            }
            else
            {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
     
        
        while (i < Left.length)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }
     
        
        while (j < Right.length)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }


}
