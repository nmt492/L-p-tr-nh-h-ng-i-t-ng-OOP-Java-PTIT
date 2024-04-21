package javabase;

import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			String n = input.nextLine();
			if (soChuSo4Va7(n) == 4 || soChuSo4Va7(n) == 7) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		
	}
	
	private static int soChuSo4Va7(String n) {
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
            int a = Character.getNumericValue(n.charAt(i));
            if(a == 4 || a == 7) count++;
        }
		return count;
	}
}
