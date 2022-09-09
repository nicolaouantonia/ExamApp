package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class AboutTest {

	@Test
	public void testDesc() throws Exception {
		String result = new About().desc();
        assertTrue("About",result.contains("CP-DOF is designed specifically for corporates and working professionals alike."));

	}

}
