package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestStringTest {

	@Test
	public void testDesc() throws Exception {
        TestString t = new TestString("test").gstr();
        assertTrue("TestString",result.contains("String value = test"));

	}

}
