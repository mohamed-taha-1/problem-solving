package array_Problems;

import java.util.*;

public class Products_of_All_Elements_Except_itself {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		int n=in.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
	      System.out.print("Element "+i+":  ");		
		  arr[i]=in.nextInt();
		}
		
		
		int total=1;
		for (int i=0;i<n;i++) {
			total*=arr[i];
		}
		
		
		for (int i=0;i<n;i++) {
			
			  System.out.print((total/arr[i])+" ");
			
	 
	  }
		
		
	
		
		
		
		
		

		
		
	}

}
