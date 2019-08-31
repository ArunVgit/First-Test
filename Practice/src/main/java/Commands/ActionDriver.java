package Commands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import Config.StartBrowser;

public class ActionDriver {
	
	WebDriver driver; 

public ActionDriver ()
{
	driver = StartBrowser.driver;
}

public void gotoapplication(String url)
{
	try {
	
driver .get(url);	
StartBrowser.childtest.pass("Succesfully navigated to "+url);
	}
	catch (Exception e)
	{
		StartBrowser.childtest.fail("not able to Succesfully navigate to "+url);
		
	}
}
public void click (By locator , String elementname) throws Exception
{
	try {
driver.findElement(locator).click();
StartBrowser.childtest.pass("Succesfully clicked on "+elementname);
}
catch (Exception e )
	{
	StartBrowser.childtest.fail("unable to Succesfully click on "+elementname , MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
	StartBrowser.childtest.info(e);
	throw e;
	}
	}
public void type (By locator , String text, String elementname) throws Exception
{
	try{
		
	driver.findElement(locator).sendKeys(text);

StartBrowser.childtest.pass("Succesfully typed in "+elementname +"with data" +text );
	
	}
	catch (Exception e )
	{
		StartBrowser.childtest.fail("unable to Succesfully type in "+elementname+"with data" +text , MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childtest.info(e);
	}
}
public String screenShot ()
{
	return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
}
}