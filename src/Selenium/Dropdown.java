package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		Select title= new Select(driver.findElement(By.name("title")));
		//Index
		title.selectByIndex(4);
		//Value
		title.selectByValue("Doctor");
		//Visible text
		title.selectByVisibleText("Major");
		// Year
		Select year= new Select(driver.findElement(By.name("year")));
		year.selectByValue("1995");
		// Month
        Select month= new Select(driver.findElement(By.name("month")));
        month.selectByValue("6");
        // Date
        Select date= new Select(driver.findElement(By.name("date")));
        date.selectByValue("21");
        // License Period
        Select License_Period = new Select(driver.findElement(By.id("user_licenceperiod")));
        License_Period.selectByValue("5");
        // Occupation
        Select Occupation= new Select(driver.findElement(By.id("user_occupation_id")));
        Occupation.selectByValue("4");
		
		
	}
}
