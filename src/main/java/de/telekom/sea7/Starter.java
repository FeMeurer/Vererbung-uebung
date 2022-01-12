package de.telekom.sea7;

public class Starter {
	public static void main(String[] args) {
		Application application = new Application(1,null); // Zweiter Parameter Parent, Application hat keine Parentinstanz aus die sie entstanden ist.
		application.run(args);

//		Auto auto = new Auto(5);
//		BaseObject bo = auto;
//		Object o = bo;
//		
//		// System.out.println(auto.getBaseInstance() + ", " + auto.toString());
//		System.out.println(auto.getBaseToString()+ ", " + auto.toString());
//		System.out.println(bo.toString());
//		System.out.println(o.toString());
	}
}
