package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeetCodeFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		WebElement frame1= driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fname")).sendKeys("yeah");
		driver.findElement(By.name("lname")).sendKeys("yeah");
		WebElement innerframe=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.name("email")).sendKeys("@gmail.com");
		driver.switchTo().parentFrame();
		

	}

}
