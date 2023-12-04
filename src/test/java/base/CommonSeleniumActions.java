package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CommonSeleniumActions {

	public CommonSeleniumActions() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public void waitforTime(int time) {
		try {
			Thread.sleep(1000 * time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnElement(WebElement element) {
		try {
			element.click();
			waitforTime(1);
		} catch (Exception e) {
			try {
				waitforTime(1);
				Actions ob = new Actions(DriverManager.getDriver());
				ob.moveToElement(element).click().build().perform();
			} catch (Exception e2) {
				waitforTime(1);
				JavascriptExecutor executor = (JavascriptExecutor) DriverManager
						.getDriver();
				executor.executeScript("arguments[0].click();", element);
				waitforTime(1);
			}
		}
	}

	public void clickOnElement(String byElement) {
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath(byElement));
		try {

			element.click();
			waitforTime(1);
		} catch (Exception e) {
			try {
				Actions ob = new Actions(DriverManager.getDriver());
				ob.moveToElement(element).click().build().perform();
			} catch (Exception e2) {
				JavascriptExecutor executor = (JavascriptExecutor) DriverManager
						.getDriver();
				executor.executeScript("arguments[0].click();", element);
			}
		}
	}

	public boolean isElementDisplayed(WebElement element) {
		boolean isPresent = false;
		try {
			isPresent = element.isDisplayed();
		} catch (Exception e) {
			isPresent = false;
		}
		return isPresent;
	}

	public boolean isElementDisplayed(String element) {
		boolean isPresent = false;
		try {
			isPresent = DriverManager.getDriver().findElement(By.xpath(element))
					.isDisplayed();
		} catch (Exception e) {
			isPresent = false;
		}
		return isPresent;
	}

}
