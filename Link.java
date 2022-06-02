package mayweek2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		
		String title = driver.getTitle();
		String pageTitle ="404 not Found";
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		if(title.equals(pageTitle)) {
			System.out.println("image is broken");
			
		}
		
		
        driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		 
		 List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("numberof links are:"+elements.size());
		
		
		
		
	}

}
