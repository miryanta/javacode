package chapter04;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while(run)
		{
			if(keyCode!=13 && keyCode!=10) // 키 입력이 Enter 가 아닐 경우
			{
				System.out.println("-----------------------");
				System.out.println("| 1.증속 | 2.감속 | 3.중지 |");
				System.out.println("-----------------------");
				System.out.println("선택 : ");
			}

			keyCode = System.in.read();
			
			System.out.println(keyCode);

			if(keyCode == 49) // 1 입력 시
			{
				speed++;
				System.out.println("현재 속도 : " + speed + "\n");
			}
			else if(keyCode == 50) // 2 입력 시 
			{
				speed--;
				System.out.println("현재 속도 : " + speed + "\n");
			}
			else if (keyCode == 51) // 3 입력 시
			{
				run = false;
			}
		}
		System.out.println("-프로그램 종료-\n");
	}
}
