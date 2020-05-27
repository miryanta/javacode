package exam.operator;

import java.util.Scanner;

public class ConditionExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("총점 입력");
		int sum = scan.nextInt();
		String t = sum>=80 ? "합격" : "불합격";
		System.out.println(t);
	}

}