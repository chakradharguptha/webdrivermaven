package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() {
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("chakradharchakri1998@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Chakri@1999");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
