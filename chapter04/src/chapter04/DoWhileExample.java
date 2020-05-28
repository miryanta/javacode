package chapter04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지 입력");
		System.out.println("프로그램 종료 : q");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do
		{
			System.out.println(">");
			
			inputString = scan.nextLine();
			System.out.println(inputString);
		}while(! inputString.equals("q"));
			
			System.out.println("\n프로그램종료");
	}

}
