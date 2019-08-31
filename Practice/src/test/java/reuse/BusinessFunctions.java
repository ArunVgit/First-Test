package reuse;

import org.openqa.selenium.WebDriver;

import Commands.ActionDriver;
import Config.StartBrowser;
import ObjRepo.LoginPage;

public class BusinessFunctions {

	WebDriver driver;
	ActionDriver adriver;

	public  BusinessFunctions ()
	{
driver = StartBrowser.driver;
adriver = new ActionDriver ();
}
	public void login() throws Exception
	{
		StartBrowser.childtest= StartBrowser.parenttest.createNode("Login to appl");
		adriver.gotoapplication("http://www.gcrit.com/build3/login.php?osCsid=gchd4jeansojsm8qvp259ehs46");
		  adriver.type(LoginPage.uname, "admin", "username");
		  adriver.type(LoginPage.pswd, "admin@123", "password");
		  adriver.click(LoginPage.btn, "Login Button");
		  
	}
	
}
