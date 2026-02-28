package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("C:\\Program Files\\Java\\chromedriver","chromedriver.exe"); 
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
	       driver.manage().window().maximize();
	      
		    WebElement Slider1 =driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		    Actions act = new Actions(driver);
		    Thread.sleep(2000);
		    act.dragAndDropBy(Slider1,-45, 0).perform();
		    
		    WebElement Slider2 =driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		    Actions act1 = new Actions(driver);
		    Thread.sleep(2000);
		    act1.dragAndDropBy(Slider2,175, 0).perform();

	}

}
