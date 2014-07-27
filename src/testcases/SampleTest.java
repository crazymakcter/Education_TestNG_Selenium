package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;


public class SampleTest {
	
	
	
	@Test
	public void testCaseRegister ()
	{
		//webdriver code
		//System.out.println("Registering user");
		throw new SkipException ("Skipping test - any reason");
		
		
	}
	
	@Test  (dependsOnMethods = {"testCaseRegister"} )
	public void testCaseLoginTest()
	{
		//webdriver code
		System.out.println("Loggin into app");
		
		
	}
	
	@Test (dependsOnMethods = {"testCaseRegister", "testCaseLoginTest"} )
	public void testCasePasswordChange ()
	{
		//webdriver code
		System.out.println("Changing password");
		
		
	}

}
