
package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class MinMaxTest {

	@Test
	public void testDesc() throws Exception {
		int result = new MinMax().foo(2,3);
       assertEquals("Sub", result, 3);

	}

}

