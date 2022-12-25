package level4_1차원배열;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> list = new ArrayList<>();
		List<Double> list2 = new ArrayList<>();
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		double M = 0;
		for (double i : list) {
			if (i > M) {
				M = i;
			}
		}
		for (double i : list) {
			list2.add(((i / M) * 100));
		}

		double sum = list2.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(sum / count);

	}
}
