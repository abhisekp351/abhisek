
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import abhisekPractise.Singleton;


	public class  testJunit5{
		
		
		@Test
		public void testSingleton() {
			Singleton s1 =  Singleton.theInstance;
			Singleton s2 =  Singleton.theInstance;
			//assertSame(s1,s2);
			assertNull(s1);
		}
	     
	}
