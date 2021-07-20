package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void learnLocators() {

		/*
		 * driver.findElement(By.linkText("Link Test : New Page")).click();
		 * driver.findElement(By.partialLinkText("Page Change")).click();
		 */
		
		//using css selector formula to find and replace value by using any one attribute to locate an element
		driver.findElement(By.cssSelector("input#sex-1")).click();
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Pepper");
		driver.findElement(By.cssSelector("Input[name='lastname']")).sendKeys("Woman");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("IronMan");
		//using css selector formula to find and replace value by using multiple attributes to locate an element
		driver.findElement(By.cssSelector("input[name='Password'][type='password']")).sendKeys("IronmanPepperwoman");
		
		
		//xpath formula
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pepper");
		driver.findElement(By.xpath("//input[@name=\"firstname\" and @type=\"text\"]")).sendKeys("Pepper");
		//syntax for xpath links
		driver.findElement(By.xpath("//a[text()='OS-API Product FrontEnd']")).click();
		driver.findElement(By.xpath("//a [contains(text(),'TF-API Product Backend')]")).click();
		
	}

}
