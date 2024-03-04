package tests;

import org.testng.annotations.Test;
import base.Base_Class;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Order_Test extends Base_Class{
	
	@Test(priority=3)
	public void OrderPlaceModifyCancle () throws InterruptedException
	{
		MobileElement searchtab = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Search & Add Stock\"]");
	    searchtab.click();
	    
	    MobileElement innersearchtab = driver.findElementByXPath("//android.widget.EditText");
	    innersearchtab.sendKeys("IDEA");
	    
	    Thread.sleep(3000);
	    
	    MobileElement ideastock = driver.findElementByXPath("//android.view.View[@content-desc=\"EQ\n"
	    		+ "IDEA\n"
	    		+ "NSE\n"
	    		+ "Vodafone Idea Limited\"]");
	    ideastock.click();
	    
	    Thread.sleep(4000);
	    MobileElement skiptourbtn1 = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Skip Tour\"]");
	    skiptourbtn1.click();
	    
	    MobileElement buyideabtn = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Buy\"]");
	    buyideabtn.click();
	    
	    
	    
	    MobileElement okgotit = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Ok, got it!\"]");
	    okgotit.click();
	    
	    MobileElement limitbtn = driver.findElementByXPath("//android.view.View[@content-desc=\"Limit\"]");
	    limitbtn.click();
	    
	    MobileElement enterlimprice = driver.findElementByXPath("//android.widget.EditText[@index='1']");
	    enterlimprice.click();
	    enterlimprice.clear();
	    enterlimprice.sendKeys("16");
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	    
	    MobileElement amoorder = driver.findElementByXPath("//android.view.View[@content-desc=\"AMO\"]");
	    amoorder.click();
	    
	    MobileElement buyidea = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Buy\"]");
	    buyidea.click();
	    
	    MobileElement pendingidea = driver.findElementByXPath("//android.widget.ImageView[@index='0' and @bounds='[0,681][1080,1176]']");
	    pendingidea.click();
	    
	    MobileElement modifyidea = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Modify\"]");
	    modifyidea.click();
	    
	    MobileElement increseidea = driver.findElementByXPath("//android.widget.EditText[@text=\"1\"]");
	    increseidea.click();
	    increseidea.clear();
	    increseidea.sendKeys("2");
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	    
	    MobileElement buymodify = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Buy\"]");
	    buymodify.click();
	    
	    pendingidea.click();
	    
	    MobileElement cancle = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Buy\"]");
	    cancle.click();
	    
	    MobileElement yesbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Yes\"]");
	    yesbtn.click();
	}

}
