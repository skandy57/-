package level4_1차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 나머지 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer>same=new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int num=Integer.parseInt(br.readLine());
			int remain=num%42;
			same.add(remain);			
		}
		System.out.println(same.stream().distinct().count());
		
	}
}
