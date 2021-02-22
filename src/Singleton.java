

import java.util.*;




public class Singleton{
	
	private static Singleton theInstance;
	
	private Singleton() {}
	
	public static Singleton Instance() {
		if (theInstance == null)
			theInstance = new Singleton();
		return theInstance;
			
	}
	
	/*public static void main(String args[]) {
		
		Singleton Instance1 = new Singleton();
		Singleton Instance2 = new Singleton();
		System.out.println(Instance1);
		System.out.println(Instance2);
		
	}*/

}