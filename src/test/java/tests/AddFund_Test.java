package tests;

import org.testng.annotations.Test;
import base.Base_Class;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddFund_Test extends Base_Class{
	
	
	
	@Test(priority=2)
	public void AddFundTest() throws InterruptedException 
	{
	  
		    Thread.sleep(2000);
		    MobileElement profilebtn = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"M\n"
		    		+ "0\"]");
		    profilebtn.click();
		    
		    
		    MobileElement skiptourbtn2 = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Skip Tour\"]");
		    skiptourbtn2.click();
		    
		    MobileElement addfundbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Add Funds\"]");
		    addfundbtn.click();
		    
		    MobileElement enterammount = driver.findElementByXPath("//android.widget.EditText[@text=\"5000\"]");
		    enterammount.click();
		    enterammount.clear();
		    enterammount.sendKeys("10");
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
		    
		    MobileElement UPI = driver.findElementByXPath("//android.view.View[@content-desc=\"UPI\n"
		    		+ "Free for any amount, Max allowed is Rs 2,00,000\"]");
		    UPI.click();
		    
		    MobileElement enterUPI = driver.findElementByXPath("//android.widget.ImageView[@index='5']");
		    enterUPI.click();
		    enterUPI.clear();
		    enterUPI.sendKeys("9970789852@ybl");
		    
		    MobileElement verifyandaddbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Verify and Add ₹10\"]");
		    verifyandaddbtn.click();
		    
		    Thread.sleep(120000);
		
		
	}

}
