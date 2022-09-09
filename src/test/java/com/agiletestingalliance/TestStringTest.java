package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestStringTest {

	@Test
	public void testDesc() throws Exception {
        String result = new TestString("test").gstr();
        assertTrue("TestString",result.contains("test"));

	}

}
