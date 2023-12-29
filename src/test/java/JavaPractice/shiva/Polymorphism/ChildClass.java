package JavaPractice.shiva.Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildClass extends ParentClass {

	@Override
	public void getProperties() {
		System.out.println("Land,plot and paisa and also car");
	}

	static WebDriver parentDriver;

	public static void main(String[] args) {

		ParentClass parent = new ParentClass();
		parent.getProperties();

		ParentClass p = new ChildClass();
		p.getProperties();
		
		if ("chrome".equals("chrome")) {
			parentDriver = new ChromeDriver();
		} else if ("firefox".equals("firefox")) {
			parentDriver = new FirefoxDriver();
		} else if ("edge".equals("EdgeDriver")) {
			parentDriver = new EdgeDriver();
		}

		parentDriver.get("");

	}
}
