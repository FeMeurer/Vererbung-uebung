package de.telekom.sea7;

public class BaseObject {
	private String objectInstance;
	
	public BaseObject(int id) {
		this.id = id;
		//this.objectInstance = super.toString();
	}
	
	public String objectToString() {
		//System.out.println(toString());
		return super.toString();
	}
	
	public String getObjectInstance() {
		return objectInstance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	
	//public String toString() {
	//	return super.toString();
	//}
}
