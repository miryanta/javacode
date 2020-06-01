package exam05;

public class Car {
	//field
	private int speed;
	private boolean stop;
	
	//constr
	
	//method
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed>=0 && speed<=350)
		{
			this.speed = speed;
		}
		else {
			System.out.println("오류");
		}
	}
	
	@Override // 어노테이션
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}