package exam04;

public abstract  class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원 ON");
	}
	
	public void turnOff()
	{
		System.out.println("전원 OFF");
	}

	public abstract void bellOn();
}
