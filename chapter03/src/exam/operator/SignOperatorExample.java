package exam.operator;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		System.out.println(x);
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
//		short result3 = -s; compile error
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}
}