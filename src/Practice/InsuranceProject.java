package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceProject {

	public static void main(String[] args)  {
		//System.setProperty("C:\\Program Files\\Java\\edgedriver_win32","msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		// Title
		Select title= new Select(driver.findElement(By.name("title")));
		//Index
		title.selectByIndex(4);
		//First Name
		driver.findElement(By.id("user_firstname")).sendKeys("Brad");
		//Surname
		driver.findElement(By.id("user_surname")).sendKeys("Pit");
		//Phone
		driver.findElement(By.id("user_phone")).sendKeys("7654321901");
		// Year
		Select year= new Select(driver.findElement(By.name("year")));
		year.selectByValue("1995");
		// Month
        Select month= new Select(driver.findElement(By.name("month")));
        month.selectByValue("6");
        // Date
        Select date= new Select(driver.findElement(By.name("date")));
        date.selectByValue("21");
        //Radio Button
        driver.findElement(By.id("licencetype_f")).click();
        // License Period
        Select License_Period = new Select(driver.findElement(By.id("user_licenceperiod")));
        License_Period.selectByValue("5");
        // Occupation
        Select Occupation= new Select(driver.findElement(By.id("user_occupation_id")));
        Occupation.selectByValue("4");
        //For Address Street
        driver.findElement(By.id("user_address_attributes_street")).sendKeys("Lane no:1");
        //For city
        driver.findElement(By.id("user_address_attributes_city")).sendKeys("Hyderabad");
        //For Country
        driver.findElement(By.id("user_address_attributes_county")).sendKeys("Bharat");
        //For Post Code
        driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("500018");
        //For Email
        driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("abc@gmail.com");
        //For Password
        driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("abhi@123");
        //For confirm password 
        driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("abhi@123");
        //For create button
        driver.findElement(By.name("submit")).click();
        //For Email
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //For Password
        driver.findElement(By.id("password")).sendKeys("abhi@123");
        //For Login
        driver.findElement(By.name("submit")).click();
        //For Request Quotation
        driver.findElement(By.id("newquote")).click();
       

	}

}
