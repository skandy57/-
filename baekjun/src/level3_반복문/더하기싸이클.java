package level3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기싸이클 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int new_num = N;

		while (true) {
			int first_num = new_num / 10;
			int second_num = new_num % 10;
			int sum = first_num + second_num;
			new_num = (second_num * 10) + (sum % 10);
			count++;
			if (new_num == N) {
				break;
			}
		}

		System.out.println(count);
	}
}