
package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class AboutCPDOFTest {

	@Test
	public void testDesc() throws Exception {
		String result = new AboutCPDOF().desc();
        assertTrue("AboutCPDOF",result.contains("CP-DOF certification program covers end to end DevOps Life Cycle practically."));

	}

}
