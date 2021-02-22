import static org.junit.Assert.*;

import org.junit.Test;
import abhisekTest.Singleton;
public class testJunit4 {

	
		@Test
		public void testSingleton() {
			Singleton s1 =  Singleton.instance();
			Singleton s2 =  Singleton.instance();
			assertSame(s1,s2);
			//assertNull(s1);
			//assertEquals(s1,s2);
			
	}

}
