package exam01;

public class StudentTable {
	int id;
	static int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public StudentTable(String name, int kor, int eng, int math) {
		super();
		this.id = ++num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public StudentTable(String name) {
		this(name,0,0,0);
	}
	void input(int kor,int eng, int math)
	{
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void printResult() {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
	
}
