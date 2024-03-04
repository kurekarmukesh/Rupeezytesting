package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Class {
	
	public static AndroidDriver <MobileElement> driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5 API 34"); 
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mukeshqa/Downloads/app-prod-release.apk");
	  
		try
	      {
	   	   driver=new AndroidDriver<>(new URL( "http://localhost:4723/wd/hub"),desiredCapabilities);
	      }
	      catch(MalformedURLException e)
	      {;
	   	   e.printStackTrace();
	      }
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      MobileElement whilebtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	      whilebtn.click();

	      
	      //allow button id
	      MobileElement allowbtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
	      allowbtn.click();
	      
	      
	      //allow all button id
	      MobileElement allallowbtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_all_button");
	      allallowbtn.click();

	      
	      //continue button xpath
	      MobileElement continuebtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Continue\"]");
	      continuebtn.click();
	    
	      
	      //username xpath
	      MobileElement username = driver.findElementByXPath("//android.widget.ScrollView/android.widget.EditText[1]");
	      username.click();
	      username.sendKeys("IOSTEST");
	    
	      
	      //password xpath
	      MobileElement password = driver.findElementByXPath("//android.widget.ScrollView/android.widget.EditText[2]");
	      password.click();
	      password.sendKeys("Astha@123");
	    
	      
	      MobileElement hidekeyboard = driver.findElementByXPath("//android.widget.ScrollView");
	      hidekeyboard.click();
	      
	      //sing in button xpath
	      MobileElement signin = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Sign in\"]");
	      signin.click();
	      
	      MobileElement totp = driver.findElementByXPath("//android.widget.EditText[@index='1']");
	      totp.click();	      
	      
	      Thread.sleep(4000);
	      
	      MobileElement otp = driver.findElementByXPath("//android.widget.EditText[@index='1']");
	      otp.click();
	      otp.sendKeys("123456");   
	      Thread.sleep(1000);	      
	      MobileElement doitlaterbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"I’ll do it later\"]");
	      doitlaterbtn.click();
	      
	      MobileElement unabledevicelockbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Enable Device Lock\"]");
	      unabledevicelockbtn.click();
	      
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.DIGIT_1));
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.DIGIT_2));
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.DIGIT_3));
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.DIGIT_4));
		    driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
		    
		    Thread.sleep(5000);
		   
		    MobileElement skiptourbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Skip Tour\"]");
		    skiptourbtn.click();
	      
		    MobileElement okgotitbtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Ok, got it!\"]");
		    okgotitbtn.click();
		   
	}
	
	
	
	@AfterTest
	public void TearDown() 
	{
		driver.closeApp();
	}

}
