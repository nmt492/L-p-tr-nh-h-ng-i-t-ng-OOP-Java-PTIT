package javabase;

import java.util.Scanner;

public class J01002_TongNSoNguyenDuong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-->0) {
			int n = input.nextInt();
			long sum = (long) n * (n + 1) / 2; // Công thức tính tổng
            System.out.println(sum);
		}
		input.close();
	}
}
