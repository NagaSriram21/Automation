package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobuttons1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(3000);
       WebElement radio3 =driver.findElement(By.id("vfb-7-3"));
       radio3.click();
       Thread.sleep(3000);
       driver.findElement(By.id("vfb-7-2")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("vfb-7-1")).click();
       Thread.sleep(3000);
       WebElement radio2 =driver.findElement(By.id("vfb-7-3"));
       radio2.click();
       Thread.sleep(3000);
       driver.findElement(By.id("vfb-7-1")).click();
       Thread.sleep(3000);
       
       

	}

}
