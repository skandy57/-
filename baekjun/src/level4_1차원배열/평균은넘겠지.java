package level4_1차원배열;

import java.util.Scanner;

public class 평균은넘겠지 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 점수의 집합의 개수
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 점수 집합의 크기
            int k = sc.nextInt();
            // 점수 집합
            int[] arr = new int[k];
            // 점수 집합의 합
            int sum = 0;

            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            // 점수 집합의 평균
            double avg = (double) sum / k;

            // 평균 이상인 점수의 개수
            int count = 0;
            for (int j = 0; j < k; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            // 평균 이상인 점수의 비율
            double result = (double) count / k * 100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}