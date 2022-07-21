package compare;

import java.util.Scanner;

public class CompareAB_Ifelse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		if((A <= -10000 || A >= 10000) || B <= -10000 || B >= 10000) {
			System.out.println("error");
		} else if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
