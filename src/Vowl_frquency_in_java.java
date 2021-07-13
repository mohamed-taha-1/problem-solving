import java.util.Scanner;
public class Vowl_frquency_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str;
		// array is always initialized with zeros
		int cnt[] = new int[5];

		System.out.print("Enter String: ");
		// reading input string
		str = sc.nextLine();

		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				cnt[0]++;
			}
			if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
				cnt[1]++;
			}
			if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
				cnt[2]++;
			}
			if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				cnt[3]++;
			}
			if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				cnt[4]++;
			}
		}

		System.out.println("Number of 'a' = " + cnt[0]);
		System.out.println("Number of 'e' = " + cnt[1]);
		System.out.println("Number of 'i' = " + cnt[2]);
		System.out.println("Number of 'o' = " + cnt[3]);
		System.out.println("Number of 'u' = " + cnt[4]);
	}

}
