package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
	    // Switch to the iframe that contains the resizable element
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
        //Resizeable                                               
        WebElement Element =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	    Actions act = new Actions(driver);
	    act.dragAndDropBy(Element,-20,-20).perform();
	    
	    // Optional: wait to see the result
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

}
