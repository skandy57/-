package level4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class X보다작은수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> list = new ArrayList<>();

		int gatsu = Integer.parseInt(st.nextToken());
		int cut = Integer.parseInt(st.nextToken());
		for (String str : br.readLine().split(" ")) {
			list.add(Integer.parseInt(str));
		}
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			int r = i.next();
			if (r >= cut) {
				i.remove();
			}
		}
		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
