package level3_반복문;

import java.util.Scanner;

public class AplusBminus3 {
	public static void main(String[] args) {
	    // 스캐너로 입력을 반복할 횟수를 입력합니다.
	    Scanner scanner = new Scanner(System.in);
	    int count = scanner.nextInt();

	    // 각각의 덧셈값을 저장할 배열을 선언합니다.
	    int[] sums = new int[count];

	    // 반복할 횟수만큼 입력을 받고, 각각의 덧셈값을 배열에 저장합니다.
	    for (int i = 0; i < count; i++) {
	      int num1 = scanner.nextInt();
	      int num2 = scanner.nextInt();
	      int sum = num1 + num2;  // 각각의 두 정수의 합을 저장합니다.
	      sums[i] = sum;  // 각각의 합을 배열에 저장합니다.
	    }

	    // 전체 입력을 완료한 후 각각의 덧셈값을 출력합니다.
	    for (int sum : sums) {
	      System.out.println(sum);
	    }
	  }
	}