package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AceEnquiryForm {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.aceenggacademy.com/courses-enquiry-form/");
		driver.manage().window().maximize();
		// Student Name
		driver.findElement(By.name("field2[]")).sendKeys("Ram");
		// Mobile Number
		driver.findElement(By.name("field7[]")).sendKeys("8765437212");
		// Email
		driver.findElement(By.name("field6")).sendKeys("ram@gamil.com");
		// College Name
		driver.findElement(By.name("field82[]")).sendKeys("Ekhlavya Institute");
		// Program Name
		Select Program = new Select(driver.findElement(By.name("field168")));
		Program.selectByIndex(2);
		// Course 
		Select Course = new Select(driver.findElement(By.name("field169")));
		Course.selectByValue("4");
		// Submit
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
