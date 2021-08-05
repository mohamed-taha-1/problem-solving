package array_Problems;

public class Re_arrange_Positiive_and_negative {
	
	
	
	static void RearrangePosNeg(int arr[], int n)
    {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
 
            // if current element is positive
            // do nothing
            if (key > 0)
                continue;
 
            /* if current element is negative,
            shift positive elements of arr[0..i-1],
            to one position to their right */
            j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
 
            // Put negative element at its right position
            arr[j + 1] = key;
        }
    }

	
	
	// alternative method 
	 static void rearrange(int arr[], int n)
	    {
	        int i = -1, temp = 0;
	        for (int j = 0; j < n; j++)
	        {
	            if (arr[j] < 0)
	            {
	                i++;
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        int pos = i+1, neg = 0;
	 
	        // Increment the negative index by 2 and positive index by 1, i.e.,
	        // swap every alternate negative number with next positive number
	        while (pos < n && neg < pos && arr[neg] < 0)
	        {
	            temp = arr[neg];
	            arr[neg] = arr[pos];
	            arr[pos] = temp;
	            pos++;
	            neg += 2;
	        }
	    }
	 
	    // A utility function to print an array
	    static void printArray(int arr[], int n)
	    {
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + "   ");
	    }
	 
	    /*Driver function to check for above functions*/
	    public static void main (String[] args)
	    {
	        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
	        int n = arr.length;
	        rearrange(arr,n);
	        System.out.println("Array after rearranging: ");
	        printArray(arr,n);
	    }

}
