package Scripts;

import org.testng.annotations.Test;

import Config.StartBrowser;
import reuse.BusinessFunctions;

public class TC02 extends StartBrowser {
  @Test
  public void testLogin_logout() throws Exception {
 BusinessFunctions bf = new BusinessFunctions (); 
  bf.login();
  
  }
}
 