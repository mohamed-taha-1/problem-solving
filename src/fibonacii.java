import java.util.Scanner;

public class fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the size of the series ");
		int n=in.nextInt();
		int t2=1,t1=0;
	while (t1<=n) {
			
			System.out.print(t1+"  " );
			
			sum=t1 +t2;
			
			
			t1=t2;
			t2=sum;
			
		}

	}

}
