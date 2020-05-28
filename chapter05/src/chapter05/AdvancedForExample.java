package chapter05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87 };
		int i;
		int sum = 0;
		
		for (i=0;i<scores.length;i++)
		{
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		sum=0;
		
		for (int score : scores)
		{
			sum = sum + score;
		}
		System.out.println(sum);
		
		
		sum=0;
		int[][] sc = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(i = 0;i<sc.length;i++)
		{
			for(int j=0;j<sc[i].length;j++)
			{
				sum = sum + sc[i][j];
			}
		}
		System.out.println(sum);
		
		sum=0;
		for(int a[] : sc)
		{
			for(int b : a)
			{
				sum = sum + b;
				
			}
		}
		System.out.println(sum);
	}
}
