package level3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AplusBminus7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int count =Integer.parseInt(b.readLine());

		// 각각의 덧셈값을 저장할 배열을 선언합니다.
		int[] sums = new int[count];
		int cnt1=1;
		// 반복할 횟수만큼 입력을 받고, 각각의 덧셈값을 배열에 저장합니다.
		for (int i = 0; i < count; i++) {
			String []nums=b.readLine().split(" ");
			int num1 = Integer.parseInt(nums[0]);
			int num2 = Integer.parseInt(nums[1]);
			int sum = num1 + num2; // 각각의 두 정수의 합을 저장합니다.
			sums[i] = sum; // 각각의 합을 배열에 저장합니다.
		}
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		// 전체 입력을 완료한 후 각각의 덧셈값을 출력합니다.
		for (int sum : sums) {
			
			bw.write("Case #"+cnt1+": "+sum+"\n");
			cnt1++;
		}
		bw.flush();
		
	}
}