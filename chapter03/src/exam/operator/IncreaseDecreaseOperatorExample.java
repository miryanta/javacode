package exam.operator;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------");
		x++;
		System.out.println("x = " + x);
		++x;
		System.out.println("x = " + x);
		
		
		System.out.println("----------------");
		y--;
		System.out.println("y = " + y);
		--y;
		System.out.println("y = " + y);

		
		System.out.println("----------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
	}

}
