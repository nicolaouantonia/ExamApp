package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class DurationTest {

	@Test
	public void testDesc() throws Exception {
		String result = new Duration().dur();
        assertTrue("Duration",result.contains("CP-DOF is designed specifically for corporates and working professionals alike. If you are"));

	}

}
