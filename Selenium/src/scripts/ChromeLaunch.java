package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeLaunch 
{
		@Test
		public void test() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			driver.close();
		}
}