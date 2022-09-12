package Day2;

import java.util.*;

public class palindrome {
	public static void main(String[] args) {

		Scanner AZ = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String reverse = "";
		String num = AZ.nextLine();
		int length = num.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + num.charAt(i);
		if (num.equals(reverse))
			System.out.println("The entered string " + num + " is a palindrome.");
		else
			System.out.println("The entered string " + num + "  is not a palindrome.");
	}
}