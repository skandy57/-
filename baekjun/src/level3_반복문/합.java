package level3_반복문;

import java.util.Scanner;

public class 합 {
	  public static void main(String[] args) {
		    // 스캐너로 입력을 반복할 횟수를 입력합니다.
		    Scanner s = new Scanner(System.in);
		    int a=s.nextInt();
		    int sum=0;
		    for (int i = 0; i <= a; i++) {
				sum+=i;
			}
		    System.out.println(sum);
		  }
		}