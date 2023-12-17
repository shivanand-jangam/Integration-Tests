package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.safari.SafariDriver;

import utilities.PropertyFileUtil;

public class BrowserFactory {

	PropertyFileUtil propertyFileUtil = new PropertyFileUtil();
	protected WebDriver driver;
	DriverManager driverManager;

	public void openBrowser() {
		String browser = propertyFileUtil.getProperty("browser");
		driverManager = new DriverManager();
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--enable-javascript");
				options.addArguments("--incognito");
				options.addArguments("--disable-extensions");
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("firefox")) {
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("browser.download.folderList", 2);
				profile.setPreference(
						"browser.download.manager.showWhenStarting", false);
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
						"text/csv,application/vnd.ms-excel,application/pdf");
				profile.setPreference(
						"plugin.disable_full_page_plugin_for_types",
						"application/pdf");
				profile.setPreference("pdfjs.disabled", true);
				profile.setAlwaysLoadNoFocusLib(true);
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			} else if (browser.equalsIgnoreCase("Edge")) {
			}
		} catch (Exception exception) {
		}
		driverManager.setDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void navigateToTheUrl() {
		driver.get(propertyFileUtil.getProperty("base.url"));
	}

	public void closeTest() {
		driver.quit();
	}
	
	public void navigateToTheGreenKartUrl() {
		driver.get(propertyFileUtil.getProperty("greenkart.base.url"));
	}
}