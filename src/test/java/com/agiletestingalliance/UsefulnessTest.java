package com.agiletestingalliance;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.io.FileUtils;


public class UsefulnessTest {

	@Test
	public void testDesc() throws Exception {
		String result = new Usefulness().desc();
        assertTrue("Usefulness",result.contains("DevOps is about transformation, about building quality in"));

	}

	 @Test
    public void testServlet() throws Exception {

        // StringWriter stringWriter = new StringWriter();
        // PrintWriter writer = new PrintWriter(stringWriter);
        // when(response.getWriter()).thenReturn(writer);

        new Usefulness().functionWF();
        
        // writer.flush(); 
        // System.out.print(stringWriter.toString());
        // assertTrue("MainPage",stringWriter.toString().contains("0"));
    }


}
