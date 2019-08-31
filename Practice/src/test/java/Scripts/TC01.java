package Scripts;

import org.testng.annotations.Test;

import Commands.ActionDriver;
import Config.StartBrowser;
import ObjRepo.LoginPage;

public class TC01 extends StartBrowser {
  @Test
  public void testLogiin() {
	 ActionDriver adriver= new ActionDriver  ();
	/*  adriver.gotoapplication("http://www.gcrit.com/build3/login.php?osCsid=gchd4jeansojsm8qvp259ehs46");
	  adriver.type(LoginPage.uname, "admin");
	  adriver.type(LoginPage.pswd, "admin@123");
	  adriver.click(LoginPage.btn);
	  */
  }
}
