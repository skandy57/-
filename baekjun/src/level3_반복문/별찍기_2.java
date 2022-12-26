package level3_반복문;

import java.io.IOException;
import java.util.Scanner;

public class 별찍기_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner s = new Scanner(System.in);
		int line = s.nextInt();
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}