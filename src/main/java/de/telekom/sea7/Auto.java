package de.telekom.sea7;

public class Auto extends BaseObject {
	
	private String baseInstance;

	public Auto(int id) {
		super(id); // Aufruf des Constructors von BaseObject
		//this.baseInstance = getObjectInstance() + ", " + super.toString();
	}
	
	public String getBaseToString() {
		//System.out.println(super.toString());
		return super.objectToString() + ", " + super.toString();
	}
	
	public String getBaseInstance() {
		return baseInstance;
	}
}
