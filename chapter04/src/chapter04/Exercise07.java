package chapter04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		int balance = 0;
		
		int keyCode = 0;
		
		int deposit = 0;
		
//		String inputStr;
		
		
		while(run)
		{
			System.out.println("------------------------------");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("------------------------------");
			System.out.println(" <선택 > ");
			
			keyCode = scan.nextInt();
			if(keyCode == 49)
			{
				System.out.println("예금");
			}
			else if(keyCode == 50)
			{
				System.out.println("예금");
			}
			else if(keyCode == 51)
			{
				System.out.println("예금");
			}
			else if(keyCode == 52)
			{
				System.out.println("예금");
			}
			else
			{
				System.out.println("윽엑1");
			}

//			inputStr = scan.nextLine();
//			if(inputStr.equals("1"))
//				System.out.println("a");
			
		}
		
		System.out.println("\n프로그램 종료");
	}

}
