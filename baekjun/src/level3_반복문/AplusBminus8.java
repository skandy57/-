package level3_반복문;

import java.io.IOException;
import java.util.Scanner;

public class AplusBminus8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner s=new Scanner(System.in);
		int cnt=s.nextInt();
		int[]sums=new int[cnt];
		String[]nums=new String[cnt*2];

		for (int i = 0; i < cnt; i++) {
			int num1=s.nextInt();
			int num2=s.nextInt();
			int sum=num1+num2;
			sums[i]=sum;
			nums[i]=num1+" "+num2;		
		}
		for(int i=0;i<cnt;i++) {
			String[]num=nums[i].split(" ");
			int num1=Integer.parseInt(num[0]);
			int num2=Integer.parseInt(num[1]);
			int sum=num1+num2;
			System.out.println("Case #"+(i+1)+": "+num1+" + "+num2+" = "+sum);
		}
		}
	}