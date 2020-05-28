package chapter05;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		//		10명의 학생
		//		국어, 영어, 수학  3가지 과목의 성적을 저장
		//		학생별 총점 / 평균
		//		전체 학생의 과목당 총점 평균
		Scanner scan = new Scanner(System.in);
		
		int n;
		int i=0;
		int j=0;
		int[][] score = new int[10][3];
		int sum1=0; // 학생별 점수합
		int sum2=0; // 총학생 점수합
		double average1=0.0; // 학생별 평균
		double average2=0.0; // 총학생 과목별 평균
		String input;


		do
		{

			System.out.println("---------------------");
			System.out.println("| 점   수    입   력    체   계  |");
			System.out.println("---------------------");
			System.out.println("| 1. 점   수          입    력  |");
			System.out.println("| 2. 학 생별    총점    평균  |");
			System.out.println("| 3. 전체 과목별 총점 평균  |");
			System.out.println("| 4. 종                       료  |");
			System.out.println("---------------------");
			//		1. 점수 입력 2.학생별 총점 3.전체학생 과목별 총점 평균 4.종료
			input = scan.next();
			
			
			if(input.equals("1"))
			{
				for(i=0; i<score.length; i++) // 점수 입력
				{
					System.out.println(i+1 + "번 학생의 ");
					for(j=0; j<score[i].length; j++)
					{
						if(j==0)
							System.out.print("국어 점수 : ");
						else if(j==1)
							System.out.print("영어 점수 : ");
						else if(j==2)
							System.out.print("수학 점수 : ");
						score[i][j]=scan.nextInt();
						//				System.out.println(score[i][j]);
					}
					System.out.println("입력 완료!\n");
				}
			}

			else if(input.equals("2"))
			{
				System.out.println("몇 번 학생의 점수를 불러오시겠습니까?(1~"+score.length+")");
				n = scan.nextInt();
				// n번 학생의 총점을 불러낸다.
				for(j=0; j<score[n].length; j++)
				{
					sum1 = sum1 + score[n][j];
				}
				average1 = (double)(sum1) / score[n].length;
				System.out.println(n + "번 학생의 ");
				System.out.println("점수 총합은 " + sum1 + "이고");
				System.out.println("점수 평균은 " + average1 + "입니다.\n");
				
				sum1=0;
				average1=0.0;
			}

			// 전체 학생의 과목별 점수 평균
			else if(input.equals("3"))
			{
				i=0;
				for(j=0; j<score[i].length; j++)
				{
					for(i=0; i<score.length; i++)
					{
						sum2= sum2 + score[i][j];
					}
					average2 = (double)(sum2)/ score[j].length;

					if(j==0)
						System.out.print("국어 ");
					else if(j==1)
						System.out.print("영어 ");
					else if(j==2)
						System.out.print("수학 ");

					System.out.println("점수 총합은 " + sum2 + "이고");

					if(j==0)
						System.out.print("국어 ");
					else if(j==1)
						System.out.print("영어 ");
					else if(j==2)
						System.out.print("수학 ");

					System.out.println("점수 평균은 " + average2 + "입니다.\n");

					i=0;
					sum2=0;
				}
			}


			else if(input.equals("4"))
				break;
			else if(input.contentEquals("\n"))
				continue;

			else
			{
				System.out.println("잘못 입력 하셨습니다.\n");
			}

		}while(!(input.equals("4")));
		System.out.println("프로그램 종료");
	}

}
