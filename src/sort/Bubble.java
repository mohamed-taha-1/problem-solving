package sort;


/**
 * 
 * @author r
 *
 */


/**
 * 
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
  * Auxiliary Space: O(1)
 *
 */

public class Bubble {
	
	void sortBubble(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			
		
			
			for(int j=0;j<n-i-1;j++) {  
				
				
				/***   n-i-1      علشان كل لفه بتسكب عدد معين من العناصر مش هتلف عليهم  */
				
				
				if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
			
		
		}	
	}
	
	 /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    
    
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bubble bs=new Bubble();
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		 bs.sortBubble(arr);
		 bs.printArray(arr);
	}

}
