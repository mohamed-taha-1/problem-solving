import java.util.Scanner;

public class salary_increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n= new Scanner(System.in);
		
		System.out.println("Enter the bse salary ");
		double salary= n.nextDouble();
		
		if(salary >0 && salary<=400.00) {
			salary=salary+ (salary*15)/100;
		}
		
		System.out.println("slary = %.2f "+salary);
		
			
			

	}

}
