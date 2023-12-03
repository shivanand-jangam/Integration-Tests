package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {

	static Properties prop = new Properties();

	public PropertyFileUtil() {
		try {
			prop.load(new FileInputStream("project.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PropertyFileUtil(String fileName) {
		try {
			prop.load(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String property) {
		return prop.getProperty(property);
	}

	// public static void main(String[] args) {
	// PropertyFileReader fileReader= new PropertyFileReader();
	// System.out.println(fileReader.getProperty("webdriver.browser"));
	// }

}
