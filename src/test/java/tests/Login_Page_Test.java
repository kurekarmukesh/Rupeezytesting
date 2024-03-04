package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import base.Base_Class;
import io.appium.java_client.MobileElement;

public class Login_Page_Test extends Base_Class{
	
	@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
		    
		    MobileElement watchlisttab = driver.findElementByXPath("//android.view.View[@content-desc=\"Watchlists\"]");
		    boolean watchtab = watchlisttab.isDisplayed();
		    Assert.assertTrue(watchtab);
	}

}
