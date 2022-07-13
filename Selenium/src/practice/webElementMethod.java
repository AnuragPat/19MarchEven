package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
        Thread.sleep(3000);
    //    driver.findElement(By.xpath("(//div[@class='mTxt'])[7]")).click();
        
        driver.findElement(By.id("usernameField")).sendKeys("Sanyogita@123");
        Thread.sleep(1000);
        driver.findElement(By.id("passwordField")).sendKeys("12345");     
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(1000);
     //  driver.close();
       WebElement text = driver.findElement(By.xpath("//strong[text()='New to Naukri?']"));
	    System.out.println(text.getText());
	}

}
