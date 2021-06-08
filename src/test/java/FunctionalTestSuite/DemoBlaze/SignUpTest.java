package FunctionalTestSuite.DemoBlaze;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
	public static final Logger logger = LogManager.getLogger(LoginTest.class.getName());

	@Test
	public void SignUPTestValidation() {
		
		Assert.assertTrue(true);
		System.out.println("SignInTest");
		logger.error("This is an Error");
		logger.error("This is for trace");
		
		
	}
}
