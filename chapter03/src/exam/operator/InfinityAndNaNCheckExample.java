package exam.operator;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		System.out.println(z);
		
		double a = z+1;
		System.out.println(a);
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isInfinite(z));
	}

}
