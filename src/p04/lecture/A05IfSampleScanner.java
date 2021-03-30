package p04.lecture;

import java.util.Scanner;

public class A05IfSampleScanner {
	public static void main(String[] args) {
		// new : 객체 만들때 Ctrl + shift + O
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력>");
		String str = scanner.nextLine();

		System.out.println("출력>");
		System.out.println(str);

		System.out.println("숫자 입력>");
		int in = scanner.nextInt();
		
		System.out.println("숫자 입력>");
		System.out.println(in);
	}
}
