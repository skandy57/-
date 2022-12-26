package level3_반복문;

import java.util.Scanner;

public class 영수증 {
	public static void main(String[] args) {
		// 스캐너로 입력을 반복할 횟수를 입력합니다.
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		int items=s.nextInt();
		int sums=0;
		
		for (int i = 0; i < items; i++) {
			int n1=s.nextInt();
			int n2=s.nextInt();
			sums+=n1*n2;
		}
		if (sum==sums) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}