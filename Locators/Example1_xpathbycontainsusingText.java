package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathbycontainsusingText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// click on forget password link
		
		//driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		// click on new create account
		
	 driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		

	}

}
