import static org.junit.Assert.*;
import org.junit.Test;

public class nextDayTest {
	private nextDay d1 = new nextDay(28,2,2003);
	private nextDay d2 = new nextDay(28,2,2004);
	private nextDay d3 = new nextDay(28,2,2000);
	private nextDay d4 = new nextDay(31,1,2003);
	private nextDay d5 = new nextDay(30,4,2003);
	private nextDay d6 = new nextDay(31,12,2003);
	
	@Test
	public void TestD1(){
		d1.date();
		assertEquals(d1.month, 3);
		assertEquals(d1.day, 1);
	}
	
	@Test
	public void TestD2(){
		d2.date();
		assertEquals(d2.day, 29);
	}
	
	@Test
	public void TestD3(){
		d3.date();
		assertEquals(d3.day, 1);
	}
	
	@Test
	public void TestD4(){
		d4.date();
		assertEquals(d4.day, 1);
		assertEquals(d4.month, 2);
	}
	
	@Test
	public void TestD5(){
		d5.date();
		assertEquals(d5.day, 1);
		assertEquals(d5.month, 5);
	}
	
	@Test
	public void TestD6(){
		d6.date();
		assertEquals(d6.day, 1);
		assertEquals(d6.month, 1);
		assertEquals(d6.year, 2004);
	}
}
