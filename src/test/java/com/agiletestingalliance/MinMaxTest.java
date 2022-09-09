
package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class MinMaxTest {

	@Test
	public void testFoo() throws Exception {
		int result = new MinMax().foo(2,3);
       assertEquals("foo", result, 3);

	}

	@Test
	public void testFoo() throws Exception {
		int result = new MinMax().foo(4,3);
       assertEquals("foo", result, 4);

	}

	@Test
	public void testBar() throws Exception {
	  String result = new MinMax().bar("an");
       assertEquals("Bar", result, "an");

	}

	@Test
	public void testBar() throws Exception {
	  String result = new MinMax().bar("");
       assertEquals("Bar empty", result, "");

	}

}

