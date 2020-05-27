package exam.ifTest;

import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a=0;
		int i=1;
		int win=0;
		int lose=0;

		while(i!=6)
		{
			int b=(int)(Math.random()*6)+1;

			System.out.println("주사위 눈금 맞추기! 1~6중에 한개 입력 " + "현재 " + (i-1) + "전 " + win + "승" + lose + "패");
			a = scan.nextInt();
			
			i++;

			if(a>=1 && a<=6)
			{
				System.out.println("주사위 눈금은? " +b + "가 나왔습니다!");

				if(a==b)
				{
					System.out.println("축하드립니다!!\n");
					win++;
				}
				else
				{
					System.out.println("안타깝군요~\n");
					lose++;
				}
			}
			else // 말안듣는 사람들
			{
				System.out.println("잘못 입력 하셨습니다!\n");
				i--;
			}
		}

		System.out.println(win + "번 이기고\n" + lose + "번 지셨네요!");
	}

}
