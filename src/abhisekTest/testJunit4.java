package abhisekTest;
import static org.junit.Assert.*;

import org.junit.Test;

public class testJunit4 {

	
		@Test
		public void testSingleton() {
			Singleton s1 =  Singleton.instance();
			Singleton s2 =  Singleton.instance();
			assertSame(s1,s2);
	}

}
