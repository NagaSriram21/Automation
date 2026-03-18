package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker2")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("datepick")));
	   
	    String aMonth=driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/select[1]")).getText();
	    String aYear=driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/select[2]")).getText();
	   
	    while(!(aMonth.equals("April") && aYear.equals("2023")))
	    {
	    	driver.findElement(By.xpath("//a[@title='Show the previous month']")).click();
	    	aMonth=driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/select[1]")).getText();
		    aYear=driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/select[2]")).getText();
	    }
	    
	    //driver.findElement(By.xpath("//div[2]/div/div[2]/div/table/tbody/tr[4]/td[1]/a")).click();

	}

}
