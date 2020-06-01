package exam01;

public class DmbCellPhone extends CellPhone {

	int channel;
	public DmbCellPhone() {
		System.out.println("DmbCellPhone 생성");
	}


	public DmbCellPhone(int channel) {
		this.channel = channel;
	}


	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("dmb!!");
	}


	@Override
	public String toString() {
		return "DmbCellPhone [channel=" + channel + "]";
	}

}
