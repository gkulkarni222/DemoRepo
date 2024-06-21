package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/GAYATRI/Downloads/UserRegistration.html");
		
		WebElement firstname=driver.findElement(By.id("fname"));
		firstname.sendKeys("Gayatri");
		
		WebElement middlename=driver.findElement(By.xpath("//input[@id='mname']"));
		middlename.sendKeys("Vinayak");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("kulkarni");
		
		WebElement age=driver.findElement(By.id("age"));
		age.sendKeys("22");
		
		//WebElement status=driver.findElement(By.xpath("//option[@value='2']"));
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='marital']"));
		Select select =new Select(dropdown);
		select.selectByVisibleText("Married");
		
		WebElement genderradiobutton=driver.findElement(By.xpath("//input[@value='Female']"));
		genderradiobutton.click();
		
		WebElement subjectcheckbox=driver.findElement(By.xpath("//input[@name='selenium']"));
		subjectcheckbox.click();
		
		WebElement addpicture=driver.findElement(By.xpath("//input[@type='file'and @id='myImagefile']"));
		addpicture.sendKeys("C:\\Users\\GAYATRI\\Pictures\\Saved Pictures\\flower.jpg");
		
		WebElement registerbutton=driver.findElement(By.xpath("//input[@id='Register']"));
		registerbutton.click();
		
		Alert alert=driver.switchTo().alert();
		String alertMess=alert.getText();
		if(alertMess.contains("user registered successfully")){
			alert.accept();
		}else{
			System.out.println("user not registered");
		}
		
	
	}
}
		
	
