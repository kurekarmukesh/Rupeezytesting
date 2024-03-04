package tests;

import org.testng.annotations.Test;
import base.Base_Class;
import io.appium.java_client.MobileElement;

public class Create_Watchlist extends Base_Class{
	
	@Test
	public void WatclistCRUD() throws InterruptedException
	{
		
		
		MobileElement createmenubtn = driver.findElementByXPath("//android.widget.ScrollView/android.widget.ImageView");
		createmenubtn.click();
		
		MobileElement createwatchbtn = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Create New Watchlist\"]");
		createwatchbtn.click();
		
		MobileElement watchtab = driver.findElementByXPath("//android.widget.EditText");
		watchtab.click();
		watchtab.clear();
		watchtab.sendKeys("Test Watchlist");
		
		MobileElement createbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Create\"]");
		createbtn.click();
		
		
		
		MobileElement testwatch = driver.findElementByXPath("//android.view.View[@index='2' and @content-desc='Test Watchlist\n"
				+ "Tab 3 of 4']");
		testwatch.click();
		
		MobileElement addstock = driver.findElementByXPath("//android.widget.Button[@content-desc=\"+Add Stock\"]");
		addstock.click();
		
		MobileElement searchbox = driver.findElementByXPath("//android.widget.EditText");
		searchbox.click();
		searchbox.clear();
		searchbox.sendKeys("YESBANK");
		
		MobileElement addsign = driver.findElementByXPath("//android.view.View[@content-desc=\"EQ\n"
				+ "YESBANK\n"
				+ "NSE\n"
				+ "Yes Bank Limited\"]/android.widget.ImageView");
		addsign.click();
		
		MobileElement donebtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Done\"]");
		donebtn.click();
		
		MobileElement createmenubtn2 = driver.findElementByXPath("//android.widget.ScrollView/android.widget.ImageView");
		createmenubtn2.click();
		
		MobileElement editbtn = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Edit Test Watchlist \"]");
		editbtn.click();
		
		MobileElement checkbox = driver.findElementByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
		checkbox.click();
		
		MobileElement deletebtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Delete\"]");
		deletebtn.click();
		
		MobileElement createmenubtn3 = driver.findElementByXPath("//android.widget.ScrollView/android.widget.ImageView");
		createmenubtn3.click();
		
		MobileElement managewatch = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Manage All Watchlist\"]");
		managewatch.click();
		
		MobileElement deletetestwatch = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Test Watchlist\n"
				+ "0 Stocks\"]");
		deletetestwatch.click();
//		boolean ele = deletetestwatch.isSelected();
//		if(ele==true)
//		{
//			driver.pressKey(new KeyEvent().withKey(AndroidKey.DEL));
//		}
		
		
		MobileElement deletebtn1 = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Delete\"]");
		deletebtn1.click();
		
		MobileElement donebtn1 = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Done\"]");
		donebtn1.click();		
		
	}

}
