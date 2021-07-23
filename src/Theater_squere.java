
import java.util.Scanner;
import java.lang.Math;


public class Theater_squere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the 1 numbers ");
		long m= s.nextInt();
		System.out.println("Enter the 2 numbers ");
		long n= s.nextInt();
		System.out.println("Enter the 3 numbers ");
		long a= s.nextInt();
		
		/***  finish the input phase ***/
		
	  long countum=m/a;
	  long countun=n/a;
	  
	  if(n%a!=0) {
		  ++countun;
	  }
	  if(m%a!=0) {
		  ++countum;
	  }
	  
		System.out.println("  the result "+countun*countum);
		
	
		

	}

}
