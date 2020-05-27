package exam.ifTest;

import java.util.Scanner;

public class TestCheck {

	public static void main(String[] args) {
		//		성적 자동 채점 프로그램
		Scanner scan = new Scanner(System.in);
		int score = 0;
		
		System.out.println("점수를 입력 해 주십시오. (0~100점)");
		score = scan.nextInt();
		if(score>=0 && score<=100)
		{
			switch(score/10)
			{
			case 10 :
				System.out.println("A+");
				break;
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default :
				System.out.println("F");
				break;
			}
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}

	}
}
