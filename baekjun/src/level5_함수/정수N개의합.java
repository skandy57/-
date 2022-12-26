package level5_함수;



class Test {
	long sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}

public class 정수N개의합 {
	public static void main(String[] args) {
		Test t=new Test();
		
		t.sum(null);
	}

}