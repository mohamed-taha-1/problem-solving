import java.util.Scanner;

public class plaindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		System.out.println("Eneter the String ");
		String s= in.nextLine();
		
		int length= s.length();
		
		for(int i=0;i<length ;i++) {
			
			if(s.charAt(0) !=s.charAt(length-1)) {
				System.out.println(" it is not plain dorm ");
				break;
			}else {
				System.out.println("it is plaindrom ");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
