package Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
   	      
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	    Alert ALTWIN=driver.switchTo().alert();
	    Thread.sleep(3000);
	    ALTWIN.sendKeys("Sriram");
	    ALTWIN.accept();
	    Thread.sleep(3000);
   	   
		}

}
