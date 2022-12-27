package level6_문자열;

import java.util.Scanner;

public class 단어공부 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        sc.close();

	        // 문자열을 모두 소문자로 바꾸기
	        s = s.toLowerCase();

	        // 각 알파벳을 세기 위한 배열 생성
	        int[] alphabetCount = new int[26];

	        // 각 알파벳을 센다.
	        for (int i = 0; i < s.length(); i++) {
	            alphabetCount[s.charAt(i) - 'a']++;
	        }

	        // 가장 많이 사용된 알파벳 찾기
	        int maxIndex = 0;
	        for (int i = 1; i < 26; i++) {
	            if (alphabetCount[i] > alphabetCount[maxIndex]) {
	                maxIndex = i;
	            }
	        }

	        // 최대값이 하나가 아니라면 ? 출력
	        for (int i = 0; i < 26; i++) {
	            if (alphabetCount[i] == alphabetCount[maxIndex] && i != maxIndex) {
	                System.out.println("?");
	                return;
	            }
	        }

	        // 최대값 출력
	        System.out.println((char)(maxIndex + 'A'));
	    }
	}