package de.telekom.sea7;

public class BaseObject {
	private int id;
	private Object parent;
	
	public BaseObject(int id, Object parent) {
		this.id = id; // this bezieht sich auf die Variablen der Instanz
		this.parent = parent;
	}
	
	public String objectToString() {
		return super.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Object getParent() {
		return parent;
	}
}
