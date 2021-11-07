package corn.work.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void mdcApar() {
		int a = 6;
		int b = 3;
		int wait = b;
		int get = MathUtil.mdc(a, b);
		assertEquals(wait, get);
		/* if (get == wait)
			System.out.println("Sucessfull test");
		else
			System.err.println("Failed Test");*/
		// fail("Not yet implemented");
	}
	
	@Test
	void mdcApar1() {
		int a = 9;
		int b = 3;
		int wait = b;
		int get = MathUtil.mdc(a, b);
		assertEquals(wait, get);
	}
	

	@Test
	void mdcAim() {
		int a = 9;
		int b = 4;
		int wait = b;
		int get = MathUtil.mdc(a, b);
		assertEquals(wait, get);
	}
	
	@Test
	void mdcAim1() {
		int a = 9;
		int b = 3;
		int wait = b;
		int get = MathUtil.mdc(a, b);
		assertEquals(wait, get);
	}
	
	@Test
	void mdcAim2() {
		int a = 9;
		int b = 6;
		int wait = b;
		int get = MathUtil.mdc(a, b);
		assertEquals(wait, get);
	}
	
	
}
	
