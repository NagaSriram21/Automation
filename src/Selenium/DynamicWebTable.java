package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

        // Total rows (count rows in tbody)
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']//tbody[@id='rows']/tr"));
        System.out.println("Total Rows: " + rows.size());
        
        // Total columns (using header row)
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr[@id='headers']/th"));
        System.out.println("Total Columns: " + columns.size());

        // Get value of a specific cell (e.g., 2nd row, 3rd column: Memory of "System")
        WebElement cell = driver.findElement(By.xpath("//*[@id='rows']/tr[2]/td[3]"));
        String Value= cell.getText();
        System.out.println("Value in 2nd row, 3rd column: " + Value);

	}

}
