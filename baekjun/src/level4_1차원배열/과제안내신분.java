package level4_1차원배열;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class 과제안내신분 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> allList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int min = 31;
		int max = 0;
		for (int i = 1; i <= 30; i++) {
			allList.add(i);
		}
		for (int i = 0; i < 28; i++) {
			int student = Integer.parseInt(br.readLine());
			list.add(student);
		}
		List<Integer> jungbok = allList.stream().filter(i -> list.stream().noneMatch(Predicate.isEqual(i)))
				.collect(Collectors.toList());
		for (int i : jungbok) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
