package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathbycontainsusingattribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("Akshay Nimbokar");
		
		driver.findElement(By.xpath("//input[contains(@class,'_6luy _9npi')]")).sendKeys("jaygajanan");

}
}