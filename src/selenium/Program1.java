package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
	
		//open browser
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//enter application url
		driver.get("https://www.amazon.in/");
		
		//identify webelement
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	
		//perform action
	searchbox.sendKeys("oneplus");
	
	WebElement searchlink=driver.findElement(By.id("nav-search-submit-button"));
	searchlink.click();
		//close driver
		//driver.close();
		//driver.quit();
		
	}

}
