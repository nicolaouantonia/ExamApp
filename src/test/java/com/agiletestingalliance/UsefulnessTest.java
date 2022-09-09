package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;


public class UsefulnessTest {

	@Test
	public void testDesc() throws Exception {
		String result = new Usefulness().desc();
        assertTrue("Usefulness",result.contains("DevOps is about transformation, about building quality in"));

	}

}
