package exam06;

public class Account {
	private String ano;
	private String owner;
	private int balane;
	
	public Account(String ano, String owner, int balane) {
		this.ano = ano;
		this.owner = owner;
		this.balane = balane;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalane() {
		return balane;
	}

	public void setBalane(int balane) {
		this.balane = balane;
	}
	
	
}
