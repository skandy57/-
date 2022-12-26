package level4_1차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class 최소_최대 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>list=new ArrayList<>();
		int gatsu=Integer.parseInt(br.readLine());
		int max=-10000000;
		int min=10000000;
		for(String str:br.readLine().split(" ")) {
			list.add(Integer.parseInt(str));
		}
		for(Iterator<Integer>i=list.iterator();i.hasNext();) {
			int r=i.next();
			if(r>=max) {
				max=r;
			}
			if(r<=min) {
				min=r;
			}
		}
		System.out.println(min+" "+max+" ");
	}
}
