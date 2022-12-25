package level1_입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		int A = s1.nextInt();
		int B = s1.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

	}
}