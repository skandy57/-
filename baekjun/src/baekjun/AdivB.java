package baekjun;

import java.util.Scanner;

public class AdivB {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		int A = s1.nextInt();
		double B = s1.nextInt();
		
		System.out.printf("%.15f",A / B);

	}
}