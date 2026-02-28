package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String WebTable =driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table")).getText();
		System.out.println(WebTable);
		
		String WebTableHead= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]")).getText();
		System.out.println(WebTableHead);


	}

}
