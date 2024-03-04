package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class Authenticator {

	
public static void main(String[] args) throws InterruptedException, DecoderException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "My Immulator"); 
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mukeshqa/Downloads/app-prod-release.apk");
		
		
		AndroidDriver <MobileElement> driver=null;
	       
	      try
	      {
	   	   driver=new AndroidDriver<>(new URL( "http://localhost:4723/wd/hub"),desiredCapabilities);
	      }
	      catch(MalformedURLException e)
	      {;
	   	   e.printStackTrace();
	      }
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      
	      //while using this app button id
	      MobileElement whilebtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
	      whilebtn.click();

	      
	      //allow button id
	      MobileElement allowbtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
	      allowbtn.click();
	      
	      
	      //allow all button id
//	      MobileElement allallowbtn = driver.findElementById("com.android.permissioncontroller:id/permission_allow_all_button");
//	      allallowbtn.click();

	      
	      //continue button xpath
	      MobileElement continuebtn = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Continue\"]");
	      continuebtn.click();
	    
	      
	      //username xpath
	      MobileElement username = driver.findElementByXPath("//android.widget.EditText[@index='4']");
	      username.click();
	      username.sendKeys("AH9231");
	    
	      
	      //password xpath
	      MobileElement password = driver.findElementByXPath("//android.widget.EditText[@index='7']");
	      password.click();
	      password.sendKeys("Mukesh123@");
	    
	      
	      MobileElement hidekeyboard = driver.findElementByXPath("//android.widget.ScrollView");
	      hidekeyboard.click();
	      
	      //sing in button xpath
	      MobileElement signin = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Sign in\"]");
	      signin.click();
	      
 
	      MobileElement totp = driver.findElementByXPath("//android.widget.EditText[@index='1']");
	      totp.click();
	      
	      
	      
	      
	      
	      String sharedSecret = "OZ66P33VDDWDA6HJLBLCJAUKUDBYLK7M"; 
	        long time = System.currentTimeMillis() / 1000 / 30; // TOTP has 30-second time steps
	        String counter = Long.toHexString(time).toUpperCase();
	        while (counter.length() < 16) {
	            counter = "0" + counter;
	        }
	        byte[] sharedSecretBytes = new Base32().decode(sharedSecret);
	        byte[] counterBytes = (byte[]) new Hex().decode(counter);
	        byte[] hash = null;

	        // Generate TOTP
	        try {
	            hash = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, sharedSecretBytes).hmac(counterBytes);
	        } catch (Exception e) {
	            // Handle the exception gracefully, for example, by setting a default value for hash
	            System.err.println("Error generating TOTP: " + e.getMessage());
	            // You might choose to set hash to a default value or take alternative action here
	            return; // or throw a custom exception, log, etc., depending on your use case
	        }

	        int offset = hash[hash.length - 1] & 0x0F;
	        int binary = ((hash[offset] & 0x7F) << 24) | ((hash[offset + 1] & 0xFF) << 16) | ((hash[offset + 2] & 0xFF) << 8) | (hash[offset + 3] & 0xFF);
	        int otp = binary % 1000000;
	        String otpCode = Integer.toString(otp);

	        // Use the generated OTP code as needed
	        System.out.println("Generated OTP code: " + otpCode);
	        
	      totp.sendKeys(otpCode);
	      
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
}
