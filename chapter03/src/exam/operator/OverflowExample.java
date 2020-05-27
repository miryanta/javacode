package exam.operator;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		byte a = 127;
		byte b = (byte)(a+2);
		System.out.println(b);
		
		
	}

}
