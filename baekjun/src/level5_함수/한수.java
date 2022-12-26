package level5_함수;

import java.util.Scanner;

public class 한수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받은 정수 n

        // 함수 호출해서 결과 출력
        System.out.println(countHanNumbers(n));
    }

    // 한수의 개수를 구하는 함수
    public static int countHanNumbers(int n) {
        int cnt = 0; // 한수의 개수를 저장할 변수

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            // 1이나 2자리 수는 모두 한수
            if (i < 100) {
                cnt++;
            } else {
                int a = i / 100; // 자리수를 차례대로 나눠 a, b, c에 저장
                int b = (i / 10) % 10;
                int c = i % 10;
                // 차례대로 자리수가 증가하는 수를 구한 후, 그 차이가 같으면 cnt 증가
                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
        }

        return cnt; // 결과 반환
    }
}