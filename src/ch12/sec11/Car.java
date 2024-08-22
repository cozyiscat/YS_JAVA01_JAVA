package ch12.sec11;

public class Car {
	//필드
	private String model;
	private String owner;
	
	//생성자 필드이용x
	public Car() {
		super();
	}

	//생성자 필드 이용o
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
