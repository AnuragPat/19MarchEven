package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	//	1.Identify the list box is handled & store it in ref variable
		        WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		        
    // 2. Create obj of select class which accept webelement as a agrument
		        Select  s=new Select(dropdown);
		        
	// 3.By using one of the select class method we can select values from list box like
		      s.selectByIndex(1);
		      Thread.sleep(500);
		      s.selectByVisibleText("Option3");
		      Thread.sleep(500);
		      s.selectByValue("option2");
	// is Multiple used for my understanding	      
		     boolean selectable = s.isMultiple();
		     System.out.println(selectable);
	}

}
