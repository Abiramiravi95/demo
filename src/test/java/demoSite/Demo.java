package demoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\demosite\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
WebElement from=driver.findElement(By.id("email"));
from.sendKeys("abi");
WebElement to=driver.findElement(By.id("pass"));
to.sendKeys("abi123");
	
	
	}

}
