package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
		            boolean result = checkBox1.isSelected();
		            System.out.println("Result is "+result);
		            
		            checkBox1.click();
		            boolean result1 = checkBox1.isSelected();
		            System.out.println("Result1 is "+result1);
	}

}
