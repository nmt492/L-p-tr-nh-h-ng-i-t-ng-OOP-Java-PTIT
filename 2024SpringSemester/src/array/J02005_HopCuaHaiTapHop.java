package array;

import java.util.Scanner;

public class J02005_HopCuaHaiTapHop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), m = input.nextInt(), x;
        int a[] = new int[1001];
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            x = input.nextInt();
            a[x] = 1;
        }
        for (int i = 1; i <= 1000; i++)
            if (a[i] == 1)
                System.out.printf("%d ", i);
    }
}
