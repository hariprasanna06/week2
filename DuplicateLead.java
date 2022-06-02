package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {
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
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click Email
		driver.findElement(By.linkText("Email")).click();
		//Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("hariprasa49@gmail.com");
		//Click Find Lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on Lead ID
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'12525')]")).click();
		//CLick Duplicate 
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//get title
		driver.getTitle();
		//Click First Resulting lead
		driver.findElement(By.className("smallSubmit")).click();
		//Verify the title as 'Duplicate Lead'
		System.out.println("//div[text()='Duplicate Lead']");
		//Close the browser
		driver.close();
		
		
		
	}

}
