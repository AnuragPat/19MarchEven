package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
         Thread.sleep(20000);
         driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
         Thread.sleep(2000);
         WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         boolean result = OTPButton.isEnabled();
         System.out.println("Result is "+result);
}
}
