import java.util.Scanner;

public class waterMelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 System.out.println("Enter the number ");
			Scanner sc= new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num<=2) {
				System.out.println("no");
				return ;
			}
			
			if(num %2 == 0) {
				   System.out.println("yes");  
			}else {
				System.out.println("no ");
			}
	}

}
