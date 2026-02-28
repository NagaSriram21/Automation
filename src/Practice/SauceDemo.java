package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");		
		driver.manage().window().maximize();
		//Login 
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		// Add to Cart
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();	
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		//to get Price
		WebElement price = driver.findElement(By.xpath("//div[@class='inventory_item_price' and contains(normalize-space(),'29.99')]"));
		System.out.println("Price: " + price.getText());
		//View Cart
		driver.findElement(By.id("shopping_cart_container")).click();
		//Checkout
		driver.findElement(By.id("checkout")).click();
		//CheckOutYourInformation
		driver.findElement(By.id("first-name")).sendKeys("Tony");		
		driver.findElement(By.id("last-name")).sendKeys("Stark");
		driver.findElement(By.id("postal-code")).sendKeys("521001");
		//Continue
		driver.findElement(By.id("continue")).click();
		//Finish
		driver.findElement(By.id("finish")).click();
		//BackHome
		driver.findElement(By.id("back-to-products")).click();
		//Logout
		driver.findElement(By.id("react-burger-menu-btn")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

}
