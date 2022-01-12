package de.telekom.sea7;

public class AutoTest {
	public static void main(String[] args) {
		Auto auto = new Auto(5);
		BaseObject bo = auto;
		Object o = bo;
		
		// System.out.println(auto.getBaseInstance() + ", " + auto.toString());
		System.out.println(auto.getBaseToString()+ ", " + auto.toString());
		System.out.println(bo.toString());
		System.out.println(o.toString());
	}
}
