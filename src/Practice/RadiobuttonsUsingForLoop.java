package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonsUsingForLoop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> Radio=driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("Number of Radio Buttons :" + Radio.size());
		for(int i=0 ;i<Radio.size();i++) {
			Radio.get(i).click();
		}
		driver.findElement(By.id("vfb-6-2")).click();


	}

}
