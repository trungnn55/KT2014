import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class ptbac2Test{
	//String str = new String();
	private ptbac2 pt1 = new ptbac2( 1, 2, 3);
	private ptbac2 pt2 = new ptbac2( 1, 2, 1);
	private ptbac2 pt3 = new ptbac2( 1, 3, 2);
	
	@Test
	public void testPt1(){
		assertEquals(pt1.giaiptbac2(), 0);
	}
	
	@Test
	public void testPt2() {
		assertEquals(pt2.x1, -1,0);
		}
	
	@Test
	public void testPt3(){
		assertEquals(pt3.x1, -1,0);
		assertEquals(pt3.x2, -2,0);
	}
}
