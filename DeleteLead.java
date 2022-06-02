package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
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
		//Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		//Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("7358277851");
		//Click Find Lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click Lead Id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'12525')]")).click();
		//click delete
		driver.findElement(By.linkText("Delete")).click();
		 //Click Find lead 
		 driver.findElement(By.linkText("Find Leads")).click();
		 //Enter captured lead ID 
		 driver.findElement(By.name("id")).sendKeys("11824");
		 //Click find leads button
		 driver.findElement(By.linkText("Find Leads")).click();
		 //Close the page
		 driver.close();
		
		
		
		
	}

}
