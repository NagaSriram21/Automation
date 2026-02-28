package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    WebElement frame1=driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
	    // Before switching
	    System.out.println("Attempting to switch to frame: " +frame1);
	    driver.switchTo().frame(frame1);
	    // After switching
	    System.out.println("Successfully switched to frame: " + frame1);
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("sriram");
	
	    
	}

}
