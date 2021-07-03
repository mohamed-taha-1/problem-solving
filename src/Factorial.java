import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("number : ");
		Scanner sc = new Scanner (System.in);
		int fact= sc.nextInt();
		int factorial=1;
		
		for (int i =1 ; i<=fact;i++) {
		   factorial= factorial*i;
		
		}
		
		if(factorial %2==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		   
	}

}
