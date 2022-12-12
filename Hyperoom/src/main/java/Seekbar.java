import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.List;



public class Seekbar {

	public static String userName = "rishinath.r"; //Enter your LT Username here
    public static String accessKey = "ZLMJ1vrKNiiwSVgTc8KpmMq7Z5Cr5Bakn0vdOnIeD6R19AlAGf"; //Enter your LT AccessKey here

    public String gridURL = "@mobile-hub.lambdatest.com/wd/hub";

    String DeviceValue;
    String versionValue;
    String PlatformValue;
    AppiumDriver driver;

    
    @Test(priority = 1)
    public void AndroidApp1() throws InterruptedException {
    	try {
    		
    		 
    		String device="Galaxy S21 Ultra 5G";
    		String version= "11";
    		String platform= "Android";
    		
    		
    		DeviceValue = device;
            versionValue = version;
            PlatformValue = platform;
    	
            
            
            
            
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("build","ParallelSample Android");
            capabilities.setCapability("name",platform+" "+device+" "+version);
            capabilities.setCapability("deviceName", "Galaxy S21 Ultra 5G");
            capabilities.setCapability("platformVersion","11");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("isRealMobile", true);
            //AppURL (Create from Wikipedia.apk sample in project)
            capabilities.setCapability("app", "lt://APP10160621161670263036453154"); //Enter your app URL from previous step here
       
            capabilities.setCapability("geoLocation", "US");
            capabilities.setCapability("console", true);
            capabilities.setCapability("visual", true);
            capabilities.setCapability("devicelog", true);

            String hub = "https://" + userName + ":" + accessKey + gridURL;
            AppiumDriver driver = new AppiumDriver(new URL(hub), capabilities);

            
            
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/welcome_login")));
            
            
            
            MobileElement LoginLink = (MobileElement) driver.findElementById("com.airgoat.goat:id/welcome_login");
            
            LoginLink.click();
            Thread.sleep(5000);
            
            MobileElement UserName = (MobileElement) driver.findElementById("com.airgoat.goat:id/signInEmailOrUsernameEditText");
            UserName.sendKeys("support@hyperoom.io");
            Thread.sleep(1000);
            
            MobileElement pwd = (MobileElement) driver.findElementById("com.airgoat.goat:id/signInPasswordEditText");
            pwd.sendKeys("AInk_7860");

            Thread.sleep(1000);
            
            MobileElement login = (MobileElement) driver.findElementById("com.airgoat.goat:id/signInButton");
            login.click();


            WebDriverWait wait1 = new WebDriverWait(driver, 30);
            wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/tab_search_id")));
            
MobileElement search = (MobileElement) driver.findElementById("com.airgoat.goat:id/tab_search_id");
            
            search.click();
            
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.airgoat.goat:id/searchSuggestionText")));
           // wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/searchSuggestionText")));
            
            MobileElement searchText = (MobileElement) driver.findElementById("com.airgoat.goat:id/searchSuggestionText");
                        
                        searchText.click();
                        
            
                        
                        
             wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/searchEditText")));
                        
            MobileElement searchField = (MobileElement) driver.findElementById("com.airgoat.goat:id/searchEditText");
            searchField.sendKeys("DH6927-140");           
               
            
            wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/gridItemImage")));
            
            MobileElement item = (MobileElement) driver.findElementById("com.airgoat.goat:id/gridItemImage");
            item.click(); 
            
            
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")));
            
            MobileElement bar = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
            bar.click(); 
            
            
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc=\"Offer\"]/android.widget.TextView")));
            
            MobileElement offer = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Offer\"]/android.widget.TextView");
            offer.click(); 
            
wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/offerTabNewViewButton")));
            
            MobileElement apply = (MobileElement) driver.findElementById("com.airgoat.goat:id/offerTabNewViewButton");
            apply.click();    
            
    Thread.sleep(10000);
		
		
            wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("com.airgoat.goat:id/offerTabNewLastSaleValueText")));
		
		//wait1.until(ExpectedConditions.elementToBeClickable(By.id("com.airgoat.goat:id/offerTabNewLastSaleValueText")));
        
        MobileElement slider = (MobileElement) driver.findElementById("com.airgoat.goat:id/offerTabNewLastSaleValueText");
       
       
        System.out.println("_______________________start value inside_____________________________________________");
		System.out.println( slider.getText());
		
		Point point = slider.getLocation();
		int xcordstart = point.getX();
		int ycordstart = point.getY();
		
		System.out.println("_____________________coordinates_______________________________________________");
		System.out.println(xcordstart);
		System.out.println(ycordstart);
		
		
		List<AndroidElement> profile = driver.findElements(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup"));
		System.out.println(profile.size());
		
		System.out.println("____________________----------_______________________________________");
		
		// get start co-ordinate of seekbar
       // int start=sliderbar.getLocation().getX();
        //Get width of seekbar
      
        //get location of seekbar vertically
        
    // Select till which position you want to move the seekbar
        
        int y= 100;
        
        TouchAction action=new TouchAction(driver);
   
    
    
    
   
    
   
    
    

    action
    .longPress(PointOption.point(xcordstart, ycordstart))
    //.waitAction(WaitOptions.waitOptions(ofSeconds(1)))
    .moveTo(PointOption.point(xcordstart, y))
    .release().perform();


    //Move it will the end
   // action.press(start,y).moveTo(end,y).release().perform();

    //Move it 40%
  //  int moveTo=(int)(end*0.4);
  //  action.press(start,y).moveTo(moveTo,y).release().perform();

          
    driver.quit();

            
        } catch (Exception e) {
            e.printStackTrace();
            try{
                driver.quit();
            }catch(Exception e1){
                e.printStackTrace();
            }
            
            
        }
    	
    }


	
   
  
}
