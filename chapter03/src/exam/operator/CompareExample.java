package exam.operator;

public class CompareExample {
	public static void main(String[] args) {
		System.out.println(1==1); //true
		System.out.println('A'==65); //true
		System.out.println('A' < 'B'); //true
		System.out.println(3 == 3.0); //true
		System.out.println(0.1 == 0.1f); //false 부동소수점float.
		
		String str1 = "대구";
		String str2 = "대구";
		String str3 = new String("대구");
		String str4 = new String("대구");
		
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false 내부값 비교 x 주소비교 o
		System.out.println(str3 == str4); //false 주소 비교
		
		System.out.println(str3.equals(str4)); //true 내부값 비교
		
		
	}

}
