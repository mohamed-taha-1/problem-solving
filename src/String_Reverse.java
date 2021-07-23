import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the string ");
		Scanner in =new Scanner(System.in);
		String s1=in.nextLine();
		int length=s1.length();
		for(int i=length-1;i>=0;i--) {
			System.out.print(s1.charAt(i));

		}
		
	}

}
