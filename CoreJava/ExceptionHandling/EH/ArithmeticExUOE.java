package EH;

import java.util.Scanner;

public class ArithmeticExUOE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a = sc.nextInt();
		System.out.println("Enter The Second Number:");
		int b = sc.nextInt();
		
		try {
			if (b != 0) {
				int c = (a / b);
				System.out.println("Division of Two Numbers: " + c);
			} else
				throw new UnsupportedOperationException("Invalid operation Since it is Not Divisible by Zero");
		} catch (java.lang.UnsupportedOperationException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}