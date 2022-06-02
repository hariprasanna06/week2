package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println( driver.findElement(By.id("position")).getLocation().x);
		
		driver.findElement(By.xpath("//button[@id='home']")).click();				
		
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.xpath("(//button[@id='home']//following::button)[2]")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.xpath("(//button[@id='home']/following::button)[3]")).getSize());
		
		
		
		
	}

}
