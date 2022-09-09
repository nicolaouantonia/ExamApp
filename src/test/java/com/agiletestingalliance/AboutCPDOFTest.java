
package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class AboutCPDOFTest {

	@Test
	public void testDesc() throws Exception {
		String result = new AboutCPDOF().desc();
        assertTrue("AboutCPDOF",result.contains("CP-DOF is designed specifically for corporates and working professionals alike."));

	}

}
