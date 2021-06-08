package FunctionalTestSuite.DemoBlaze;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class HomePage {
	ExtentReports extent;

	@BeforeTest
	public void config() {
		//Extent report and Extent Spark Report
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	
	}
	
	
	
	@Test
	public void HomePageValidation()
	{
		
		ExtentTest test = extent.createTest("Test Report");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kanch\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
		extent.flush();
	}
	
}
