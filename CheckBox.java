package mayweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']//following-sibling::input")).click();
		
		boolean selected2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input")).isSelected();
		System.out.println(selected2);
		
		boolean selected = driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following::input[2]")).isSelected();
		
		System.out.println(selected);
	}

}
