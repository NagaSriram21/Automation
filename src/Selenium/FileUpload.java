package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement singlefileinput=driver.findElement(By.id("singleFileInput"));
		String filepath="C:\\Users\\LVST\\Downloads\\Selenium.png";
		singlefileinput.sendKeys(filepath);

		WebElement multiplefileinput=driver.findElement(By.id("multipleFilesInput"));
		String filepath1="C:\\Users\\LVST\\Downloads\\Selenium.png";
		String filepath2="C:\\Users\\LVST\\Downloads\\Java.png";
		multiplefileinput.sendKeys(filepath1);
		multiplefileinput.sendKeys(filepath2);
		
		
	}

}
