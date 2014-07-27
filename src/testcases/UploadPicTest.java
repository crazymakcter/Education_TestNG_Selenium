package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

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
		AssertJUnit.assertEquals(actual, expected);
		//fail - condition - false
		AssertJUnit.assertTrue(3>2, "Some error msg");
		
	}
	}

