package javabase;

import java.util.Scanner;

public class J01001_HinhChuNhat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int chieuDai = input.nextInt();
		int chieuRong = input.nextInt();
		if(chieuDai > 0 && chieuRong > 0) {
		System.out.println((chieuDai+chieuRong)*2 + " " + chieuDai*chieuRong);
		}
		else System.out.println("0");
	}
}
