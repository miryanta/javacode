package exam.homework;

import java.util.Scanner;

public class CheckIntString {
	public static void main(String[] args) {
		char tmp;
		boolean output = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("판별 문자 입력");
		String input = scan.nextLine();
		for(int i = 0; i<input.length(); i++)
		{
			tmp = input.charAt(i);
			if(!(('0') <= tmp) && tmp <= '9')
			{
				output = false;
			}
		}
		
		System.out.println("숫자여부 : " + output);
		
		
		
	}

}
