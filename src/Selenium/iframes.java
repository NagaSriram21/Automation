package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Sriram");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Sriram");
	    driver.switchTo().defaultContent();
	    WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.name("mytext3")).sendKeys("Sriram");
	    driver.switchTo().defaultContent();
	    WebElement frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
	    driver.switchTo().frame(frame4);
	    driver.findElement(By.name("mytext4")).sendKeys("Sriram");
	    driver.switchTo().defaultContent();
	    WebElement frame5=driver.findElement(By.xpath("/html/frameset/frame[2]"));
	    driver.switchTo().frame(frame5);
	    driver.findElement(By.name("mytext5")).sendKeys("Sriram");
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(frame3);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"i21\"]/div[2]")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(frame5);
	    driver.findElement(By.xpath("/html/body/center/a")).click();
	    
	      
	       
      
         
	}

}
