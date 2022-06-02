package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Windows maximize
		driver.manage().window().maximize();
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName
		driver.findElement(By.id("firstNameField")).sendKeys("Hari");
		//Enter FirstNameLocal
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hari");
		// Enter Description
		driver.findElement(By.id("createContactForm_description")).sendKeys("Welcome all!");
		//Enter Description
		driver.findElement(By.id("createContactForm_description")).sendKeys("Read all the instructions below");
		// Enter Last name
		driver.findElement(By.id("lastNameField")).sendKeys("Prasanna M.S");
		//Enter Last name (local)
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Prasanna");
		//Enter department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
		//Enter mail.id
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hariprasa49@gmail.com");
		//Click country
		WebElement findElement3 = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select country = new Select(findElement3);
		country.selectByValue("IND");
		//Sleep
		Thread.sleep(3000);
		// Enter State Provision
		WebElement findElement2 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(findElement2);
		state.selectByValue("IN-TN");
		//Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		//Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		// Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Read all the instructions below");
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// Get the Title of Resulting Page
		System.out.println(driver.getTitle());
		
		
	}

}
