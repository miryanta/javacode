package exam.operator;

import java.util.Scanner;

public class AppleBoxExample {

	public static void main(String[] args) {
//		사과 x개면 x박스 x개 남음 표기
		Scanner scan = new Scanner(System.in);
		System.out.println("사과 갯수를 입력해 주세요 : ");
		int apple= scan.nextInt();
		System.out.println("박스 당 사과 갯수를 입력해 주세요 : ");
		int perBox= scan.nextInt();
		int box;
		int sur;
		box = apple / perBox;
		sur = apple % perBox;

		System.out.println(apple);
		System.out.println(perBox);
		System.out.println(box);
		System.out.println(sur);

	}

}
