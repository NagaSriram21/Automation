package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.tutorialspoint.com/selenium/practice/resizable.php");
		driver.manage().window().maximize();
		
		// Locate the resizable element
        WebElement resizable = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div"));

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Drag from the bottom-right by (x, y) pixels
        actions.clickAndHold(resizable)
               .moveByOffset(200,100) // increase width and height
               .release()
               .perform();

	}

}
