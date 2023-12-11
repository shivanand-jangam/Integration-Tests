package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathbyattribute {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Akshay Nimbokar");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jaygajanan");
		
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
