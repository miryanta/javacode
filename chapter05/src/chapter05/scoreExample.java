package chapter05;

import java.util.Scanner;

public class scoreExample {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int score[]= new int[10];
		int i;
		int sum = 0;
		double avrg = 0;
		
		
		for(i=0;i<score.length;i++)
		{
			System.out.println(i+1 +"번째 학생 점수 입력");
			score[i] = scan.nextInt();
		}
		
		for(i=0;i<score.length;i++)
		{
			sum = sum + score[i];
		}
		avrg = (double)sum / score.length;
		
		System.out.println("합" + sum);
		System.out.println("평균" + avrg);
	}
}
