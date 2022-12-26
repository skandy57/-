package level3_반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class AplusBminus4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> sums = new ArrayList<>();
		while (s.hasNextInt()) { // infinite loop that ends when there is no more input
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int sum = num1 + num2;

			if (num1 == 0 && num2 == 0) {
				break; // exit the loop if both numbers are 0
			}

			sums.add(sum);
		}
		sums.forEach(item -> System.out.println(item));
	}
}