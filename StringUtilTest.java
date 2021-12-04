package corn.work.logic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

	@Test
	public void testIsEmpty() {
		boolean b;
		
		b = StringUtil.isEmpty("abc");
		Assert.assertFalse(b);
		
		b = StringUtil.isEmpty(null);
		Assert.assertTrue(b);
		
		b = StringUtil.isEmpty("");
		Assert.assertTrue(b);
	}
	
	@Test
	public void testReverse() {
		
		String r = StringUtil.reverse("efgh");
		Assert.assertEquals("hgfe", r);
		
		r = StringUtil.reverse(null);
		Assert.assertNull(r);

	}
}
