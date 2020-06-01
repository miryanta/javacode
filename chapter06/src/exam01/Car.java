package exam01;

public class Car {

	boolean start;   
	String company;
	String model;
	String gasType;
	int maxSpeed;
	int mynumber;
	int prise;
	static int number;
	public Car(boolean start, String company, String model, String gasType, int maxSpeed, int mynumber, int prise) {
		super();
		this.start = start;
		this.company = company;
		this.model = model;
		this.gasType = gasType;
		this.maxSpeed = maxSpeed;
		this.mynumber = mynumber;
		this.prise = prise;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	int sum(int ... values)
	{
		int result=0;
		for (int i=0;i<values.length;i++)
		{
			result = result + values[i];
		}
		return result;
	}

}

class tire {

	
}