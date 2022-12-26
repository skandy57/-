package level4_1차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 최댓값 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		
		int max = 0;

		int index = 0;
		int count=0;
		for (int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		for (int i : list) {
			count++;
			if (i > max) {
				max = i;
				index=count;
			}
			

		}
		
		System.out.println(max);
		System.out.println(index);
	}
}