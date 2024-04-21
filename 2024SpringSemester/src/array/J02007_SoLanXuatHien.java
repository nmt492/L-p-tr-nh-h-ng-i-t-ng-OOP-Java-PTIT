package array;

import java.util.Scanner;

public class J02007_SoLanXuatHien {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
        for (int k = 1; k <= t; k++) {
            System.out.printf("Test %d:\n", k);
            int n = input.nextInt();
            int a[] = new int[n];
            int f[] = new int[100001];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                f[a[i]] += 1;
            }
            for (int i = 0; i < n; i++) {
                if (f[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], f[a[i]]);
                    f[a[i]] = 0;
                }
            }
        }
	}
}
