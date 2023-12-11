package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathbyIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		//Un
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg ')])[1]")).sendKeys("Akshay");

		Thread.sleep(2000);
		
		//password
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg ')])[2]")).sendKeys("Nimbokar");
		
		Thread.sleep(2000);
		
		//mobile
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg ')])[3]")).sendKeys("9822068826");
		
		

	}

}
