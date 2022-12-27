package level6_문자열;

import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 개수
		while (t-- > 0) {
			int r = sc.nextInt(); // 출력 횟수
			String s = sc.next(); // 입력문자열
			StringBuilder sb = new StringBuilder(); // 출력할 문자열
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				for (int j = 0; j < r; j++) {
					sb.append(c);
				}
			}
			System.out.println(sb.toString());
		}
	}
}