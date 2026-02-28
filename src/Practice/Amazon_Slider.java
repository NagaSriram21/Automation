package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Slider {

	public static void main(String[] args) {
		System.setProperty("C:\\Program Files\\Java\\chromedriver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement SearchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextBox.sendKeys("Iphone 17");
		WebElement SearchButton= driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();
		
		WebElement lowerSlider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
		WebElement upperSlider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Set lower bound to 30 (example)
		js.executeScript(
		    "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", 
		    lowerSlider, "220");

		// Set upper bound to 150 (example)
		js.executeScript(
		    "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", 
		    upperSlider, "0");

		// Click "Go" button
		WebElement goButton = driver.findElement(By.cssSelector("input.a-button-input[aria-label='Go - Submit price range']"));
		goButton.click();

	}

}
