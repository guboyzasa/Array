package rmuti;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		
		ArrayUtil a = new ArrayUtil(new int[]{ 1, 2, 3, 4, 5 , 1 });
		int sum = a.sumArray();
		int n = a.countOne();
		int[] r = a.findOne();
		int[] t = a.doubleArray();
		
		System.out.println(sum);
		System.out.println(n);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(t));
	}
}
