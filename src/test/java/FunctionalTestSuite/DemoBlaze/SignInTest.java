package FunctionalTestSuite.DemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.SignUp;

public class SignInTest {
	public void signInTestValidation() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanch\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		SignUp si = new SignUp(driver);
		si.signUpLink().click();
		
	}

}
