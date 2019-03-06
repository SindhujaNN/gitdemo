package acadamy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import resources.Base;

public class LandingpageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test()
	public void login() throws IOException {
		driver = initialiser();
		log.info("initialised");
		driver.get(prop.getProperty("url"));

		Homepage hm = new Homepage(driver);
		hm.loginn().click();
		hm.user().sendKeys("sindhu");
		hm.keyword().sendKeys("naveen");
		System.out.println("ghghj");

	}

}
