package level6_문자열;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 숫자의합 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int gatsu=s.nextInt();
		String str=s.next();
		
		List<Character>list=new ArrayList<>();
		for(char c:str.toCharArray()) {
			list.add(c);
		}
		int sum=list.stream().mapToInt(c->Integer.parseInt(c.toString())).sum();
		System.out.println(sum);
	}
}
