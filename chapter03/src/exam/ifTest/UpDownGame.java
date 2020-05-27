package exam.ifTest;

import java.util.Scanner;
public class UpDownGame {
	public static void main(String[] args) {
		//		숫자 범위 1~100
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int player;
		int count=0;
		int score=100; // 100점 부터 못맞출 경우 10점씩 감점

		System.out.println("Up Down Game!");
		System.out.println("컴퓨터가 생각한 숫자를 10번 안에 맞추는 게임");

		//		System.out.println(com);

		do
		{
			System.out.println("1~100까지 숫자 입력" + " 현재 " + (count+1) +"번째 도전중");
			System.out.println("지금 맞추면 " + score + "점");
			player = scan.nextInt();

			if(player<=100 && player>=1)
			{
				if(player == com)
				{
					System.out.println("정답입니다!!\n");
					count++;
				}

				else if(player < com)
				{
					System.out.println("Up\n");
					count++;
					score = score - 10;
				}

				else if(player > com)
				{
					System.out.println("Down\n");
					count++;
					score = score - 10;
				}

				if(score<=0) // 10번 안에 맞추지 못했을 경우 반복문 탈출
					break;
			}
			else // 1~100 사이의 숫자를 적지 않았을 경우
			{
				System.out.println("잘못 입력 하셨습니다\n");
			}

		}while(player != com);

		if(score==0) // 10번 안에 맞추지 못했을 경우
		{
			System.out.println("정답은 " + com + " 이었습니다!");
			System.out.println("다음기회에...");

		}

		else
		{
			System.out.println(count + "번 만에 맞추셨습니다!");
			System.out.println(score + "점 입니다.\n");
		}

	}

}
