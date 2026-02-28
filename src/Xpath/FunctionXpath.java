package Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FunctionXpath {
	
	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
    driver.get("https://demo.guru99.com/V4/");
    driver.manage().window().maximize();
    
    
}
}