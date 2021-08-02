package array_Problems;

import java.util.*;

public class Find_Second_Maximum_Value {

	
	static void print2largest(int arr[],int arr_size)
	{
		int i, first, second;
		
		// There should be
		// atleast two elements
		if (arr_size < 2)
		{
		System.out.printf(" Invalid Input ");
		return;
		}
		
		// Sort the array
		Arrays.sort(arr);
		
		// Start from second last element
		// as the largest element is at last
		for (i = arr_size - 2; i >= 0; i--)
		{
		// If the element is not
		// equal to largest element
		if (arr[i] != arr[arr_size - 1])
		{
		System.out.printf("The second largest " + "element is :  %d\n", arr[i]);
		return;
		}
	}

     System.out.printf("There is no second " + "largest element\n");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 35, 1, 10, 34, 1};
		  int n = arr.length;
		  print2largest(arr, n);
	}

}
