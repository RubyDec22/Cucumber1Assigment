package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
		public static WebDriver driver;
	
		public static WebDriver initDriver() {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			// driver.get("https://www.techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}

	

	public void takeScreenshot(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File filesource=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
try {
	FileUtils.copyFile(filesource, new File(System.getProperty("user.dir")+ "/screenshot/"+ label +".png"));
} catch (IOException e) {
	e.printStackTrace();
}
	}

	public int generateRandomNumber(int bounderyNumber) {
		Random rnd=new Random();
		return rnd.nextInt(bounderyNumber);
		
	}

}


