package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));           
	    driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	  
	    WebElement frame1=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	    driver.switchTo().frame(frame1);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("sriram");
	}

}
