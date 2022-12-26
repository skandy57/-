package level4_1차원배열;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 게임 횟수 T
		sc.nextLine(); // 입력 버퍼에서 줄바꿈 제거

		for (int i = 0; i < T; i++) {
			String game = sc.nextLine(); // 게임 결과
			int score = 0; // 점수
			int combo = 0; // 콤보 점수

			for (int j = 0; j < game.length(); j++) {
				if (game.charAt(j) == 'O') {
					combo++; // 콤보 증가
					score += combo; // 점수 증가
				} else {
					combo = 0; // 콤보 초기화
				}
			}

			System.out.println(score); // 점수 출력
		}
	}
}