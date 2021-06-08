package FunctionalTestSuite.DemoBlaze;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	private static final Logger logger = LogManager.getLogger(LoginTest.class.getName());
	  

	@Test
	public void LoginTestValidation() {
		Assert.assertTrue(true);
		System.out.println("Login Test");
		logger.info("Login Test Started");
		logger.error("Error displayed");
		logger.debug("Debugging Started");
		logger.fatal("fatal error");
		logger.trace("Tracing");
		
	}
}
