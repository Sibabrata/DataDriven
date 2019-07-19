package DataDrivenFramework.DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.XlsxReader;

public class DataDriventest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		XlsxReader reader = new XlsxReader("F:\\Workspace\\DataDriven\\src\\main\\java\\com\\utility\\XlsxReader.java");
		reader.getCellData("TestData", "Email", 2);
		


	}

}
