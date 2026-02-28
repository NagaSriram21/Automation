package Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// First Name
		driver.findElement(By.id("name")).sendKeys("Abhishek");
		//Email
		driver.findElement(By.id("email")).sendKeys("A@gmail.com");
		//Phone
		driver.findElement(By.id("phone")).sendKeys("9876543212");
		//Address
		driver.findElement(By.id("textarea")).sendKeys("Hyderabad");
		//Gender
		driver.findElement(By.id("male")).click();
		//Days
		//driver.findElement(By.id("sunday")).click();
		List<WebElement> days=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']")); // //input[@type='checkbox' and contains(@class, 'form-check-input')]
		System.out.println(days.size());
		for(int i=0 ;i<days.size();i++) {
			days.get(i).click();
		}
		//Country
		Select Country = new Select(driver.findElement(By.id("country")));
		Country.selectByValue("india");
		//Colors
		Select Colors = new Select(driver.findElement(By.id("colors")));
		Colors.selectByValue("green");
		//Sorted List
		Select Animals = new Select(driver.findElement(By.id("animals")));
		Animals.selectByValue("cheetah");
		
		// Simple Alert 
		driver.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
		driver.switchTo().alert().accept();
		
		// Confirmation Alert
        driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
        driver.switchTo().alert().dismiss();
        
        // Prompt Alert
        driver.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
        Alert ALTWIN =driver.switchTo().alert();
        ALTWIN.sendKeys("Sriram");
        ALTWIN.accept();
        
        //Context Click
        Actions Act= new Actions(driver);
        WebElement PointMe= driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
        Act.contextClick(PointMe).perform();
        driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[2]")).click();
		
        //Double Click
        Actions Act1= new Actions(driver);
        WebElement Double= driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        Act1.doubleClick(Double).perform();
	}
}
