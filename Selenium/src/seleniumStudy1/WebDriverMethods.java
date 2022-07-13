package seleniumStudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1.get =to enter url in browser
       // driver.get("https://vctcpune.com/");
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        //2.close=to close current tab
       // driver.close();
       
        //3.quite----->to close all open tabs
       // driver.quit();// to check 4th method comm keli
        
        //4.Maximize/Minimize---->used to window operation
        //driver.manage().window().maximize();
       // Thread.sleep(1000);
       // driver.manage().window().minimize();
        
       // 5.navigate
        //  driver. navigate().to("https://mail.google.com/mail/u/0/#inbox");
        //  driver.navigate().forward();
        //  driver.navigate().back();
        //  Thread.sleep(1000);
        //  driver.navigate().refresh();
          
      //  6.getTitle()----->used to get title of webpage.return type of getTitle method is String
          driver.getTitle();
          System.out.println(driver.getTitle());
          String title=driver.getTitle();
          System.out.println("Title is "+title);
          System.out.println("=========================="); 
          
          
       // 7.getCurrentUrl----->is used to get Url of webpage.return type is String
          driver.getCurrentUrl();
          System.out.println(driver.getCurrentUrl());
          String URL=driver.getCurrentUrl();
          System.out.println("Url of web Page is "+URL);
        
	}

}
