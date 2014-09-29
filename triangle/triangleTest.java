import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class triangleTest {
	private triangle t1 = new triangle(3,4,9);
	private triangle t2 = new triangle(3,4,5);
	private triangle t3 = new triangle(3,3,5);
	
	@Test
	public void testT1(){	
		assertEquals(t1.checkTriangle(), false);
	}
	
	@Test
	public void testT2(){
		assertEquals(t2.checkTriangle(), true);
		assertEquals(t2.isTriangle(), "Tam giac vuong");
	}
	
	@Test
	public void testT3(){
		assertEquals(t3.checkTriangle(), true);
		assertEquals(t3.isTriangle(), "Tam giac can");
	}
}