package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("1234");	    
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();

	}

}
