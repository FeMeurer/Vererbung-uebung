package de.telekom.sea7;

public class Auto extends BaseObject {
	
	private String baseInstance;

	public Auto(int id, Object parent) {
		super(id, parent); // Aufruf des Constructors von BaseObject
	}
	
	public String getBaseToString() {
		return super.objectToString() + ", " + super.toString();
	}
	
	public String getBaseInstance() {
		return baseInstance;
	}
}
