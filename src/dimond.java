import java.util.Scanner;

public class dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,n,space=1;
		
		Scanner in=new Scanner(System.in);
		System.out.print(" enter the number of rows  :    ");
		n=in.nextInt();
		space=n-1;
		for(j=1;j<=n;j++) {
			for(i=1;i<=space;i++) {
				System.out.print(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		space=1;
		for(j=1;j<=n-1;j++) {
			for(i=1;i<=space;i++) {
				System.out.print(" ");
			}
			space--;
			for(i=1;i<=2*(n-j)-1;i++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		

	}

}
