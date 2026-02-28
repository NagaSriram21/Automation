package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons2 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Open the radio buttons practice page
        driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");

        // 3. Locate all radio buttons on the page
        // All radio buttons on this page are input elements of type='radio'
        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Total radio buttons found: " + radios.size());

        // 4. Loop through each radio button and click if enabled
        for (WebElement radio : radios) {
            String id = radio.getAttribute("id");   // just to see which one is clicked
            boolean enabled = radio.isEnabled();

            System.out.println("Radio id = " + id + ", enabled = " + enabled);

            if (enabled) {
                radio.click();
                System.out.println("Clicked: " + id);
                Thread.sleep(1000); // only for demo, remove/replace with explicit wait in real tests
            } else {
                System.out.println("Skipped (disabled): " + id);
            }
        }

        // 5. Close browser
        driver.quit();

	}

}
