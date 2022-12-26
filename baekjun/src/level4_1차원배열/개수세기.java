package level4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 개수세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int gatsu = Integer.parseInt(br.readLine());
		for (String str : br.readLine().split(" ")) {
			list.add(Integer.parseInt(str));
		}
		int find = Integer.parseInt(br.readLine());
		int count = Collections.frequency(list, find);
		System.out.println(count);
	}
}