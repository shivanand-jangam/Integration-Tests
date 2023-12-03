package base;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	static WebDriver driver;

	public void setDriver(WebDriver dr) {
		driver = dr;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
