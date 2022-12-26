package level3_반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class AplusBminus5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> sums = new ArrayList<>();
		int cnt = 0;
		while (true) {

			String[] nums = s.nextLine().split(" ");
			int num1 = Integer.parseInt(nums[0]);
			int num2 = Integer.parseInt(nums[1]);
			int sum = num1 + num2;

			if (sum == 0) {
				break;
			}
			sums.add(cnt, sum);
			cnt++;
		}
		sums.forEach(item -> System.out.println(item));
	}

}
