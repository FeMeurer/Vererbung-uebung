package de.telekom.sea7;

public class Application extends BaseObject {
	
	public Application(int id, Object parent) {
		super(id,parent); // Aufruf des Konstruktors der übergeordneten Klasse
	}
	
	public void run(String[] args) {
		Auto auto = new Auto(5, this);
		BaseObject bo = auto;
		Object o = bo;
		
		System.out.println(auto.getParent());
		System.out.println(auto.toString());
		
		System.out.println(auto.getBaseToString()+ ", " + auto.toString()); // Die Instanz bleibt gleiche
		System.out.println(bo.toString()); // Die Instanz bleibt gleiche
		System.out.println(o.toString()); // Die Instanz bleibt gleiche
	}
}
