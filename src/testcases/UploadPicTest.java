package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class UploadPicTest {
	@Test
	public void uploadPic ()
	{
		//skipping a test
		throw new SkipException ("Skipping test - any reason");
		//webdrivercode
		
		//expected and actual title
		String expected="A";
		String actual="A";
		
		//Assertion in testing
		Assert.assertEquals(actual, expected);
		//fail - condition - false
		Assert.assertTrue(3>12, "Some error msg");
		
	}
	}

