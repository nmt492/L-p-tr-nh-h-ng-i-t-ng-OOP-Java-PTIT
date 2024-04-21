package array;

import java.util.Scanner;

public class J02004_MangDoiXung {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-->0) {
			int n = input.nextInt();
			int [] a = new int[n];
			int c = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < a.length / 2; i++) {
				if(a[i] - a[n - i - 1] != 0) c = 1;
			}
			if(c == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
