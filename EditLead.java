package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		//Sleep
		Thread.sleep(3000);
		//Click Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter First Name
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("Sachin");
		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),10705)])")).click();
		//Verify title of the page
		System.out.println(driver.getTitle());
		//Click Edit
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a[3])")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
		//Click Update
		driver.findElement(By.className("smallSubmit")).click();
		//Close the browser
		driver.close();
		
		
		
		
	}

}
