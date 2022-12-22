package co.simplon.test.model;

public class Test {

	private String value ="petit test";
	

	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	
	@Override
	public String toString() {
		return value;
	}
	
}
