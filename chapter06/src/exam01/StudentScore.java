package exam01;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentTable[] student = new StudentTable[100];
		int count = 0; // 위치
		int input;
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
			input = scan.nextInt();
			switch(input)
			{
			case 1:
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("국어 점수 : ");
				int kor = scan.nextInt();
				System.out.print("영어 점수 : ");
				int eng = scan.nextInt();
				System.out.print("수학 점수 : ");
				int math = scan.nextInt();

				student[count]=new StudentTable(name, kor, eng, math);
				student[count].printResult();

			case 2:
				System.out.print("이름 : ");
				String search = scan.next();
				
				
				

			}
		}while(input != 4);
	}
}
